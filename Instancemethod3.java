class Instancemethod3 
{
	int max(int a,int b)
	{
		if(a>b)
			return a;
		else
			return b;
	}
	public static void main(String[] args) 
	{
		int x=new Instancemethod3().max(23,65);
		System.out.println(x);
		Instancemethod3 i=new Instancemethod3();
		int y=i.max(87,90);
		System.out.println(y);
	}
}
