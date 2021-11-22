public class Sum2
{
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		
		
		if(c==1)
		{
		System.out.println(a+b);
		}
		else{
		if(c==2)
		{
		System.out.println(a-b);
		
		}
		if(c==3)
		{
		System.out.println(a*b);	
		}
		else
		{
		if(c==4)
		{
		System.out.println(a/b);	
		}
		else{
		System.out.println("ENTER RIGHT CHOICE ");	
		}
		}
		}
		

	
	}
}