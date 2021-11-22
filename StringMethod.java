class StringMethod
{
	public static void main(String args[])
	{
	String a="this is java .java.java";
	String s1="this";
	String s2="This";
	int l=a.lastIndexOf("a");
	int c=s1.compareTo(s2);
	System.out.println(c);
	String b=s2.toLowerCase();
	String b1=s1.toUpperCase();
	System.out.println(b+"\n"+b1);
	String j=("              trim");
	System.out.println(j.trim());
	String S3=new String("this");
	System.out.println(s1.equals(s2));
	System.out.println(s1.equalsIgnoreCase(s2));
	System.out.println(s1==S3);
	}
	
}