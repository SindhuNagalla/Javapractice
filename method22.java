class method22 
{
	void max(int a,int b)
	{
		if(a>b)
			System.out.println(a);
		else
			System.out.println(b);
	}
	public static void main(String[] args) 
	{
		new method22().max(29,39);
		method22 m=new method22();
		m.max(33,88);
	}
}
