//program to handle unchecked exceptions
class exception2 
{
	public static void main(String[] args) 
	{
		try{
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			int c=a/b;
			System.out.println(c);
		}catch(RuntimeException re)
		{
			System.out.println("please pass two numbers and second number expect zero");
		}
	}
}
