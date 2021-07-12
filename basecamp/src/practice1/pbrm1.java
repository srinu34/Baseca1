package practice1;

public class pbrm1 
{
	public static void main(String[] args)
	{
		int a[][]= {{1,1,1,0,1,1,1},
				    {1,1,0,0,0,1,1},
				    {1,0,0,0,0,0,1},
				    {0,0,0,0,0,0,0},
				    {1,0,0,0,0,0,1},
				    {1,1,0,0,0,1,1},
				    {1,1,1,0,1,1,1}};
		test(a);
	}

	private static void test(int[][] a) 
	{
		//char c='a';
		for (int row= 0; row < a.length; row++)
		{
		
			for (int col = 0; col < a[row].length; col++) 
			{
				if(a[row][col]==1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				
				}
			}
			System.out.println();
		}
		
		
	}

}
