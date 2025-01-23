class Instancemethod4 
{
	int addElements(int[] a)
	{
		int sum=0;
		for(int b:a)
			sum=sum+b;
		return sum;
	}
	public static void main(String[] args) 
	{
		int[] x={43,22,76,87,12};
		Instancemethod4 i=new Instancemethod4();
		int y=i.addElements(x);
		System.out.println(y);
	}
}
