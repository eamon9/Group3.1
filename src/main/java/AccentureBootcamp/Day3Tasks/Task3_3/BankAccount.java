package AccentureBootcamp.Day3Tasks.Task3_3;

public class BankAccount {
    ConnectAndSelectAccaunt selectApp= new ConnectAndSelectAccaunt();
    UpdateAccaunt updateMoney = new UpdateAccaunt();
    private double balance, friendsBalance;

    public BankAccount() {
        balance = selectApp.selectBalance("Silvia");
    }

    public BankAccount(double b) {
        balance = b;
    }

    public void deposit(double amount) {
        //balance += amount;
        updateMoney.updateMoney("Silvia", String.valueOf(balance + amount));
    }

    public void withdraw(double amount) {
        balance = selectApp.selectBalance("Silvia");
        if (amount > 0) {
            if (balance>=amount) updateMoney.updateMoney("Silvia", String.valueOf(balance - amount));
            else System.out.println("You dont have that such $$$");
        }
    }

    public String printBalance() {
        balance = selectApp.selectBalance("Silvia");
        return ""+balance; //System.out.printf("Balance: %f%n", balance);
    }

    public void transferFunds(BankAccount account, double amount) {
        balance = selectApp.selectBalance("Silvia");
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
