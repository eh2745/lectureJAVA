package edu.epe.eh2745.lectureIII;

import java.util.ArrayList;

public class PerePiCorporation 
{
	public static void main(String[] args)
	{
		ArrayList<Employee> employeeList= new ArrayList<Employee>();
		Object[][] employeeData= {{"John","B",8.5,35},
					{"Graham","B",9.0,37},
					{"Annabel","A",9.2,43},
					{"Margaret","B",7.8,45},
					{"Bill","A",15.0,49,"A332"},
					{"Gregory","A",16.5,47,"A415"}};
		
		for(Object[] data: employeeData)
		{
			Employee worker= null;
			if (data.length== 4)
				worker= new Employee((String)data[0],(String)data[1],
						(double)data[2],(int)data[3]);
			else if (data.length> 4)
				worker= new Manager((String)data[0],(String)data[1],
						(double)data[2],(int)data[3],(String)data[4]);
			else
				System.out.println("Missing data!");
			employeeList.add(worker);
		}
		
		for(Employee empl: employeeList)
		{
			empl.salary();
			if (empl instanceof Manager)
				((Manager)empl).hasoffice();
			empl.office();
		}
	}
}
