class thread3 extends Thread 
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Child Thread:"+i);
		}
	}
	public static void main(String[] args) 
	{
		thread3 t3=new thread3();
		t3.start();
		for(int i=1;i<=10;i++)
		{
			System.out.println("Main thread"+i);
		}
	}
}
