class  Method1
{
	int add(int[] a)
	{
		int sum=0;
		for(int b:a)
			sum=sum+b;
		return sum;
	}
	public static void main(String[] args) 
	{
		int x[]={1,4,3,5,8};
		int y=new Method1().add(x);
		System.out.println(y);
		Method1 m=new Method1();
		int z=m.add(x);
		System.out.println(z);
	}
}
