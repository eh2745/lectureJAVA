package edu.epe.eh2745.lectureII;

public class Manager extends Employee {
	
	private String office_number;
	
	public Manager(String _name, double _basePay, int _hoursWorked, String _office)
	{
		super(_name,_basePay,_hoursWorked);
		this.office_number= _office;
		
	}
	
	@Override
	public void salary()
	{
		double totalsalary= 0.0;
		
		totalsalary= this.basePay* this.hoursWorked;
		System.out.printf("%s salary is %.02f \n",this.name, totalsalary);
		System.out.println("Works in office numbrer "+ this.office_number);
	}
	
	public void office()
	{
		System.out.printf("%s works in %s", this.name, this.office_number);
	}
}
