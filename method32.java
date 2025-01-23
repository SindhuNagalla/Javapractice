class method32 
{
	int max()
	{
		int a=32,b=76;
		if(a>b)
			return a;
		else
			return b;
	}
	public static void main(String[] args) 
	{
		int x=new method32().max();
		System.out.println(x);
		method32 m=new method32();
		int y=m.max();
		System.out.println(y);
	}
}
