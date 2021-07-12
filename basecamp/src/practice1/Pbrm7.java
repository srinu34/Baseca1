package practice1;



public class Pbrm7 
{
	public static void main(String[] args)
	{
		int m1[][]= {{1,2,4},
				    {3,5,6},
				    {7,8,9}};
		test(m1);
		}

	private static void test(int[][] m1) 
	{
		int sum=0,count=0;
		for (int i = 0; i < m1.length; i++) 
		{
			if(m1[i][i]%2==1)
			{
				sum=sum+m1[i][i];
				count++;
			}
			
		}
		int sum1=0,count1=0;
		for (int i = 0; i < m1.length; i++) 
		{
			for (int j = 0; j < m1[i].length; j++)
			{
			if(i+j==3-1)
			{
				if(m1[i][j]%2==1)
				{
					sum1=sum1+m1[i][j];
					count1++;
				}
			}
			
		}
		}
		System.out.println("Primary Diagonal Matrix=="+sum/count);
		System.out.println("Secondary Diagonal Matrix=="+sum1/count1);
			
	}
}

