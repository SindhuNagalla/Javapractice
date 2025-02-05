class a
{
	static void show()
	{
		System.out.println("A class");
	}
}
class methodhiding extends a
{
	static void show()
	{
		System.out.println("B class");
	}
	public static void main(String[] args) 
	{
		a ob=new methodhiding();
		ob.show();
	}
}
