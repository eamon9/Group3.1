package AccentureBootcamp.Day2Tasks;

import java.util.Scanner;


/**
6) Write a program which asks the user to input two whole numbers a and b. Output "true", if one of this condition is true:
    1) a and b is equal
    2) a is less than 0 and b is greater than 0
    3) both of them are greater than 100
    otherwise output "false":
    Examples:
        a is -1 and b is -2 -> false
        a is -2 and b is 1 -> true
        a is -1 and b is -1 -> true
        a is 101 and b is 102 -> true
        a is 99 and b is 200 -> false
*/
public class Task2_6 {
    public Task2_6() {
        Scanner in= new Scanner(System.in);
        int a, b;
        System.out.println("Enter value a: ");
        a= in.nextInt();
        System.out.println("Enter value b: ");
        b= in.nextInt();
        boolean answer= a == b || a < 0 && b > 0 || a > 100 && b > 100;
        System.out.println("a is "+a+" and b is "+b+" -> "+answer);
        in.close();
    }
}
