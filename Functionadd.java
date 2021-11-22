import java.util.*;
class Functionadd
{
	void num()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("no 1:");
		int a=s.nextInt();
		System.out.println("no 1:");
		int b=s.nextInt();
		int c=a+b;
		System.out.println("SUM IS:"+c);
		int d=a-b;
		System.out.println("SUB IS:"+d);
		int e=a*b;
		System.out.println("MUL IS:"+e);
		int f=a/b;
		System.out.println("DIV IS:"+f);
		int g=a%b;
		System.out.println("MOD IS:"+g);

	}
	public static void main(String args[])
	{
		Functionadd f=new Functionadd();
		f.num();
	}
}