interface Test
{
	void show();
}
class  Anonymous1
{
	public static void main(String[] args) 
	{
		Test t=new Test()
		{
			public void show()
			{
				System.out.println("Welcome");
			}
		};
	t.show();
	}
}
