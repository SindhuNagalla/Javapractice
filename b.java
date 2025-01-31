class a
{
	int x=10;
	void show()
	{
		System.out.println("A class");
	}
}
class b extends a
{
	int y=20;
	void print()
	{
		System.out.println("B class");
	}
	public static void main(String[] args) 
	{
		b obj=new b();
		System.out.println(obj.x);
		System.out.println(obj.y);
		obj.show();
		obj.print();
	}
}
