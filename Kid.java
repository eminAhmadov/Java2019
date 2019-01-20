import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Kid extends Being{
	private Date birthday;
	private ArrayList<Product> arrayList= new ArrayList<Product>();
	
	private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
	
	public Kid(){}
	
	public Kid(int code, String name, String birthday, ArrayList<Product> arrayList){
		super(code, name);
		try {
			this.birthday = dateFormat.parse(birthday);
		}catch (java.text.ParseException e){}
		
		this.arrayList = arrayList;
	}
	
	
	public String getBirthday(){
		return dateFormat.format(birthday);
	}
	public void setBirthday(String birthday){
		try {
			this.birthday = dateFormat.parse(birthday);
		}catch (java.text.ParseException e){}
	}
	
	public ArrayList<Product> getProductList(){
		return new ArrayList<Product>(arrayList);
	}
	public void setArrayList(ArrayList<Product> arrayList){
		this.arrayList = arrayList;
	}
}