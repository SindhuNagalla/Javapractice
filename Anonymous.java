interface Demo
{
	void show();
}
class Anonymous
{
	public static void main(String[] args) 
	{
		Demo d=new Demo()
		{
			public void show()
			{
				System.out.println("show() method");
			}
		};
		d.show();
	}
}
