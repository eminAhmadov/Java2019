import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReaderFromFiles{
	String beingsFile;
	String productsFile;
	String salesFile;
	
	public ReaderFromFiles(String beingsFile, String productsFile, String salesFile){
		this.beingsFile = beingsFile;
		this.productsFile = productsFile;
		this.salesFile = salesFile;
	}
	
	public ArrayList<Being> readBeingsIntoArrayList(){
		ArrayList<Being> beingList = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(beingsFile)))
        {
            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
                String[] data = sCurrentLine.split(";");
				if(data[0].contains("K")){
					Kid kid = new Kid(Integer.parseInt(data[1]), data[2], data[3], new ArrayList<Product>());
					beingList.add(kid);
				}else if(data[0].contains("O")){
					OompaLoompa oompaLoompa = new OompaLoompa(Integer.parseInt(data[1]), data[2], Integer.parseInt(data[3]), data[4]);
					beingList.add(oompaLoompa);
				}
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
		
		return beingList;
	}
	
	public ArrayList<Product> readProductsIntoArrayList(){
		ArrayList<Product> productsList = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(productsFile)))
        {
            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
                String[] data = sCurrentLine.split(";");
				Product product = new Product(data[0], Long.parseLong(data[1]), data[2], null);
				productsList.add(product);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
		
		return productsList;
	}
	
	public ArrayList<Sale> readSalesIntoArrayList(){
		ArrayList<Sale> salesList = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(salesFile)))
        {
            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
                String[] data = sCurrentLine.split(";");
				Sale sale = new Sale(Integer.parseInt(data[0]), Long.parseLong(data[1]));
				salesList.add(sale);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
		
		return salesList;
	}
}