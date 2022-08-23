package AccentureBootcamp.Day3Tasks.Task3_3;


import java.util.Scanner;

/*
3) create a class "BankAccount" with property "balance" (should be decimal number)
    * create empty default constructor for it
    * create a constructor with parameter for setting balance.
    * create a method "deposit" with one parameter "amount" (decimal number)
        which allows the user to increase the balance.
    * create a method "withdraw" with one parameter "amount"
        (decimal number) which allows the user to decrease the balance.
    * create a method "printBalance" which displays the current balance to user
    * method for transfer balance from one bank account to another
*/
public class Task3_3 {
    BankAccount myAccount = new BankAccount();
    BankAccount friendsAccount = new BankAccount(150);
    public Task3_3() {
        Scanner scan= new Scanner(System.in);
        int userChoice;
        boolean c, d, e, f, g;
        String friendsID;
        System.out.println("Welcome to BankForDummies");
        c= true;
        while(c) {
            try {
                System.out.println("1. Acount\n2. Deposit\n3. Withdraw \n4. Transfer $$$");
                System.out.println("Enter choice(1- 4): ");
                userChoice = scan.nextInt();

                if (userChoice == 1) {
                    d= true;
                    while(d) {
                    System.out.println("Your balance is $" + myAccount.printBalance());
                    System.out.println("1. Back\n2. Exit");
                    System.out.println("Enter choice(1- 2): ");
                    userChoice = scan.nextInt();
                        if (userChoice == 1) {
                            c=true;
                            d= false;
                        } else if (userChoice == 2) {
                            System.out.println("Have a nice day pal!");
                            d=false;
                            c= false;
                        } else {
                            System.out.println("Please enter number (1-2)");
                            d= true;
                        }
                    }
                } else if (userChoice == 2) {
                    System.out.println("What amount you want to deposit?: ");
                    myAccount.deposit(scan.nextDouble());
                    e= true;
                    while(e) {
                        System.out.println("Your balance is $" + myAccount.printBalance());
                        System.out.println("1. Back\n2. Exit");
                        System.out.println("Enter choice(1- 2): ");
                        userChoice = scan.nextInt();
                        if (userChoice == 1) {
                            //d = true;
                            e = false;
                        } else if (userChoice == 2) {
                            System.out.println("Have a nice day pal!");
                            e = false;
                            c = false;
                            //d= false;
                        } else {
                            System.out.println("Please enter number (1-2)");
                            e = true;
                        }
                    }
                } else if (userChoice == 3) {
                    double moneyToW;
                    System.out.println("What amount you want to withdraw?: ");
                    moneyToW= scan.nextDouble();
                    myAccount.withdraw(moneyToW);
                    if(moneyToW> 5000) {
                        System.out.println( "Transaction canceled. Max deposit - 5000 | Your deposit: "+myAccount.printBalance());
                    }
                    f= true;
                    while(f) {
                        System.out.println("Your balance is $" + myAccount.printBalance());
                        System.out.println("1. Back\n2. Exit");
                        System.out.println("Enter choice(1- 2): ");
                        userChoice = scan.nextInt();
                        if (userChoice == 1) {
                            //d = true;
                            f = false;
                        } else if (userChoice == 2) {
                            System.out.println("Have a nice day pal!");
                            f = false;
                            c = false;
                            //d= false;
                        } else {
                            System.out.println("Please enter number (1-2)");
                            f = true;
                        }
                    }

                } else if (userChoice == 4) {
                    System.out.println("Who do you want to transfer $$$?");
                    System.out.println("Enter Users ID: ");
                    friendsID= scan.next();
                    System.out.println("What amount you want to transfer to "+friendsID+"?: ");
                    double sendMoney= scan.nextDouble();
                    myAccount.transferFunds(friendsAccount, sendMoney);
                    if(sendMoney> Double.parseDouble(myAccount.printBalance())) {
                        g=true;
                    } else {
                        System.out.println("You succesfully send $"+sendMoney+" to "+friendsID);
                        g= true;
                    }

                    while(g) {

                        System.out.println("Your balance is $" + myAccount.printBalance());
                        System.out.println("1. Back\n2. Exit");
                        System.out.println("Enter choice(1- 2): ");
                        userChoice = scan.nextInt();
                        if (userChoice == 1) {
                            //d = true;
                            g = false;
                        } else if (userChoice == 2) {
                            System.out.println("Have a nice day pal!");
                            g = false;
                            c = false;
                            //d= false;
                        } else {
                            System.out.println("Please enter number (1-2)");
                            g = true;
                        }
                    }
                } else {
                    System.out.println("Please enter number (1-4)");
                    c=true;
                }
            } catch (Exception ex) {
                System.out.println("Error: "+ex);
                c=true;
            }
        }
    }
}
