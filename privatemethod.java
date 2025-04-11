interface Test
{
	private void show()
	{
		System.out.println("Welcome");
	}
	default void display()
	{
		show();
		System.out.println("Sindhu");
	}
}
class privatemethod implements Test
{
	public static void main(String[] args) 
	{
		Test t=new privatemethod();
		t.display();
	}
}
