package AccentureBootcamp.Day3Tasks;

/*
2) Declare and initialize an array with four arbitrary whole numbers.
// Write a Java program to copy this array by iterating it.
*/

import java.util.Arrays;
import java.util.Random;

public class Task3_2 {
    public Task3_2() {
        Random r= new Random();
        int[] arbitraryNums= new int[]{r.nextInt(100), r.nextInt(100), r.nextInt(100), r.nextInt(100)};
        System.out.println("default: "+Arrays.toString(arbitraryNums));

        //for loop to copy each number
        int[] copiedArray= new int[arbitraryNums.length];
        for (int i = 0; i < arbitraryNums.length; i++) {
            copiedArray[i]= arbitraryNums[i];
        }
        System.out.println("with for loop: "+Arrays.toString(copiedArray));

        //or you can just use copy array method
        int[] copiedArray2= Arrays.copyOf(arbitraryNums, arbitraryNums.length);
        System.out.println("with method: "+Arrays.toString(copiedArray2));
    }




}
