class TestStatic
{
 static int count=0;
 TestStatic()
 {
 count++;
 System.out.println("count is"+count);
 }
 public static void main(String args[])
 {
	 TestStatic();
	 TestStatic();
	 TestStatic();
 }
}