package mobile;

public class Mobile 
{
	//id,model,price,dateofmanufacture
	private int id;
	private String model;
	private double price;
	private String dateofmanufacture;
	
	public Mobile() {
		super();
	}

	public Mobile(int id, String model, double price, String dateofmanufacture) {
		super();
		this.id = id;
		this.model = model;
		this.price = price;
		this.dateofmanufacture = dateofmanufacture;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDateofmanufacture() {
		return dateofmanufacture;
	}

	public void setDateofmanufacture(String dateofmanufacture) {
		this.dateofmanufacture = dateofmanufacture;
	}
	
	

}
