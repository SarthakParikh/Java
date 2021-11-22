public class Bigno
{
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[0]);
		int c=Integer.parseInt(args[0]);
		
		int i;
		if(a>b & a>c)
		{
		System.out.println("a is big");
		}
		else
		{
			if(b>a & b>c)
				{
					System.out.println("b is big");
				}
				else
				{
					System.out.println("c is big");
				}
		}
		
	}
}

