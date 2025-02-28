import java.io.*;

class ReadDemo 
{
	public static void main(String[] args) 
	{
		try{
		FileInputStream fis=new FileInputStream(args[0]);
		int n=fis.available();
		byte[] b=new byte[n];
		int x=fis.read(b);
		String s1=new String(b);
		System.out.println(s1);
		}catch(IOException ie)
		{
			System.out.println(ie);
		}
	}
}
