class method31 
{
	int add()
	{
		int a=7,b=9;
		int c=a+b;
		return c;
	}
	public static void main(String[] args) 
	{
		int x=new method31().add();
		System.out.println(x);
		method31 m=new method31();
		int y=m.add();
		System.out.println(y);
	}
}
