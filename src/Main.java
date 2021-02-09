
public class Main {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 8;
		
		//Testing Calculator
		System.out.println(Calculator.add(num1, num2));
		System.out.println(Calculator.subtract(num1, num2));
		System.out.println(Calculator.multiply(num1, num2));
		System.out.println(Calculator.divide(num1, num2));
		System.out.println(Calculator.square(num1));
		
		//Testing Magic Calculator
		System.out.println(MagicCalculator.squareRoot(num1));
		System.out.println(MagicCalculator.sinNumber(num1));
		System.out.println(MagicCalculator.cosineNumber(num1));
		System.out.println(MagicCalculator.tangentNumber(num1));
		System.out.println(MagicCalculator.factorialNumber(num1));

	}

}
