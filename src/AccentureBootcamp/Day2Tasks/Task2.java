package AccentureBootcamp.Day2Tasks;

import java.util.Scanner;

/*
    2) Ask user to input two boolean values and compare them.
    Input:
       Enter b1: true
       Enter b2: false
    Expected output:
       Is b1 and b2 equal? - false
*/
public class Task2 {
    public Task2() {
        boolean b1, b2;
        Scanner in= new Scanner(System.in);
        System.out.println("Enter b1: ");
        b1= in.nextBoolean();
        System.out.println("Enter b2: ");
        b2= in.nextBoolean();
        System.out.println("Is "+b1+" and "+b2+" equal? -"+(b1==b2));
        in.close();
    }
}
