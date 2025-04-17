class program1 
{
	int findMax(int ...a)
	{
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		return max;
	}
	public static void main(String[] args) 
	{
		program1 p1=new program1();
		int maximum=p1.findMax(10,20,40,34,67,11);
		System.out.println(maximum);
	}
}
