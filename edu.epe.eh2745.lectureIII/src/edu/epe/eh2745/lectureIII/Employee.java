package edu.epe.eh2745.lectureIII;

public class Employee 
{
	protected String name;
	protected String professionLevel;
	protected double basePay;
	protected int hoursWorked;
	
	public Employee(String _name, String _level, double _basePay, int _hoursWorked)
	{
		this.name= _name;
		this.professionLevel= _level;
		this.basePay= _basePay;
		this.hoursWorked= _hoursWorked;
	}
	
	public void salary()
	{
		double totalsalary= 0;
		
		if (this.basePay< 8.00)
			System.out.printf("ERROR!: %s salary is less then $8.00 \n", this.name);
		else
		{
			if (this.hoursWorked> 40)
				totalsalary= this.basePay*40+ 1.5*this.basePay* (hoursWorked-40);
			System.out.printf("%s salary is %.02f \n",this.name, totalsalary);
		}	
	}
	
	public void office()
	{
		// char professionalLevel;
		// if (this.professionalLevel== 'A') 
		if (this.professionLevel.equals("A"))
			System.out.printf("%s works in an %s \n", this.name, "Individual Room");
		else if (this.professionLevel.equals("B"))
			System.out.printf("%s works in a %s \n", this.name, "Cubicle");
	}
}
