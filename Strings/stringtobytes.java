class stringtobytes 
{
	public static void main(String[] args) 
	{
		String s="welcome";
		byte[] b=s.getBytes();
		for(byte b1:b)
			System.out.println(b1);
	}
}
