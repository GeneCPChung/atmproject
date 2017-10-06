package atmproject;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AtmClientApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		

		Atm account = new Atm("1234", 100);
		System.out.println("welcome, please enter your pin");

		String enteredPin = input.nextLine();
		while (!account.allowAcces(enteredPin)) {
			System.out.println("Sorry, wrong Pin.\nPlease try again: ");
			enteredPin = input.nextLine();
		}
		System.out.println("Welcome! Your current balance is: $" + account.getBalance());
		while (account.allowAcces(enteredPin)) {
			System.out.println(
					"\nWhat would you like to do:\n1: Deposit Funds\n2: Withdraw Funds\n3: Check Balance\n4: Exit");
			String opt1 = input.next();
			
				
			if (opt1.equals("1")) {
				System.out.println("Enter a deposit amount");
				double depositAmount = input.nextDouble();
				account.makeDeposit(depositAmount);
				System.out.println("Thanks for your deposit! Your new balance is: $" + account.getBalance());
			}
			if (opt1.equals("2")) {
				double withdrawAmount = 0;
				try {System.out.println("Please enter an amount to withdraw: ");				
				withdrawAmount = input.nextDouble();
				}catch(InputMismatchException e) {
					System.out.println("Invalid Input. Please try again");
				}
				while (withdrawAmount > account.getBalance()) {
					System.out.println("Sorry, Please try again");
					withdrawAmount = input.nextDouble();
					}
				account.makeWithdraw(withdrawAmount);		
				System.out.println("Thank you, your new balance is: $" + account.getBalance());
			
			}
			
			if (opt1.equals("3")) {
				System.out.println("Your current balance is: $" + account.getBalance());
			}
			if (opt1.equals("4")) {
				System.out.println("Thank you for stopping by!");
				System.exit(0);
			}

		}

	}
}
