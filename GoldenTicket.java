import java.util.Date;

public class GoldenTicket{
	private String code;
	private Date raffled;
	boolean wasRaffled = false;
	
	//Constructors:
	public GoldenTicket(){}
	
	public GoldenTicket(String code, Date raffled){
		this.code = code;
		this.raffled = raffled;
	}

	// Getters and Setters
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
	// If the current ticket has been already raffled
	public boolean isRaffled(){
		return wasRaffled;
	}
}