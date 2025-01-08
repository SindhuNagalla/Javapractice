class pattern2 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			if(i==9)
			{
				System.out.print('.');
			}
			else
			{
				System.out.print(',');
			}
		}
	}
}
