class thread5 implements Runnable 
{
	public void run()
	{
		try{
			for(int i=1;i<=10;i++)
			{
				System.out.println("JavaEE");
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException ie)
		{
			System.err.println(ie);
		}
	}
}
class thread6 implements Runnable
{
	public void run()
	{
		try{
			for(int i=1;i<=10;i++)
			{
				System.out.println("Core Java");
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException ie)
		{
			System.err.println(ie);
		}
	}
	public static void main(String[] args) 
	{
		Runnable r=new thread6();
		Thread t=new Thread(r);
		t.start();
		Runnable r1=new thread5();
		Thread t1=new Thread(r1);
		t1.start();
		try{
			for(int i=1;i<=10;i++)
			{
				System.out.println("AdvancedJava");
				Thread.sleep(1500);
			}
		}
		catch(InterruptedException ie)
		{
			System.err.println(ie);
		}
	}
}
