import java.util.*;
class Sec extends first
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter name");
		String a=s.next();
		System.out.println("enter name");
		String b=s.next();
		
		Sec S=new Sec(a,b);
		S.a();
		S.b();
	}
}