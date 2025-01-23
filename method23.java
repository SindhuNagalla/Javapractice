class method23 
{
	void addElements(int[] a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
			sum=sum+a[i];
		System.out.println(sum);
	}
	public static void main(String[] args) 
	{
		int[] x={23,22,43,55,31};
		new method23().addElements(x);
		method23 m=new method23();
		m.addElements(x);
	}
}
