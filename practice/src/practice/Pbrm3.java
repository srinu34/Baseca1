package practice;



public class Pbrm3 
{
	public static void main(String[] args)
	{
		int a[][]= {{17,89,34},//1,8,10
				    {5,8,10},//  5,89,19
				   {1,100,19}};//17,100,34
		test(a);
		}

	private static void test(int[][] a) 
	{
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length; j++) 
			{
				
				for (int j2 = j; j2 < a.length; j2++) 
				{
		          if(a[j][i]>a[j2][i])
		          {
					int t=a[j][i];
					a[j][i]=a[j2][i];
					a[j2][i]=t;
				}
				}
			}
			
		}
		for (int i = 0; i < a.length; i++) 
		{
			for (int k = 0; k < a.length; k++)
			{
			System.out.print(a[i][k]+" ");
			}
			System.out.println();
		}
		
	}
	}


