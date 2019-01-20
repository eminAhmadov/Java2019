public class Sale{
	private int code;
	private long barcode;
	
	public Sale(int code, long barcode){
		this.code = code;
		this.barcode = barcode;
	}
	
	public void setCode(int code){
		this.code = code;
	}
	public int getCode(){
		return code;
	}
	
	public void setBarcode(long barcode){
		this.barcode = barcode;
	}
	public long getBarcode(){
		return barcode;
	}
}