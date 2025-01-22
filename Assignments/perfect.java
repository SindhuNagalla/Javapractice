import java.util.*;

class perfect 
{
	public static void main(String[] args) 
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a number:");

		int a=sc.nextInt();

		for(int i=1;i<a;i++)
		{
			if(a%i==0)
			{
				sum=sum+i;
			}
		}
		if(a==sum)
			{
			System.out.print("perfect number");
			}
		else
		{
			System.out.print("Not a perfect number");
		}
			
	}
}
