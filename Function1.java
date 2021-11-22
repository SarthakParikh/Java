import java.util.*;
class Function1
{
	void printname(String a,String b){
		System.out.println("wele come"+a+" "+b);
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter name");
		String a=s.next();
		System.out.println("enter last name");
		String b=s.next();
		Function1 f=new Function1();
		f.printname(a,b);
	}
}