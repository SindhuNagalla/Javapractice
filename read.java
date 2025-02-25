import java.io.*;

class read
{
	public static void main(String[] args) 
	{
		try{
		byte[] b=new byte[10];
		System.out.print("Enter any number:");
		System.in.read(b);
		String s1=new String(b);
		String s2=s1.trim();
		int x=Integer.parseInt(s2);
		System.out.println(x);
		}catch(IOException ie)
		{
			System.out.println(ie);
		}

	}
}
