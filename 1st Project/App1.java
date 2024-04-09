import java.util.Scanner;

class App1 {
	
		
    // Fill your code here (Factorial Method)

	public int factorialCalculation(int number) {
		int factorial = 1;

		if ((number > 0) && (number != 0)) {
			for (int i = 1; i <= number; i++) {
				factorial *= i;
			}
		} else if (number == 0) {
			factorial = 1;
		}

		return factorial;
	}
		
  	
	public static void main(String args[]){
		
		// Fill your code here
		
		App1 userFactorial = new App1();		

		Scanner input = new Scanner(System.in);

		System.out.print("Give an integer: ");
		int integer = Integer.parseInt(input.nextLine());

		int factorial = userFactorial.factorialCalculation(integer);
		
		System.out.println(integer + "! = " + factorial);
   	}

}

