package bankingSystem;

public class CheckingAccount extends BankAccount{

    private double overdraftLimit;

    CheckingAccount(String accountNumber, double amount, double overdraftLimit) {
        super(accountNumber,amount);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    void withdraw(double amount) throws InsufficientFundsException {
        if(amount > balance + overdraftLimit) {
            throw new InsufficientFundsException("Insufficient Balance in Checking Account");
        }
        balance -= amount;
        transactions.add(new Transaction("Withdrawal",amount));
    }

    @Override
    public void printAccountDetails() {
        System.out.println("Checking Account with account Number : " +
                accountNumber + " Balance : " + balance + " OverDraft Limit : " + overdraftLimit);
    }
}
