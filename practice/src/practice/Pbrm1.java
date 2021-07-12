

package practice;

public class Pbrm1 
{
	public static void main(String[] args)
	{
		String s="cricket";
		test(s);
	}
		public static void test(String s)
		{
			char a[]=s.toCharArray();
		for (int i = 0; i < s.length(); i++)
		{
     	boolean unique=true;
			for (int j =i+1; j < s.length(); j++) 
			{
				if(a[i]==a[j] && i!=j)
				{
					//System.out.print(a[i]);
					unique=false;
					break;
			     }
				}
			if(unique==true)
			{
				System.out.print(a[i]);
				break;
			}
		}
	}
  }

