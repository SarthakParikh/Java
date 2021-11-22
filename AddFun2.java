import java.util.*;
class AddFun2
{
	int Sum(int a,int b){
		Scanner s=new Scanner(System.in);
		int sum=a+b;
		return sum;
	}
	int Sub(int a,int b){
		int sub=a-b;
		return sub;
	}
	int Mul(int a,int b){
		int Mul=a*b;
		return Mul;
		
	}
	int Div(int a,int b){
		int Div=a/b;
		return Div;
		
	}
	public static void main(String args[])
	{
		Scanner c=new Scanner(System.in);
		System.out.println("enter no");
		int a=c.nextInt();
		System.out.println("enter no");
		int b=c.nextInt();

	AddFun2 z=new AddFun2();
	
	System.out.println("ENTER 1 FOR SUM 2 FOR SUB 3 FOR MULTI 4 FOR DIV");
	int q=c.nextInt();
	if(q==1)
	{
		int f=z.Sum(a,b);
		System.out.println("Ans="+f);
	}
	else if(q==2)
	{
		int f=z.Sub(a,b);
		System.out.println("Ans="+f);
	}
	else if(q==3)
	{
		int f=z.Mul(a,b);
		System.out.println("Ans="+f);
	}
	else if(q==4)
	{
		int f=z.Div(a,b);
		System.out.println("Ans="+f);
	}
	else{System.out.println("ENTER RIGHT CHOICE");}
	}
	
}