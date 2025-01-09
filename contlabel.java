class contlabel 
{
	public static void main(String[] args) 
	{
		first:for(int i=1;i<=3;i++)
		{
			second:for(int j=1;j<=10;j++)
			{
				if(j==4)
					continue second;
				System.out.println(j);
			}
		}
	}
}
