//program to create unchecked exception
class NegativeNumberException extends RuntimeException
{

}
class exception4  
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
		int x=Integer.parseInt(args[0]);
		exception4 e=new exception4();
		e.cube(x);
	}
}
