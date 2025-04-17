class  program5
{
	public static void containsNumber(int target,int... numbers)
	{
		boolean result=false;
		for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i]==target)
			{
				result=true;
				break;

			}
		}
		if(result)
		{
			System.out.println("Target: " + target + " is present.");

		}
		else
		{
			System.out.println("Target: " + target + " is not present.");

		}
	}
	public static void main(String[] args) 
	{
		containsNumber(10,2,34,32,87,98,34);
		containsNumber(20,25,60,70,20);
	}
}
