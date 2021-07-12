package practice1;



public class Pbrm8 
{
	public static void main(String[] args)
	{
		String[] s= {"apple","mango","banana"};
		String s1="mango";
		boolean b=test(s,s1);
	    System.out.println(b);
	    
		String[] t1= {"apple","Mango","banana"};
		String t2="mango";  
	    boolean b1=test(t1,t2);
	    System.out.println(b1);
	    
	}
	public static boolean test(String[] s,String s1)
	{
		for (int i = 0; i < s.length; i++) 
		{
			if(s[i].equals(s1))
			{
				return true;
			}
			
		}
		return false;
		
	}

}
