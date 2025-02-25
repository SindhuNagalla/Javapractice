//program to handle checked exceptions
class exception1
{
	public static void main(String[] args)
	{
		try{
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			int c=a/b;
			System.out.println(c);
		}catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("please pass the two arguments");
		}
		catch(NumberFormatException ne)
		{
			System.out.println("please pass two numbers only");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("please pass second number expect zero");
		}
	}
}