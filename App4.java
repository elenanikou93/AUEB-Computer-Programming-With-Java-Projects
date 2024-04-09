import java.util.Scanner;
import java.math.*;

class App4 {
	
	public static void main(String args[]){
	
		// Fill your code here

		Scanner userInput = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		double a = Double.parseDouble(userInput.nextLine());

		System.out.print("Enter the second number: ");
		double b = Double.parseDouble(userInput.nextLine());

		System.out.print("Enter the third number: ");
		double c = Double.parseDouble(userInput.nextLine());

		
		double discriminant = ((Math.pow(b, 2)) - 4 * (a * c));

		if (discriminant >= 0) {
			double numerator1 = ((-1) * b) + (Math.sqrt(discriminant));
			double numerator2 = ((-1) * b) - (Math.sqrt(discriminant));
			double denominator = (2 * a);
			double root1 = numerator1 / denominator;
			double root2 = numerator2 / denominator;
			System.out.format("The first solution is : %,.3f%n", root1);
			System.out.format("The second solution is : %,.3f%n", root2);
		} else if (discriminant < 0) {
			System.out.format("There are no real values for the quadratic equation.");
		}
		
	}
		
}


