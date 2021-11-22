import java.util.*;
class AddFun1
{
	int Sum(){
		Scanner s=new Scanner(System.in);
		System.out.println("enter name");
		int a=s.nextInt();
		System.out.println("enter last name");
		int b=s.nextInt();
		int sum=a+b;
		return sum;
	}
	int Sub(){
		Scanner s=new Scanner(System.in);
		System.out.println("enter no");
		int a=s.nextInt();
		System.out.println("enter last no");
		int b=s.nextInt();
		int sub=a-b;
		return sub;
	}
	public static void main(String args[])
	{
	AddFun1 a=new AddFun1();
	int c=a.Sum();
	int d=a.Sub();
	System.out.println("Ans:"+c);
	System.out.println("Ans 1:"+d);
	
	}
	
}