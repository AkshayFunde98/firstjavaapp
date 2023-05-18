
abstract class Person {
	private String name;
	private String age;
	
	public Person()
	{}
	public Person(String name,String age)
	{
		this.name=name;
		this.age=age;
	}
	public abstract void display();
	
	public String toString()
	{
	return "Name:"+name+"\t Age:"+age;	
	}
}
class Emp extends Person
{
	private int eid;
	private double salary;
	
	public Emp()
	{}
	public Emp(String name, String age,int eid,double salary)
	{
		super(name,age);
		this.eid=eid;
		this.salary=salary;	
	}
	public void display()
	{
		System.out.println(super.toString()+"\t Eid:"+eid+"\t Salary:"+salary);
	}
	public double getSal()
	{
		return salary;
	}
}
class SalesManager extends Emp
{
	private double target;
	private double incentives;
	
	public SalesManager(String name, String age,int eid,double salary,double target,double incentives)
	{
		super(name,age,eid,salary);
		this.target=target;
		this.incentives=incentives;
	}
	public double getNetSal()
	{
		return super.getSal()+(target*incentives);
	}
	public void display()
	{
		super.display();
		System.out.print("\t Target:"+target+"\t Incentives"+incentives+"\t Net salary:"+getNetSal());
	}
	
}
public class PolyEmpDemo {
public static void main(String[] args) {
	Person p= new SalesManager("Akshay","25", 105, 15000, 50, 100);
	p.display();
}
}
