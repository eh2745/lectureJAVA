package edu.epe.eh2745.lectureIII;

public class Manager extends Employee {
	
	private String office_number= "";
	
	public Manager(String _name, String _level, double _basePay, int _hoursWorked, String _office)
	{
		super(_name,_level, _basePay,_hoursWorked);
		this.office_number= _office;
	}
	
	public void hasoffice()
	{
		if (!this.office_number.equals(""))
			System.out.printf("%s works in %s \n", this.name, this.office_number);
		else
			System.out.printf("%s does not have office \n", this.name);
	}
}
