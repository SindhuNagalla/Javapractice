class a
{
	a(int x)
	{
		System.out.println(x);
	}
}
class b4 extends a 
{
	b4()
	{
		super(20);
		System.out.println("b class");
	}
	public static void main(String[] args) 
	{
		new b4();
	}
}