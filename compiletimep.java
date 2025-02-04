class compiletimep 
{
	void max(int a,int b)
	{
		if(a>b)
			System.out.println(a);
		else
			System.out.println(b);
	}
	int max(int a,int b,int c)
	{
		if(a>b && a>c)
			return a;
		else if(b>c)
			return b;
		else
			return c;
	}
	public static void main(String[] args) 
	{
		compiletimep c=new compiletimep();
		c.max(34,43);
		int x=c.max(23,44,56);
		System.out.println(x);
	}
}
