package bankingSystem;

public class SavingAccount extends BankAccount{

    private float interestRate;

    public SavingAccount(String accountNumber , double balance,float interestRate) {
        super(accountNumber,balance);
        this.interestRate = interestRate;
    }


    @Override
    void withdraw(double amount) throws InsufficientFundsException {
        if(amount > balance) {
            throw new InsufficientFundsException("Insufficient Balance in Saving Account");
        }
        balance -= amount;
        transactions.add(new Transaction("Withdrawal" , amount));
    }

    @Override
    public void printAccountDetails() {
        System.out.println("Savings Account with account Number : " +
                accountNumber + " Balance : " + balance + " Interest Rate : " + interestRate);
    }

    public double calculateInterest() {
        return (balance * interestRate) / 100;
    }

}
