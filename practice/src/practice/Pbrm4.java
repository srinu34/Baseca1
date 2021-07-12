package practice;


public class Pbrm4 
{
	public static void main(String[] args)
	{
		int a[]= {12,11,13,5,6};
		test(a);
	}

	private static void test(int[] a)
	{
		
		for (int i = 1; i < a.length; i++) 
		{
			int temp=a[i];
			int j=i-1;
			while(j>=0 && a[j]>temp)
			{
				a[j+1]=a[j];
				j--;
			}
		 a[j+1]=temp;
		}
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
			
		}
	}

}
