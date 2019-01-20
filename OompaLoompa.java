public class OompaLoompa extends Being{
	private int height;
	private String favoriteFood;
	
	public OompaLoompa(){}
	
	public OompaLoompa(int code, String name, int height, String favoriteFood){
		super(code, name);
		this.height = height;
		this.favoriteFood = favoriteFood;
	}
	
	public void setHeight(int height){
		this.height = height;
	}
	public int getHeight(){
		return height;
	}
	public void setFavoriteFood(){
		this.favoriteFood = favoriteFood;
	}
	public String getFavoriteFood(){
		return favoriteFood;
	}
	
}