class method33 
{
	float getFloat()
	{
		float f=34.23f;
		return f;
	}
	public static void main(String[] args) 
	{
		float x=new method33().getFloat();
		System.out.println(x);
		method33 m=new method33();
		float y=m.getFloat();
		System.out.println(y);
	}
}
