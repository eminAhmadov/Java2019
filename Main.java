import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.Date;


public class Main{
	public static void main(String args[]){
		
		Kid kid1 = new Kid(111, "Cody" , "1998.29.01", new ArrayList<Product>());
		Kid kid2 = new Kid(222, "Tuzik" , "1998.29.03", new ArrayList<Product>());
		Kid kid3 = new Kid(333, "Decoy" , "1998.29.04", new ArrayList<Product>());
		Kid kid4 = new Kid(444, "Flash" , "1998.29.05", new ArrayList<Product>());
		Kid kid5 = new Kid(555, "Forrest" , "1998.29.06", new ArrayList<Product>());
		Kid kid6 = new Kid(666, "Pizza" , "1998.29.07", new ArrayList<Product>());
		
		OompaLoompa op1 = new OompaLoompa(777, "Name1", 123, "Food1");
		OompaLoompa op2 = new OompaLoompa(888, "Name2", 124, "Food2");
		
		ArrayList <Being> beingList = new ArrayList<>();
		beingList.add(kid1);
		beingList.add(kid2);
		beingList.add(kid3);
		beingList.add(kid4);
		beingList.add(kid5);
		beingList.add(kid6);
		beingList.add(op1);
		beingList.add(op2);
		
		Product product1 = new Product("Chocolate1", 988551, "Copy1", null);
		Product product2 = new Product("Chocolate2", 988552, "Copy2", null);
		Product product3 = new Product("Chocolate3", 988553, "Copy3", null);
		Product product4 = new Product("Chocolate4", 988554, "Copy4", null);
		Product product5 = new Product("Chocolate5", 988555, "Copy5", null);
		Product product6 = new Product("Chocolate6", 988556, "Copy6", null);
		Product product7 = new Product("Chocolate7", 988557, "Copy7", null);
		Product product8 = new Product("Chocolate8", 988558, "Copy8", null);
		Product product9 = new Product("Chocolate9", 988559, "Copy9", null);
		Product product10 = new Product("Chocolate10", 988510, "Copy10", null);
		
		ArrayList <Product> productsList = new ArrayList<>();
		
		productsList.add(product1);
		productsList.add(product2);
		productsList.add(product3);
		productsList.add(product4);
		productsList.add(product5);
		productsList.add(product6);
		productsList.add(product7);
		productsList.add(product8);
		productsList.add(product9);
		productsList.add(product10);
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		ArrayList <GoldenTicket> ticketsList = generateGoldenTickets(i);
		
		listAllGoldenTickets(ticketsList);
		
		
		
		
		
		
	}
	
	public static ArrayList<GoldenTicket> generateGoldenTickets(int n){
		//GoldenTickets tickets1 = new GoldenTickets();
		//GoldenTickets tickets2 = new GoldenTickets();
		//GoldenTickets tickets3 = new GoldenTickets();
		
		ArrayList <GoldenTicket> ticketsList = new ArrayList<>();
		
		Random rand = new Random();
		for(int i=0; i<n; i++){
			GoldenTicket goldenticket = new GoldenTicket(String.valueOf(rand.nextInt(200) + 100), new Date());
			ticketsList.add(goldenticket);
		}
		
		return ticketsList;
		
	}
	
	
	public static void listAllGoldenTickets(ArrayList<GoldenTicket> ticketsList){
		System.out.println("The List of golden tickets: ");
		for(GoldenTicket goldenticket : ticketsList){
			System.out.println("Code: " + goldenticket.getCode() + " Raffled: " + goldenticket.getRaffled());
		}
	}
	
	
}		