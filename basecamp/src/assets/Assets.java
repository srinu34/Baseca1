package assets;

public class Assets 
{
	//sno,model,allottedmonth,quantity
	private int sno;
	private String model;
	private String allottedmonth;
	private int quantity;
	
	public Assets() {
		super();
	}
	public Assets(int sno, String model, String allottedmonth, int quantity) {
		super();
		this.sno = sno;
		this.model = model;
		this.allottedmonth = allottedmonth;
		this.quantity = quantity;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getAllottedmonth() {
		return allottedmonth;
	}
	public void setAllottedmonth(String allottedmonth) {
		this.allottedmonth = allottedmonth;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	

}
