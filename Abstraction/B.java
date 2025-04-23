abstract class A
{
	abstract void show();
	void print()
	{
		System.out.println("print() method");
		
	}
}
class B extends A 
{
	void show()
	{
		System.out.println("show() method");
	}
	void display()
	{
		System.out.println("display() method");
	}
	public static void main(String[] args) 
	{
		B ob=new B();
		ob.show();
		ob.print();
		ob.display();
	}
}
