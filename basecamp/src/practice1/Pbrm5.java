package practice1;



public class Pbrm5
{
	public static void main(String[] args)
	{
		int a[]= {10,12,20,30,25,40,32,31,35,50,60};//30,25,40,32,31,35
		test(a);
	}

	private static void test(int[] a) 
	{
		int start=3;
		int end=a.length-start;
		for (int i = start; i <= end; i++) 
		{
			System.out.print(a[i]+" ");
		}
		
		
	}

}
