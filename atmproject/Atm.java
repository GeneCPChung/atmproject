package atmproject;

public class Atm {
	// Instance Data
	private String requiredPin;
	private double balance;
	
	
	

	// Constructor
	public Atm(String requiredPin, double balance) {
		this.requiredPin = requiredPin;
		this.balance = balance;
		
	}

	// Accessor (getter) method
	
	
	
	
	// Setter (offer changes)


	// Method of behavior
	public boolean allowAcces(String enteredPin) {
		return requiredPin.equals(enteredPin);
		}
	
	public void makeDeposit(double amount) {
		balance += amount;
	}
	void makeWithdraw(double amount) {
		balance -= amount;
	}
	public double getBalance() {
		return balance;
	}
	
	
	
	
	
}

