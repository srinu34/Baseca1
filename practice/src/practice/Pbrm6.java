package practice;



public class Pbrm6
{
	public static void main(String[] args)
	{
		String s="welcome_to_java_programming";//gnimmargorp_tP_jBvB_emoclew
		s=s+"_";
		String last="";
		String first="";
		String middle=" ";
	
		String s1="";
		String s2[]=new String[50];
		int length=0;
		String result="";
		
		for (int i = 0; i <s.length(); i++) 
		{
			if(s.charAt(i)!='_')
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
		
		for (int i = 0; i < length; i++) 
		{
			System.out.println(s2[i]);
			
		}
		for (int i = 0; i < length; i++) 
		{
		    if(i==0)
		    {
				for (int j = s2[i].length()-1; j>=0 ; j--) 
				{
					last=last+s2[i].charAt(j);
					
				}
				last=last+"_";
		    }
		    else if(i==length-1)
		    {
		    	for (int j = s2[i].length()-1; j>=0; j--)
		    	{
		    		first=first+s2[i].charAt(j);
					
				}
		    	first=first+"_";
		    }
		    else if(i!=0 && i!=length-1)
		    {
		    	for (int j = 0; j < s2[i].length(); j++) 
		    	{
		    		if(s2[i].charAt(j)=='a' || s2[i].charAt(j)=='e' || s2[i].charAt(j)=='o'|| s2[i].charAt(j)=='i'|| s2[i].charAt(j)=='u')
		    		{
		    			middle=middle+(char)(s2[i].charAt(j)-31);
		    		}
		    		else if(s2[i].charAt(j)=='A' || s2[i].charAt(j)=='E' || s2[i].charAt(j)=='O'|| s2[i].charAt(j)=='I'|| s2[i].charAt(j)=='U')
		    		{
		    			middle=middle+(char)(s2[i].charAt(j)-33);
		    		}
		    		else
		    		{
		    			middle=middle+s2[i].charAt(j);
		    		}
		    		
				}
		    	middle=middle+"_";
		    }
			
		}
		System.out.println();
		result=first+middle+last;
		System.out.println(result);
	}
}
