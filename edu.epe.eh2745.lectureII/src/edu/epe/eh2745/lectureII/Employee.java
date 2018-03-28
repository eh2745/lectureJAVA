package edu.epe.eh2745.lectureII;

public class Employee 
{
	protected String name;
	protected double basePay;
	protected int hoursWorked;
	
	public Employee(String _name, double _basePay, int _hoursWorked)
	{
		this.name= _name;
		this.basePay= _basePay;
		this.hoursWorked= _hoursWorked;
	}
	
	public void salary()
	{
		double totalsalary;
		
		totalsalary= this.basePay* this.hoursWorked;
		System.out.printf("%s salary is %.02f \n",this.name, totalsalary);
	}
}
