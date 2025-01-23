class method34 
{
	int[] addElements()
	{
		int[] a={23,32,34,43,22};
		return a;
	}
	public static void main(String[] args) 
	{
		int x[]=new method34().addElements();
		for(int i=0;i<x.length;i++)
			System.out.println(x[i]);
		method34 m=new method34();
		int y[]=m.addElements();
		for(int z:y)
			System.out.println(z);
	}
}
