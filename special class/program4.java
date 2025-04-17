class  program4
{
	int findSum(int... a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		program4 p4=new program4();
		int sumresult=p4.findSum(10,20,30,100);
		System.out.println(sumresult);
	}
}
