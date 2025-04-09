interface Test
{
	void display();
}
class constructorref 
{
	constructorref()
	{
		System.out.println("Welcome");
	}
	public static void main(String[] args) 
	{
		Test t=constructorref::new;
		t.display();
	}
}
