import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.Date;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;


public class Main{
	public static void main(String args[]){
		final String BEINGS_FILE = "Beings.txt";
		final String PRODUCTS_FILE = "Products.txt";
		final String SALES_FILE = "Sales.txt";
		
		ReaderFromFiles readerFromFiles = new ReaderFromFiles(BEINGS_FILE, PRODUCTS_FILE, SALES_FILE);
		ArrayList<Being> beingList = readerFromFiles.readBeingsIntoArrayList();
		
		ArrayList<Product> productsList = readerFromFiles.readProductsIntoArrayList();
		
		System.out.print("Please give the number of golden tickets: ");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		ArrayList <GoldenTicket> ticketsList = generateGoldenTickets(i);
		
		listAllGoldenTickets(ticketsList);
		raffleTickets(ticketsList, productsList);
		listRaffledTickets(ticketsList);
		
		OompaLoompaSong song = new OompaLoompaSong(5);
		System.out.println(song.sing());
		
		ArrayList<Sale> salesList = readerFromFiles.readSalesIntoArrayList();
		for(Sale sale : salesList){
			registerSale(sale.getCode(), sale.getBarcode(), productsList, beingList);
		}
		
		try{
			listWinners(beingList);
		}catch(FileNotFoundException|UnsupportedEncodingException e){}
		
	}
	
	//Register Prize tickets
	public static ArrayList<GoldenTicket> generateGoldenTickets(int n){
		ArrayList <GoldenTicket> ticketsList = new ArrayList<>();
		
		Random rand = new Random();
		for(int i=0; i<n; i++){
			GoldenTicket goldenTicket = new GoldenTicket(String.valueOf(rand.nextInt(200) + 100), new Date());
			ticketsList.add(goldenTicket);
		}
		
		return ticketsList;
	}
	
	//List all prize tickets
	public static void listAllGoldenTickets(ArrayList<GoldenTicket> ticketsList){
		System.out.println("The List of golden tickets: ");
		for(GoldenTicket goldenTicket : ticketsList){
			System.out.println("Code: " + goldenTicket.getCode() + " Raffled: " + goldenTicket.getRaffled());
		}
	}
	
	//List only raffled tickets
	public static void listRaffledTickets(ArrayList<GoldenTicket> ticketsList){
		System.out.println("The List of RAFFLED golden tickets: ");
		for(GoldenTicket goldenTicket : ticketsList){
			if(goldenTicket.isRaffled()){
				System.out.println("Code: " + goldenTicket.getCode() + " Raffled: " + goldenTicket.getRaffled());
			}
		}
	}
	
	//Raffle tickets
	public static void raffleTickets(ArrayList<GoldenTicket> ticketsList, ArrayList<Product> productsList){
		Random rand = new Random();
		for(int i=0; i < ticketsList.size(); i++){
			int index = rand.nextInt(productsList.size());
			if(!ticketsList.get(i).isRaffled()){
				if(productsList.get(index).getGoldenTicket() == null){
					productsList.get(index).setGoldenTicket(ticketsList.get(i));
					ticketsList.get(i).setWasRaffled(true);
				}else{
					i--;
				}
			}
		}
	}
	
	//Register sale
	public static void registerSale(int code, long barcode, ArrayList<Product> productsList, ArrayList<Being> beingList){
		for(int i=0; i<beingList.size(); i++){
			if(beingList.get(i) instanceof Kid && beingList.get(i).getCode() == code){
				for(Product product : productsList){
					if(product.getBarcode() == barcode){
						beingList.get(i).addToProductList(product);
						product.setBarcode(0);
					}
				}	
			}
		}
	}
	
	//List winners
	public static void listWinners(ArrayList<Being> beingList) throws FileNotFoundException, UnsupportedEncodingException{
		PrintWriter writer = new PrintWriter("ListOfWinners.txt", "UTF-8");
		for(Being being : beingList){
			if(being instanceof Kid){
				for(Product product: being.getProductList()){
				if(product.getGoldenTicket() != null){
					System.out.println(being.getName() + " with code " + being.getCode() + " has won the Golden Ticket!");
					writer.println(being.getName() + " with code " + being.getCode() + " has won the Golden Ticket!");
				}
			}
			}
		}
		writer.close();
	}
}		