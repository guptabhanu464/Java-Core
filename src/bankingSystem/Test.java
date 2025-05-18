package bankingSystem;

public class Test {

    public static void main(String[] args) {

        try{

            BankAccount savingAccount = new SavingAccount("1234453",1000d , 4.2f);
            BankAccount checkingAccount = new CheckingAccount("234534",1000d,80);

            savingAccount.printAccountDetails();
            checkingAccount.printAccountDetails();

            savingAccount.withdraw(999d);
            checkingAccount.withdraw(1921d);

            savingAccount.deposit(120d);
            checkingAccount.deposit(100d);

            savingAccount.withdraw(10d);
            checkingAccount.withdraw(50d);

            savingAccount.printAccountDetails();
            checkingAccount.printAccountDetails();


            savingAccount.printTransactions();
            checkingAccount.printTransactions();



        } catch (InsufficientFundsException e) {
            System.out.println("Exception Message : " + e.getMessage());
        }



    }
}
