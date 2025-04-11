import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
class Lists 
{
	public static void main(String[] args) 
	{
		List<Integer> li=new ArrayList<>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.remove(2);
		li=Collections.unmodifiableList(li);
		System.out.println(li);
	}
}

