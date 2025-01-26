class dconstructor
{
	dconstructor()
	{
		System.out.println("Welcome");
	}
	dconstructor(int x)
	{
		this();
		System.out.println(x);
	}
	public static void main(String[] args) 
	{
		new dconstructor(10);

	}
}
