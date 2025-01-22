import java.util.*;

class perfectrange 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter starting number:");
		int start=s.nextInt();
		System.out.print("Enter Ending number:");
		int end=s.nextInt();

		for(int a=start;a<=end;a++)
		{
			int sum=0;
			for(int i=1;i<a;i++)
			{
				if(a%i==0)
				{
					sum=sum+i;
				}
			}
			if(sum==a)
			{
				System.out.println(a);
			}
		}
	}
}
