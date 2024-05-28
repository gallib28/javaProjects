import java.util.Stack;

import javax.swing.JButton;

import java.math.*;
public class CalculatorLogic extends  Stack  {
		
	public static double plus(double a,double b) {
		double result=a+b;
		return result;
	}
	public static double minus(double a,double b) {
		double result=a-b;
		return result;
	}
	public static double multiply(double a,double b) {
		double result=a*b;
		return result;
	}
	public static double divide(double a,double b) {
		double result=a/b;
		return result;
	}
	public static double log(double a) {
		double result = Math.log(a);
		return result;
	}
	public static double power(double a,int num) {
		double result = Math.pow(a,num);
		return result;
	}
	public static double powerByTwo(double a) {
		double result = Math.pow(a,2);
		return result;
	}
	public static double squareroot(double a) {
		double result =Math.sqrt(a);
		return result;
	}
	
} 
