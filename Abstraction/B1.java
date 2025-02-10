class A
{
	A()
	{
		System.out.println("Welcome");
	}
}
class B1 extends A
{
	/*
	B1()
	{
		Super();//implicitly java provides Super();
	}
	*/
	public static void main(String[] args) 
	{
		new B1();
	}
}
