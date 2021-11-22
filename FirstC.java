import java.util.*;
class FirstC extends FirstB{
	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER NO 1:");
		int a=s.nextInt();
		System.out.println("ENTER NO 2:");
		int b=s.nextInt();
		FirstC c=new FirstC();
		c.print2(a,b);
		c.print1(a,b);
		int d=c.print1();
		int e=c.print2();
		
		System.out.println("SUB IS:"+d);
		System.out.println("SUM IS:"+e);

		
	
	}
	
	}