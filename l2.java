/*@FunctionalInterface
interface Test
{
	int add(int x,int y);
}
class l2 
{
	public static void main(String[] args) 
	{
		Test t=(x,y)->x+y;
		int x=t.add(43,13);
		System.out.println(x);
	}
}
*/

/*@FunctionalInterface
interface Test
{
	int show(int x);
}
class l2
{
	public static void main(String[] args)
	{
		Test r=(t)->{ System.out.println(t); return t;};
		System.out.println(r.show(5));
	}
}
*/

/*@FunctionalInterface
interface Test
{
	void show(String s);
}
class l2
{
	public static void main(String[] args)
	{
		Test t=
			(f)->System.out.println(f);
	t.show("sindhu");
}
}
*/

@FunctionalInterface
interface Test
{
	String show();
}
class l2
{
	public static void main(String[] args)
	{
		Test t=()->{
			return "sindhu";
		};
		System.out.println(t.show());
	}

}
