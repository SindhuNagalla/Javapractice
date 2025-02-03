class thispreview 
{
	thispreview()
	{
		System.out.println("Welcome");
	}
	thispreview(int x)
	{
		System.out.println(x);
		this();
	}
	public static void main(String[] args) 
	{
		new thispreview(10);	
	}
}
