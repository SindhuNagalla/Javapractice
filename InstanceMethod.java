class Instancemethod
{
	int add(int a,int b)
	{
		int c=a+b;
		return c;
	}
	public static void main(String[] args) 
	{
		int x=new Instancemethod().add(24,34);
		System.out.println(x);
		Instancemethod i=new Instancemethod();
		int y=i.add(32,43);
		System.out.println(y);
	}
}
