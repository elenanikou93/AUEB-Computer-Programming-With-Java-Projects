import java.util.Locale;

class Account {

   	// Fill your code here

	final double interest;
	String customerName;
	String accountNumber;
	double balance;

   	

   	Account(String customerName, String accountNumber, double balance) {
		
		// Fill your code here

		this.interest = 0.015;
		this.customerName = customerName;
		this.accountNumber = accountNumber;
		this.balance = balance;

   	}

   	double Deposit (double Amount){
		
		// Fill your code here

		if (Amount > 0) {
			this.balance += Amount;
		} else {
			System.out.println("Error: Deposit Amount is invalid");
		}

		return this.balance;

   	}

	double Withdraw (double Amount) {
		
		// Fill your code here

		if (Amount > 0) {
			if (this.balance > Amount) {
				this.balance -= Amount;
			} else if (this.balance < Amount) {
				System.out.println("Error: Insufficient funds");
			}			
		} else {
			System.out.println("Error: Withdraw Amount is invalid");
		}

		return this.balance;
   	}

	double getBalance (){
		
		// Fill your code here

		return this.balance;
	}

   	double addInterest (){
		
		// Fill your code here

		this.balance += this.balance * this.interest;

		return this.balance;
	}

   	public String toString(){
		
		// Fill your code here
		
		return "Account Number : " + this.accountNumber + "\nCustomer Name  : " + this.customerName + "\nBalance        : " + String.format(Locale.GERMAN, "%,.2f", this.balance);
   	}
}
