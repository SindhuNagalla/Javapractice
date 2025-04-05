import java.util.function.*;
class l1
{
	public static void main(String[] args)
	{
		BiFunction<Integer,Float,Float> bf=(a,b)->a+b;
		float c=bf.apply(28,9.4f);
		System.out.println(c);ws
	}
}