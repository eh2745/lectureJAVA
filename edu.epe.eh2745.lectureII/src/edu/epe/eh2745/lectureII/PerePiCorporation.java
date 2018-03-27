package edu.epe.eh2745.lectureII;

public class PerePiCorporation 
{
	public static void main(String[] args)
	{
		Employee john= new Employee("John", 7.5, 38);
		Employee annabel= new Employee("Annabel", 8.2, 42);
		Employee graham= new Employee("Graham", 10.5, 41);
		Manager bill= new Manager("Bill", 15.5, 39, "A332");
		Manager gregory= new Manager("Gregory", 18.20, 40, "A415");
		john.salary();
		annabel.salary();
		graham.salary();
		bill.salary();
		gregory.salary();
	}
}
