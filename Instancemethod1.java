class Instancemethod1 
{
	int cube(int a)
	{
		int b=a*a*a;
		return b;
	}
	public static void main(String[] args) 
	{
		int x=new Instancemethod1().cube(5);
		System.out.println(x);
		Instancemethod1 i=new Instancemethod1();
		int y=i.cube(9);
		System.out.println(y);
		
	}
}
