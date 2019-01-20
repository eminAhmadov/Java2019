package assignment;

import java.util.Date;

public class GoldenTicket{
	private String code;
	private Date raffled;
	boolean wasRaffled = false;
	
	public GoldenTicket(){}
	
	public GoldenTicket(String code, Date raffled){
		this.code = code;
		this.raffled = raffled;
	}

	public void setCode(String code){
		this.code = code;
	}
	public String getCode(){
		return code;
	}
	
	public void setRaffled(Date raffled){
		this.raffled = raffled;
	}
	public Date getRaffled(){
		return raffled;
	}
	
	public void setWasRaffled(boolean wasRaffled){
		this.wasRaffled = wasRaffled;
	}
	public boolean isRaffled(){
		return wasRaffled;
	}
}