import java.io.*;
public class IODEMO
{
	public static void main(String args[])
	{
		try{
			byte bwrite[]= {11,3,40,5,21};
			OutputStream os=new FileOutputStream("test.txt");
			for(int x=0;x<bwrite.length;x++)
			{
				os.write(bwrite[x]);
			}
			os.close();
			InputStream is=new FileInputStream("test.txt");
			int size=is.available();
			for(int i=0;i<size;i++)
			{
				System.out.print(is.read()+" ");
			}
			is.close();
		}catch(IOException w){
			System.out.print("Exception");
		}
	}
}