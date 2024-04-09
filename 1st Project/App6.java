import java.util.Locale;
import java.util.Scanner;

class App6  {

	public static void main(String args[]) {
		
		// Fill your code here

		Scanner input = new Scanner(System.in);

		System.out.println("Creating an account");
		System.out.print("Account Number  : ");
		String accountNumber = input.nextLine();
		System.out.print("Customer name   : ");
		String customerName = input.nextLine();
		System.out.print("Initial Balance : ");
		double balance = Double.parseDouble(input.nextLine());

		
    	Account Account1 = new Account(customerName, accountNumber, balance);

    		
		for (;;){
			System.out.println ("\n---------------");
			System.out.println ("1. Deposit");
			System.out.println ("2. Withdraw");
			System.out.println ("3. Account Details");
			System.out.println ("4. Add Interest");
			System.out.println ("0. Exit");
			System.out.println ("---------------");
			System.out.print ("> ");
			int choice = Integer.parseInt(input.nextLine());
			if (choice == 1){
				
				// Fill your code here

				System.out.println("Deposit ...");
				System.out.println(Account1.toString());
				System.out.print("Amount: ");
				double amount = Double.parseDouble(input.nextLine());
				Account1.Deposit(amount);
				System.out.println("New Balance    : " + String.format(Locale.GERMAN, "%,.2f", Account1.getBalance()));

			}
			else if (choice == 2) {
				
				// Fill your code here

				System.out.println("Withdraw ...");
				System.out.println(Account1.toString());
				System.out.print("Amount: ");
				double amount = Double.parseDouble(input.nextLine());
				Account1.Withdraw(amount);
				System.out.println("New Balance    : " + String.format(Locale.GERMAN, "%,.2f", Account1.getBalance()));
			

			}
			else if (choice == 3) {
				
				// Fill your code here

				System.out.println(Account1.toString());

			}
			else if (choice == 4) {
				
				// Fill your code here

				System.out.println("Add interest");
				System.out.println(Account1.toString());
				Account1.addInterest();
				System.out.println("New Balance    : " + String.format(Locale.GERMAN, "%,.2f", Account1.getBalance()));
			}
			else if (choice == 0) break;
		}

   }

}