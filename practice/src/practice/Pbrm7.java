package practice;



public class Pbrm7 
{
	public static void main(String[] args)
	{
		String s="hello world";//wrd he
		s=s+" ";
		test(s);
		
	}

	private static void test(String s) 
	{
		String s2[]=new String[50];
		int length=0;
		String s1="";
		String st="";
		String result="";
		
		for (int i = 0; i <s.length(); i++) 
		{
			if(s.charAt(i)!=' ')
			{
				s1=s1+s.charAt(i);
			}
		 else
		   {
	
		   s2[length]=s1;
		    length++;
		   s1="";
	       } 
        }
		for (int i = 0; i < length; i++)
		{
			System.out.println(s2[i]);
			
		}
		
		for (int i = 0; i <=length; i++) 
		{
			int c=0;
			for (int j = 0; j <= length; j++) 
			{
				if(s2[i].charAt(j)==s2[i].charAt(j) )
				{
			c++;
					System.out.print(s2[i].charAt(j));
				}
				
			}
			if(c==0)
			{
				System.out.print(s.charAt(i));
			}
		}
		
		
	}

}
