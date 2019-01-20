package assignment;

public class Product{
	private String description;
	private long barcode;
	private String serialNumber;
	private GoldenTicket priceTicket;
	
	public Product(){}
	
	public Product(String description, long barcode,
					String serialNumber, GoldenTicket priceTicket){
		this.description = description;
		this.barcode = barcode;
		this.serialNumber = serialNumber;
		this.priceTicket = priceTicket;
	}
	
	public void setDescription(String description){
		this.description = description;
	}
	public String getDescription(){
		return description;
	}
	
	public void setBarcode(long barcode){
		this.barcode = barcode;
	}
	public long getBarcode(){
		return barcode;
	}
	
	public void setSerialNumber(String serialNumber){
		this.serialNumber = serialNumber;
	}
	public String getSerialNumber(){
		return serialNumber;
	}
	
	public void setGoldenTicket(GoldenTicket priceTicket){
		this.priceTicket = priceTicket;
	}
	public GoldenTicket getGoldenTicket(){
		return priceTicket;
	}
}