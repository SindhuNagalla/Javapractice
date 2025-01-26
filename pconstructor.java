class pconstructor 
{
	pconstructor()
	{
		this(10);
		System.out.println("welcome");
	}
	pconstructor(int x)
	{
		System.out.println(x);
	}
	public static void main(String[] args) 
	{
		new pconstructor();
	}
}
