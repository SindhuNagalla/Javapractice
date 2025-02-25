//program to create and handle checked exceptions.
class NegativeNumberException extends Exception
{
}
class exception3 
{
	void cube(int x) throws NegativeNumberException
	{
		if(x>0)
			System.out.println(x*x*x);
		else
			throw new NegativeNumberException();
	}
	public static void main(String[] args) 
	{
		try{
			int a=Integer.parseInt(args[0]);
			exception3 e=new exception3();
			e.cube(a);
		}
		catch(NegativeNumberException ne)
		{
			System.err.println(ne);
		}

	}
}
