package AccentureBootcamp.Day3Tasks;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/*
1) Write a program which creates two dimensional
// array and stores a multiplication table (from 1 - 10) in it.
    Example of output:
        1 * 1 = 1
        1 * 2 = 2
        1 * 3 = 3
        ....
        10 * 9 = 90
        10 * 10 = 100
    Hint:
       1) don't forget that you have to save the values in the array and output them from the array.
       2) Arrays should be the size of [10][10]
*/
public class Task3_1 {
    public Task3_1() {
        int rows= 1;
        int columns= 1;

        int[][] calculator= new int[10][10];
        for (int i = 0; i < calculator.length; i++) {
            for (int j = 0; j < calculator[i].length; j++) {
                calculator[i][j]= rows*columns;
                columns++;
            }
            rows++;
            columns= 1;
        }

        for (int i = 0; i < calculator.length; i++) {
            for (int j = 0; j < calculator[i].length; j++) {
                System.out.print(" "+calculator[i][j]+"\t");
            }
            System.out.print("\n");
        }

        //System.out.println(Arrays.deepToString(calculator));

        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number you want to multiply: ");

        int num = in.nextInt();
        for(int i = 1; i <= 10; ++i)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
    }
}
