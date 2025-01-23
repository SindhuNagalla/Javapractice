class Reverse
{
	public static void main(String args[])
	{
		int num=1234;
		while(num>0)
		{
			int i=num%10;
			System.out.print(i);
			num/=10;
		}
	}
}