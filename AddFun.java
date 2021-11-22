import java.util.*;
class AddFun
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
	public static void main(String args[])
	{
	AddFun a=new AddFun();
	int c=a.Sum();
	System.out.println("Ans:"+c);
	
	}
	
}