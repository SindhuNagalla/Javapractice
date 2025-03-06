class thread2 
{
	public static void main(String[] args) 
	{
		try{
			for(int i=0;i<=10;i++)
			{
				System.out.println(i);
				Thread.sleep(1000);
			}
		}catch(InterruptedException ie)
		{
			System.out.println(ie);
		}
	}
}
