class a
{
	void show()
	{
		System.out.println("A class");
	}
	void print()
	{
		System.out.println("print() method");
	}
}
class runtimep extends a
{
	void show()
	{
		System.out.println("B class");
	}
	void display()
	{
		System.out.println("display() method");
	}
	public static void main(String[] args) 
	{
		runtimep ob=new runtimep();
		ob.show();
		ob.print();
		ob.display();
	}
}
