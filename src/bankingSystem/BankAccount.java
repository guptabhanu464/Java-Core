package bankingSystem;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public abstract class BankAccount {

    protected String accountNumber;
    protected double balance;
    protected List<Transaction> transactions = new ArrayList<>();

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction("Deposit",amount));

    }
    abstract void withdraw(double amount) throws InsufficientFundsException;
    public abstract void printAccountDetails();

    public void printTransactions() {
        for (Transaction t : transactions) {
            System.out.println(t);
        }
    }
}

class Transaction {

    String type;
    double amount;
    LocalDateTime timeStamp;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
        this.timeStamp = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "{" +
                "type='" + type + '\'' +
                ", amount=" + amount +
                ", timeStamp=" + timeStamp +
                '}';
    }
}
