package practice1;

import java.util.Iterator;

public class Pbrm2 
{
	public static void main(String[] args)
	{
		int []Array1= {10,67,1};//-6.59.-89//-6,-89
		int []Array2= {16,8,90};
		test(Array1,Array2);
	}
	public static void test(int[] a,int[] b)
	{
		int res[]=new int[a.length];
		for (int i = 0; i < res.length; i++) 
		{
			res[i]=a[i]-b[i];
			System.out.print(res[i]+" ");
		}
		System.out.println();
		
		for (int i = 0; i < res.length; i++) 
		{
			if(res[i]<0)
			{
				System.out.print(res[i]+" ");
			}
			
		}
		
	}
}
