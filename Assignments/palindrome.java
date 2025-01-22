import java.util.*;
class palindrome
{
public static void main(String[] args)
{
int ones,tens,cents;
Scanner sc=new Scanner(System.in);

System.out.println("enter a number:");
int a=sc.nextInt();

ones=a%10;
tens=a/10;
cents=a/100;
if(ones==cents)
{
System.out.println("Given number is a palindrome number");
}
else
{
System.out.println("Given number is not a palindrome number");
}

}
}