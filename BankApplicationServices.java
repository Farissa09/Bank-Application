package exceptions.trycatchfinally;

public interface BankApplicationServices {
	
	void mainMenu();
	void checkBalance(BankApplicationSetUp bank);
	void deposit(BankApplicationSetUp bank);
	void withdrawal(BankApplicationSetUp bank);

}
