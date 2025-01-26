class tk2 
{
	int x=10;
	void display()
	{
		System.out.println(x);
	}
	public static void main(String[] args) 
	{
		tk2 tk=new tk2();
		tk2 tk1=new tk2();
		tk.x=tk.x+2;
		tk.display();
		tk1.display();
	}
}
