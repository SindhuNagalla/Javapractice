class Emp implements Serializable
{
	int empNo=101;
	float salary=5000.00f;
}
class serialDemo 
{
	public static void main(String[] args) 
	{
		try{
			Emp e=new Emp();
			FileOutputStream fos=new FileOutputStream("emp.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(e);
			oos.close();
			fos.close();
			FileInputStream fis=new FileInputStream("emp.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Emp e1=(Emp)ois.readObject();
			System.out.println(e1.empNo+"\t"+e2.salary);
			ois.close();
			fis.close();
		}
		catch(ClassNotFoundException | IOException e)
		{
			System.out.println(e);
		}
	}
}
