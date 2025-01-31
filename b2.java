class a
{
	int x=10;
}
class b2 extends a
{
	int x=20;
	void print()
	{
		int x=30;
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
	}
	public static void main(String[] args) 
	{
		b2 ob=new b2();
		ob.print();
	}
}