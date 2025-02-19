import java.util.*;

class  String15
{
	public static void main(String[] args) 
	{
		String s="Welcome to java";
		StringTokenizer st=new StringTokenizer(s);
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}
}
