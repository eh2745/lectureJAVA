package edu.epe.eh2745.lectureI;

public class GravityCalculator 
{
	public static double multiply(double _a, double _b)
	{
		return _a*_b;
	}
	public static double square(double _a)
	{
		return _a*_a;
	}
	public static double sum(double _a, double _b)
	{
		return _a+_b;
	}
	public static void printResults(int _a, double _b, double _c)
	{
		System.out.println("The object's position after " + _a + " seconds is "+ _b + " m.");
		// Line for velocity (similar to position)
		System.out.println("The object's velocity after " + _a + " seconds is "+ _c + " m/s");
	}
	public static void main(String[] args) 
	{
		float gravity = (float) -9.81; // Earth's gravity in m/s^2 (type of variable) 
		int fallingTime = 10;
		double initialVelocity = 0.0; 
		double finalVelocity = 0.0;
		double initialPosition = 0.0; 
		double finalPosition = 0.0;
		// Formulas for position and velocity
//		//x_t= 0.5*a_t^2+ v_i_t + x_i
//		finalPosition= 0.5*gravity*fallingTime*fallingTime+ initialVelocity*fallingTime+ initialPosition;
//		//v_t= a_t+ v_i
//		finalVelocity= gravity*fallingTime+ initialVelocity;
		//x_t= 0.5*a_t^2+ v_i_t + x_i
		finalPosition= sum(sum(multiply(0.5,multiply(gravity,square(fallingTime))), 
				multiply(initialVelocity,fallingTime)), initialPosition);
		//v_t= a_t+ v_i
		finalVelocity= sum(multiply(gravity,fallingTime), initialVelocity);
//		System.out.println("The object's position after " + fallingTime + " seconds is "+ finalPosition + " m.");
//		// Line for velocity (similar to position)
//		System.out.println("The object's velocity after " + fallingTime + " seconds is "+ finalVelocity + " m/s");
		printResults(fallingTime, finalPosition, finalVelocity);
		
		double dgravity = -9.81;
		System.out.println(dgravity);
		System.out.println(gravity);
		
		
	}
}
