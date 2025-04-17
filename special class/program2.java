class  program2
{
	String concateString(String... a)
	{
		String result="";
		for(int i=0;i<a.length;i++)
		{
			result=result+a[i];
		}
		return result;
	}
	
	public static void main(String[] args) 
	{
		program2 p2=new program2();
		String output=p2.concateString("Hello"," ","world");
		System.out.println(output);
	}
}
