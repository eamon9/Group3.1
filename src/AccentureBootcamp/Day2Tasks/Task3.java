package AccentureBootcamp.Day2Tasks;

import java.util.Scanner;
/*
3) Ask user to input a whole number and output true, if it is even number and false if it is odd number
    Hint: use remainder operator to divide number by two and get reminder (if reminder is 0 then it means it is even number)-
    */

public class Task3 {
    public Task3() {
        int userNum;
        Scanner in= new Scanner(System.in);
        System.out.println("Input a whole number: ");
        userNum= in.nextInt();
        if(userNum%2== 0) {
            System.out.println("Your number is even");
        } else{
            System.out.println("Your number is odd");
        }
        in.close();
    }
}
