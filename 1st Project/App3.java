import java.util.Scanner;

class App3 {
	
	public static void main(String args[]){
		
		// Fill your code here

		Scanner input = new Scanner(System.in);

		int items = 0;
		int integersSum = 0;
		double average = 0;
		int negativesSum = 0;
		int positivesSum = 0;
		int maxInteger = 0;
		int minInteger = 0;

		while (true) {
			System.out.print("Give a number: ");
			int number = Integer.parseInt(input.nextLine());

			if (number == 0) {
				break;
			}

			if (number != 0) {
				items++;
				integersSum += number;

				if (number < 0) {
					negativesSum++;
				} else {
					positivesSum++;
				}

				if (number > maxInteger) {
					maxInteger = number;
				}

				if (number < minInteger) {
					minInteger = number;
				}
			}


		}

		average = (integersSum * 1.0 / items);

		System.out.println();

		System.out.format("Items   : %,8d%n", items);
		System.out.format("Average : %,12.3f%n", average);
		System.out.format("Negative: %,8d%n", negativesSum);
		System.out.format("Positive: %,8d%n", positivesSum);
		System.out.format("Max     : %,8d%n", maxInteger);
		System.out.format("Min     : %+,8d%n", minInteger);

		
   	}

}

