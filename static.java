class staticmethod
{
	static void show()
	{
		System.out.println("Welcome");
	}
	public static void main(String[] args) 
	{
		show();
		staticmethod.show();
		new staticmethod().show();
		staticmethod s=new staticmethod();
		s.show();
	}
}
