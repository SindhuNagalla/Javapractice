import java.util.*;

class  optionalclass
{
	public static void main(String[] args) 
	{
		String name="john";

		Optional<String> o=Optional.of(name);
		System.out.println(o.get());//must not be a null
		
		String name1=null;
		Optional<String> o1=Optional.ofNullable(name1);
		System.out.println(o1.isPresent());

		System.out.println(o1.orElse("default name"));
		System.out.println(o1.orElseThrow());

		String name2="sindhu";
		Optional<String> o2=Optional.ofNullable(name2);
		System.out.println(o2.isPresent());
		
		o.ifPresent(n->System.out.println( n.toUpperCase()));

		String s2=null;
		System.out.println(s2);
	}
}
