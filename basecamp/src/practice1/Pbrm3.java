package practice1;

public class Pbrm3 
{
	public static void main(String[] args)
	{
		int a[]= {9,2,89,7,15};//9,2,89,7,15//2,7,9,15,89//prime{2,7,89}
		test(a);
		
	}

	private static void test(int[] a) 
	{
		for (int i = 0; i < a.length-1; i++) 
		{
			for (int j = 0; j < a.length-1-i; j++) 
			{ 
				if(a[j]>a[j+1])
				{
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
				
			}
			
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		
			
		}
		System.out.println();
		prime(a);
		
	}
	public static void prime(int []b)
	{
		
		for (int i = 0; i < b.length; i++) 
		{
			int c=0;
			for (int j = 2; j < b[i]-1; j++) 
			{
				if(b[i]%j==0)
				{
				c++;
				}
			}
			if(c==0)
			{
				System.out.print(b[i]+" ");
			}
		}
	}
	

}
