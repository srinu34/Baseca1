package insurance;

public class Insurance 
{
	//id,number,type,premimumfee,premimummode
	private byte id;
	private int number;
	private String type;
	private double premimumfee;
	private String premimummode;
	
	public Insurance() 
	{
		super();
	}

	public Insurance(byte id, int number, String type, double premimumfee, String premimummode)
	{
		super();
		this.id = id;
		this.number = number;
		this.type = type;
		this.premimumfee = premimumfee;
		this.premimummode = premimummode;
	}

	public byte getId() {
		return id;
	}

	public void setId(byte id) {
		this.id = id;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPremimumfee() {
		return premimumfee;
	}

	public void setPremimumfee(double premimumfee) {
		this.premimumfee = premimumfee;
	}

	public String getPremimummode() {
		return premimummode;
	}

	public void setPremimummode(String premimummode) {
		this.premimummode = premimummode;
	}

}
