class a
{
	void show()
	{
		System.out.println("A class");
	}
}
class b3 extends a
{
	void show()
	{
		System.out.println("B class");
	}
	void print()
	{
		show();
		this.show();
		super.show();
	}
	public static void main(String[] args) 
	{
		b3 ob=new b3();
		ob.print();
	}
}