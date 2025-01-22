import java.util.*;

class prime 
{
	public static void main(String[] args) 
	{
		int count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=s.nextInt();

		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("Not a prime number");
		}
	}
}