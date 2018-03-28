package edu.epe.eh2745.lectureIV;

public class Flower {

	public String type= "";
	public double sepal_length;
	public double sepal_width;
	public double petal_length;
	public double petal_width;
	
	public Flower (String _type, double _sepal_length, double _sepal_width,
			double _petal_length, double _petal_width)
	{
		this.type= _type;
		this.sepal_length= _sepal_length;
		this.sepal_width= _sepal_width;
		this.petal_length= _petal_length;
		this.petal_width= _petal_width;
	}
	
	public String toString()
	{
		String flor;
		flor= "Type: "+ this.type+ 
				"\t Sepal: length= "+ this.sepal_length+ " width= "+ this.sepal_width+ 
				"; Petal: lenght= "+ this.petal_length+	" width= "+ this.petal_width;
		return flor;
	}
}
