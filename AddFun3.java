import java.util.*;
class AddFun3
{
	float area(float pi,float r){
	float d=2*pi*r;
	 return d;
	}
	float pera(float pi,float r)
	{
	float e=pi*r*r;
	return e;
	}
	public static void main(String args[])
	{
		Scanner c=new Scanner(System.in);
		System.out.println("enter no");
		float r=c.nextInt();
		float pi=3.14f;
		AddFun3 z=new AddFun3();
		float f=z.pera(r,pi);
		System.out.println("Ans="+f);
		float v=z.area(r,pi);
		System.out.println("Ans="+v);
	}
	
}