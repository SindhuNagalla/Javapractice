class A
{
	static void show()
	{
		System.out.println("static method");
	}
}
class B2 extends A 
{
	public static void main(String[] args) 
	{
		show();
		A.show();
		B2.show();
	}
}
