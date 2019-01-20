package assignment;

import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Kid extends Being{
	private Date birthday;
	private ArrayList<Product> listOfProducts= new ArrayList<Product>();
	
	private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
	
	public Kid(){}
	
	public Kid(int code, String name, String birthday, ArrayList<Product> listOfProducts){
		super(code, name);
		try {
			this.birthday = dateFormat.parse(birthday);
		}catch (java.text.ParseException e){}
		
		this.listOfProducts = listOfProducts;
	}
	
	public String getBirthday(){
		return dateFormat.format(birthday);
	}
	public void setBirthday(String birthday){
		try {
			this.birthday = dateFormat.parse(birthday);
		}catch (java.text.ParseException e){}
	}
	
	@Override
	public ArrayList<Product> getProductList(){
		return new ArrayList<Product>(listOfProducts);
	}
	public void setArrayList(ArrayList<Product> listOfProducts){
		this.listOfProducts = listOfProducts;
	}
	
	@Override
	public void addToProductList(Product product){
		listOfProducts.add(product);
	}
}