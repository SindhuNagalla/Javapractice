class classmethod
{
	static void show()
	{
		System.out.println("Welcome");
	}
	public static void main(String[] args) 
	{
		show();
		classmethod.show();
		new classmethod().show();
		classmethod s=new classmethod();
		s.show();
	}
}
