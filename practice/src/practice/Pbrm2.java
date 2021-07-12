package practice;

public class Pbrm2 
{
	public static void main(String[] args)
	{
	//mindtree WebTech
	//mindtree WTebech
	String s="mindtree WebTech";
	test(s);
	}
	public static void test(String s)
	{
	String up=" ";
	String low="";
	String s1="";
	String s2="";
	
	int len=s.length();
	char ch;
	for (int i = 0; i < len; i++) 
	{
	ch=s.charAt(i);
	
	if(ch==' ')
	{
		  String up1="";
		  String low1="";
	    for (int j = i; j < len; j++)
     	{	
	    
		char ch1=s.charAt(j);	
	
		if(ch1>='A' && ch1<='Z')
		{
			up1+=ch1;
		}
		else
		{
			low1+=ch1;
		}
		
	}
	    s1=up1+low1;
	    s2=up+low;
	    s2=s2+" "+s1;
    }
	else
   {
	 if(ch>='A' && ch<='Z')
		{
			up+=ch;
		}
		else
		{
			low+=ch;
		}	
	 }
	}
	System.out.println(s2);
	}
}
