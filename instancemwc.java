class Emp
{
	int empNo;
	float salary;
	Emp(int a,float b)
	{
		empNo=a;
		salary=b;
	}
}
class instancemwc 
{
	public static void main(String[] args) 
	{
		Emp e1=new Emp(101,5000.00f);
		Emp e2=new Emp(102,6000.00f);
		System.out.println(e1.empNo+" "+e1.salary);
		System.out.println(e2.empNo+" "+e2.salary);
	}
}
