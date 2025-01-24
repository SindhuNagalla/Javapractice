class Digitsum 
{
	public static void main(String[] args) 
	{
		int number=54325;
		int temp=number;
		int sum=0,digitcount=0;

		while(temp > 0)
		{
			temp = temp/10;
			digitcount++;
		}

		for(int i=digitcount-1;i>=0;i--)
		{
			int digit=number/(int) Math.pow(10,i)%10;
			sum=sum+digit;
		}
		System.out.println(sum);
	}
}
