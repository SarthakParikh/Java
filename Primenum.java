public class Primenum
{
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);
		int i,flage=0;
		for(i=2;i<=a;i++)
		{
			if(a%2==0){
				System.out.println("not prime");
				flage=1;
				break;
			}
		}
		if(flage==0)
		{
			System.out.println("prime");
		}
		
		
		
		
	}
}

