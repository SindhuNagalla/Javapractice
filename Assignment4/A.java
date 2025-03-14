class A
{
	class B
	{
		int x=10;
		void show()
		{
			System.out.println("Welcome");
		}
	}
	public static void main(String[] args) 
	{
		A a=new A();
		A.B b=a.new B();
		b.show();
		System.out.println(b.x);
	}
}
