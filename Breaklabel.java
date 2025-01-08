class Breaklabel 
{
	public static void main(String[] args) 
	{
		First:for(int i=1;i<=10;i++)
		{
			SECOND:for(int j=1;j<=10;j++)
			{
				if(j==5)
					break SECOND;
				System.out.println(j);
			}
		}
	}
}
