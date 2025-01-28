class block 
{
	{
		System.out.println("Block1");
	}
	block()
	{
		System.out.println("Constructor");
	}

	public static void main(String[] args) 
	{
		new block();
	}
	{
		System.out.println("Block 2");
	}
}
