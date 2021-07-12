package practice1;



public class Pbrm6 
{
	public static void main(String[] args)
	{
		String s="i am good boy";//i an gooe boz
		test(s);
	}

	private static void test(String s)
	{
		
		String s1="";
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='0' || s.charAt(i)=='u')
			{
				if(s.charAt(i+1)!='a' && s.charAt(i+1)!='e'&&s.charAt(i+1)!='i'&&s.charAt(i+1)!='0' && s.charAt(i+1)!='u')
				{
					char c=s.charAt(i+1);
				         c++;
				         s1=s1+s.charAt(i)+c;
				         i=i+1;
				}
				else
				{
					s1=s1+s.charAt(i);
				}
			}
			else
			{
				s1=s1+s.charAt(i);
				
			}
		}
		System.out.println(s1);
	}

}
