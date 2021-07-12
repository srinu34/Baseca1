package practice1;


public class Pbrm4 
{
	//input: string
	//output: string
	//process:1.start;
	//        2.declare the two string variable with empty string and creating the new string[] array with initial size
	//        3.if >=index 0 to string.length() not equal to space add to the characters to new string 
	//           else>=the new string words assign to new string[] array and increasing the length next assigned string is empty
	//        4.if>=index 1 t0 length check the odd or even assign to new empty string
	//        5.print the new assigned string
	//        6.stop.
	public static void main(String[] args)
	{
		String s="orchard is best place";
		s=s+" ";
		String s1=" ";
		String s3=" ";
		
		String s2[]=new String[50];
		int length=1;
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
	
		for (int i = 1; i <length; i++) 
		{
			if(i%2==0 && i!=0)
			{
				for (int j = s2[i].length()-1; j>=0; j--)
				{
					s3=s3+s2[i].charAt(j);
					
				}
				s3=s3+" ";
			}
			else
			{
				for (int j = 0; j <= s2[i].length()-1; j++)
				{
					s3=s3+(char)(s2[i].charAt(j)+1);
				
				}
				s3=s3+" ";
			}
		}
		System.out.println(s3);
   }
  }

