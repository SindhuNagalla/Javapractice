class A
{
	class B
	{
		public void show()
		{
			System.out.println("Welcome");
		}
	}
}
class Inner 
{
	public static void main(String[] args) 
	{
		A a=new A();
		A.B b=a.new B();
		b.show();
	}
}
