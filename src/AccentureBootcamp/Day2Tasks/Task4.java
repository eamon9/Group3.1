package AccentureBootcamp.Day2Tasks;


/*
4) Ask user to input a whole number and output false, if it is even number and true if it is odd number
*/

import java.util.Scanner;

public class Task4 {
    public Task4() {
        int userNum;
        Scanner in= new Scanner(System.in);
        System.out.println("Input a whole number: ");
        userNum= in.nextInt();
        System.out.println(userNum % 2 == 0);
    }
}
