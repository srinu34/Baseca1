package hospital;

public class Patients
{  
	//name, numberofdaysadmitted, illnessoccurred, billamount, doctortreated

  private String name;
  private int numberofdaysadmitted;
  private String illnessoccurred;
  private double billamount;
  private String doctortreated;
  
  
public Patients()
{
	super();
}


public Patients(String name, int numberofdaysadmitted, String illnessoccurred, double billamount,
		String doctortreated)
{
	super();
	
	this.name = name;
	this.numberofdaysadmitted = numberofdaysadmitted;
	this.illnessoccurred = illnessoccurred;
	this.billamount = billamount;
	this.doctortreated = doctortreated;
}


public String getName() 
{
	return name;
}


public void setName(String name)
{
	this.name = name;
}

public int getNumberofdaysadmitted() 
{
	return numberofdaysadmitted;
}


public void setNumberofdaysadmitted(int numberofdaysadmitted) 
{
	this.numberofdaysadmitted = numberofdaysadmitted;
}


public String getIllnessoccurred()
{
	return illnessoccurred;
}


public void setIllnessoccurred(String illnessoccurred)
{
	this.illnessoccurred = illnessoccurred;
}


public double getBillamount() 
{
	return billamount;
}


public void setBillamount(double billamount) 
{
	this.billamount = billamount;
}


public String getDoctortreated()
{
	return doctortreated;
}


public void setDoctortreated(String doctortreated) 
{
	this.doctortreated = doctortreated;
}

  
  
}
