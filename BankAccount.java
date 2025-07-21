
public class BankAccount {
    
    private String accountHolderName;
    private String bankName;
    private double accountBalance;

    
    public BankAccount(String accountHolderName, String bankName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.bankName = bankName;
        this.accountBalance = initialBalance;
    }

    
    public double getBalance() {
        return accountBalance;
    }


    public void deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
            System.out.println(accountHolderName + " deposited ₹" + amount + " to " + bankName);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println(accountHolderName + " withdrew ₹" + amount + " from " + bankName);
        } else {
            System.out.println("Invalid or insufficient funds for withdrawal.");
        }
    }

    
    public void displayBalance() {
        System.out.println(accountHolderName + " - " + bankName + " Balance: ₹" + accountBalance);
    }

    
    public static void main(String[] args) {
        
        BankAccount account1 = new BankAccount("Alice", "ICICI", 5000);
        BankAccount account2 = new BankAccount("Bob", "HDFC", 10000);
        BankAccount account3 = new BankAccount("Charlie", "SBI", 7500);

        
        account1.deposit(2000);
        account1.withdraw(1000);
        account1.displayBalance();

        account2.deposit(3000);
        account2.withdraw(5000);
        account2.displayBalance();

        account3.deposit(1500);
        account3.withdraw(9000); 
        account3.displayBalance();
    }
}
