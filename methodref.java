/*interface Test
{
	int add(int a,int b);
}
class methodref 
{
	int sum(int a,int b)
	{
		int c=a+b;
		return c;
	}
	public static void main(String[] args) 
	{
		Test t=new methodref()::sum;
		int x=t.add(22,11);
		System.out.println(x);
	}
}
*/

interface Test
{
	int add(int x,int y);
}
class methodref
{
	static int sum(int x,int y)
	{
		int c=x+y;
		return c;
	}
	public static void main(String[] args)
	{
		Test t=methodref::sum;
		int x=t.add(32,12);
		System.out.println(x);
	}
}