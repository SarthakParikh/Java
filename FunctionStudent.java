import java.util.*;
class FunctionStudent
{
	void stu()
	{
		
		Scanner s=new Scanner(System.in);
		Scanner s1=new Scanner(System.in);
		System.out.println("how many data dou wany??");
		int i=s.nextInt();
		int j;
		for(j=0;j<i;j++)
		{
		System.out.println("enter no:");
		int b=s.nextInt();
		System.out.println("enter name:");
		String a=s.next();
		System.out.println("enter course name:");
		String e=s1.nextLine();
		System.out.println("b day:");
		String c=s.next();		
		System.out.println("phone no:");
		String d=s1.nextLine();
		System.out.println("NAME:"+a);
		System.out.println("ROLL N0:"+b);
		System.out.println("COURSE NAME:"+e);
		System.out.println("B'DAY:"+c);
		System.out.println("PH:"+d.trim());
		}
	}
	public static void main(String args[])
	{
		FunctionStudent f=new FunctionStudent();
		f.stu();
	}
}