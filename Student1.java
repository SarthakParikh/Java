import java.util.*;
class Student1
{
Student1(String name,String lname,int no)
{
System.out.println(" "+name);
System.out.println(" "+lname);
System.out.println(" "+no);
}
public static void main(String args[])
{
	for(int j=0;j<3;j++)
	{
	Scanner s=new Scanner(System.in);
	System.out.println("name");
	String a=s.next();
	System.out.println("lname");
	String b=s.next();
	System.out.println("no");
	int d=s.nextInt();

	Student1 c=new Student1(a,b,d);
	}	
	
	}
	
}