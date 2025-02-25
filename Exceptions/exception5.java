//using throws clause for unchecked exceptons
class NegativeNumberException extends RuntimeException
{
}
class exception5
{
	void cube(int x)
	{
		if(x>0)
			System.out.println(x*x*x);
		else
			throw new NegativeNumberException();
	}
	public static void main(String[] args) throws NegativeNumberException
	{
		int a =Integer.parseInt(args[0]);
		exception5 e=new exception5();
		e.cube(a);
	}
}
