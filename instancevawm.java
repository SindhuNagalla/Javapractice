class Emp
{
	int rollno;
	float salary;
	void Emp(int rollno,float salary)
	{
		this.rollno=rollno;
		this.salary=salary;
	}
}
class instancevawm 
{
	public static void main(String[] args) 
	{
		Emp e1=new Emp();
		e1.Emp(101,5000.00f);
		Emp e2=new Emp();
		e2.Emp(102,6000.00f);
		System.out.println(e1.rollno+"\t"+e1.salary);
		System.out.println(e2.rollno+"\t"+e2.salary);
	}
}
