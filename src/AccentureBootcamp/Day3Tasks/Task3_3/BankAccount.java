package AccentureBootcamp.Day3Tasks.Task3_3;

public class BankAccount {
    private double balance, friendsBalance;

    public BankAccount() {
        balance = 150;
    }

    public BankAccount(double b) {
        balance = b;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance>=amount) balance -= amount;
            else System.out.println("You dont have that such $$$");
        }
    }

    public String printBalance() {
        return ""+balance; //System.out.printf("Balance: %f%n", balance);
    }

    public void transferFunds(BankAccount account, double amount) {
        if (amount <= 0) {
            System.out.println("You are in bad situation, no money to send =(");
            return;
        }else if (balance < amount) {
            System.out.println("You dont have that such $$$");
            return;
        } else {
            friendsBalance+= amount;
        }
        this.withdraw(amount);
        account.deposit(amount);
    }
}
