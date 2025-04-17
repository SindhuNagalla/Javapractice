class program3
{
	void printDetails(String name,String... hobbies)
	{
		System.out.println("name: "+name);
		System.out.println("hobbies:");
		for(int i=0;i<hobbies.length;i++)
		{
			System.out.println(hobbies[i]);
		}
	}

	public static void main(String[] args) 
	{
		program3 p3=new program3();
		p3.printDetails("Sindhu","eating","sleeping");
		p3.printDetails("Anjali");
	}
}
