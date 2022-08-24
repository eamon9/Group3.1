package AccentureBootcamp.Day2Tasks;


import java.util.Scanner;

/**
5) Write a program which reads boolean value from user and prints out the opposite value:
    Example input:
        Enter boolean value: true
    Expected output:
        Opposite of "true" is "false"
*/
public class Task2_5 {
    public Task2_5() {
        boolean userB;
        Scanner in= new Scanner(System.in);
        System.out.println("Enter boolean value: ");
        userB= in.nextBoolean();
        System.out.println(!userB);
        in.close();
    }
}
