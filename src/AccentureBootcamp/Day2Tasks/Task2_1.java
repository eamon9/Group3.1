package AccentureBootcamp.Day2Tasks;

import java.util.Scanner;

/*
1) Ask user to input two numbers, compare them and output result:
   Input:
       Enter value a: 10
       Enter value b: 10
   Expected output:
       is 10 equal to 10? - true
       is 10 less than 10? - false
       is 10 less or equal to 10? - true
       is 10 greater than 10? - false
       is 10 greater or equal to 10? - true
*/

public class Task2_1 {
    public Task2_1() {
        Scanner in= new Scanner(System.in);
        int a, b;
        System.out.println("Enter value a: ");
        a= in.nextInt();
        System.out.println("Enter value b: ");
        b= in.nextInt();
        System.out.println(MathTasks(a, b));
        in.close();
    }

    public String MathTasks(int a, int b) {
        String isEqual= "is "+a+" equal to "+b+"? -"+(a==b)+"\n";
        String isLessThan= "is "+a+" less than "+b+"? -"+(a<b)+"\n";
        String isLessOrEqual= "is "+a+" less or equal to "+b+"? -"+(a<=b)+"\n";
        String isGreater= "is "+a+" greater than "+b+"? -"+(a>b)+"\n";
        String isGreaterOrEqual= "is "+a+" greater or equal to "+b+"? -"+(a>=b);
        return isEqual+isLessThan+isLessOrEqual+isGreater+isGreaterOrEqual;
    }
}
