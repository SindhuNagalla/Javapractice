class thread4 extends Thread 
{
	public void run()
	{
		try{
			for(int i=1;i<=10;i++)
			{
				String s=getName();
				System.out.println(s+":"+i);
				if(s.equals("Thread-0"))
					Thread.sleep(1000);
				else
					Thread.sleep(2000);
			}
		}catch(InterruptedException ie)
		{
			System.out.println(ie);
		}
	}
	public static void main(String[] args) 
	{
		try{
		Thread t=Thread.currentThread();
		thread4 t1=new thread4();
		t1.start();
		thread4 t2=new thread4();
		t2.start();
		for(int i=0;i<=10;i++)
		{
			System.out.println(t.getName()+":"+i);
			Thread.sleep(3000);
		}
		}catch(InterruptedException ie)
		{
			System.out.println(ie);
		}
	}
}
