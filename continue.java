class cont 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=10;j++)
			{
				if(j==5)
					continue;
				System.out.println(j);
			}
			System.out.print();
		}
	}
}
