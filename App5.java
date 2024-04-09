class App5 {
	
	public static void main(String args[]){
		
		// Fill your code here

		int firstFibonacciNumber = 0;
		int secondFibonacciNumber = 1;

		int targetNumber = Integer.parseInt(args[0]);

		int nextNumber = firstFibonacciNumber;

		while (nextNumber < targetNumber) {
			nextNumber = firstFibonacciNumber + secondFibonacciNumber;
			firstFibonacciNumber = secondFibonacciNumber;
			secondFibonacciNumber = nextNumber;

			System.out.println("Fibonacci number = " + nextNumber);

			if (nextNumber == targetNumber) {
				System.out.println(targetNumber + " is a fibonacci number");
			} else if (nextNumber > targetNumber) {
				System.out.println(targetNumber + " is not a fibonacci number");
			}

		}
		
	}
}

