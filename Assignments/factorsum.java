import java.util.*;
class factorsum
{
	public static void main(String args[])
	{
		int sum=0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any number");

		int a = sc.nextInt();
        
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}
}