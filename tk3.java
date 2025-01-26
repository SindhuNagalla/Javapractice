class tk3 
{
	int x=10;
	void display()
	{
		int x=20;
		System.out.println(x);
		System.out.println(this.x);
	}
	public static void main(String[] args) 
	{
		tk3 tk=new tk3();
		tk.display();
	}
}
