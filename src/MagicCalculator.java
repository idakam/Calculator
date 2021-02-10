import java.lang.Math;

public class MagicCalculator extends Calculator{
	
	//Square root of a number
	public static double squareRoot(double num1) {
		return Math.sqrt(num1);
	}
	
	//Sin of a number
	public static double sinNumber(double num1) {
		return Math.sin(num1);
	}
	
	//Cosine of a number
	public static double cosineNumber(double num1) {
		return Math.cos(num1);
	}
	
	//Tangent of a number
	public static double tangentNumber(double num1) {
		return Math.tan(num1);
	}
	
	//Factorial of a number
	public static int factorialNumber(int num1) {
		if(num1 < 0) {
			String num = null;
			return Integer.valueOf(num);
		} else if (num1 == 0 || num1 == 1) {
			return 1;
		} else {
			int factorial  = 1;
			for(int i = 2; i <= num1; i++) {
			factorial = factorial * i;
		}
			return factorial;
		}
	}
	
}
