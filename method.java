/*@FunctionalInterface
interface Test
{
	int add(int a,int b);
}
class method 
{
	int sum(int a,int b)
	{
		int c=a+b;
		return c;
	}
	public static void main(String[] args) 
	{
		Test t= new method()::sum;
		int x=t.add(22,32);
		System.out.println(x);
	}
}
*/

@FunctionalInterface
interface Test
{
	int add(int a,int b);
}
class method
{
	static int sum(int a,int b)
	{
		int c=a+b;
		return c;
	}
	public static void main(String[] args)
	{
		Test t=method::sum;
		int x=t.add(32,21);
		System.out.println(x);
	}
}