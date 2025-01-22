import java.util.*;

class primerange 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first number");
		int first=s.nextInt();
		System.out.println("Enter last number");
		int last=s.nextInt();

		for(int num=first;num<=last;num++)
		{
			int count=0;
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(num);
			}
		}
	}
}
