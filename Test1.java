import java.util.*;
class Test1
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER NUMBER U WANT TO ENTER:");
		int b=s.nextInt();
		int a[]=new int[5];
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter Data:");
			int a[i]=s.nextInt();
		}
	
		for(int i=0;i<5;i++)
		{
			System.out.println("YOur Data:"+a[i]);
			
		}
	}
	
}