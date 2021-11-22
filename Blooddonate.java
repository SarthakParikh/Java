public class Blooddonate
{
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);
		
		int b=Integer.parseInt(args[0]);
		if(a>18)
		{
			if(b>50)
			{
				System.out.println("YOU CAN DONATE BLOOD");
			}
			else
			{
					System.out.println("YOU CAN NOT DONATE BLOOD");
			}
		}
		else
			{
					System.out.println("YOU CAN NOT DONATE BLOOD");
			}
		
	}
}

