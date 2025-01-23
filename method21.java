class method21
{
	void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		new method21().add(22,33);
		method21 m=new method21();
		m.add(11,22);
	}
}
