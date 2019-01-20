public abstract class Being{
	
	private int code;
	private String name;
	
	public Being(int code,String name){
		this.code = code;
		this.name = name;
	}
	
	public void setCode(int code){
		this.code = code;
	}
	public int getCode(){
		return code;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
}