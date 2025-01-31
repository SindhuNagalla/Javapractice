class a
{
	int x=10;
}
class b1 extends a
{
	int y=20;
	void print()
	{
		int z=30;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
	public static void main(String[] args) 
	{
		b1 ob=new b1();
		ob.print();
	}
}
