//instance variable initialization without constructor
class Emp
{
	int empNo=101;
	float salary=5000.00f;
}
class  instancevwoc
{
	public static void main(String[] args) 
	{
		Emp e1=new Emp();
		Emp e2=new Emp();
		System.out.println(e1.empNo+" "+e1.salary);
		System.out.println(e2.empNo+" "+e2.salary);
	}
}
