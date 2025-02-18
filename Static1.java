class A
{
	static class B
	{
		void show()
		{
			System.out.println("Welcome");
		}
	}
}
class Static1
{
	public static void main(String[] args) 
	{
		A.B ob=new A.B();
		ob.show();
	}
}
