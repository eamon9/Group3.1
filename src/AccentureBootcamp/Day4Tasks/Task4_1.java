package AccentureBootcamp.Day4Tasks;

/*
Array List

* 1. Write a Java program to create a new array list, add some colors (string) and print out the collection.
* 2. to iterate through all elements in a array list.
* 3. to insert an element into the array list at the first position.
* 4. to retrieve an element (at a specified index) from a given array list.
* 5. to update specific array element by given element.
* 6. to remove the third element from a array list.
* 7. to search an element in a array list.
* 8. to sort a given array list.
* 9. to copy one array list into another.
* 10. to shuffle elements in a array list.
* 11. to reverse elements in a array list.
* 12. to extract a portion of a array list.
* 13. to compare two array lists.
* 14. of swap two elements in an array list.
* 15. to join two array lists.
* 16. to clone an array list to another array list.
* 17. to empty an array list.
* 18. to test an array list is empty or not.
* 19. to trim the capacity of an array list the current list size.
* 20. to increase the size of an array list.
* 21. to replace the second element of a ArrayList with the specified element.
* 22. to print all the elements of a ArrayList using the position of the elements.
* */

import java.util.ArrayList;
import java.util.Collections;

public class Task4_1 {
    public Task4_1() {

        //1. and 2.
        ArrayList<String> colors= new ArrayList<>();
        colors.add("White");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Pink");

        System.out.println("All colors by DEFAULT: ");
        for (int i = 0; i < colors.size(); i++) {
            System.out.print(colors.get(i)+" ");
        }
        System.out.println();
        //3.
        colors.add(0, "Green");
        getColors(colors, 3);
        //4.
        String color1= colors.get(2);
        getColors(colors, 4);
        //5.
        colors.set(1, "Silver");
        getColors(colors, 5);
        //6.
        colors.remove(2);
        getColors(colors, 6);
        //7.
        nr(7);
        System.out.println("Index of \"Blue\" color- "+colors.indexOf("Blue"));
        //8
        Collections.sort(colors);
        getColors(colors, 8);
        System.out.println(".....sorted colors.....");
        //9
        ArrayList<String> sortedColors= new ArrayList<>();
        for (int i = 0; i < colors.size(); i++) {
            sortedColors.add(colors.get(i));
        }
        getColors(sortedColors, 9);
        System.out.println("...sortedColors List...");
        //10
        Collections.shuffle(colors);
        getColors(colors, 10);
        System.out.println("....shuffled colors....");
        //11
        Collections.reverse(colors);
        getColors(colors, 11);
        System.out.println("....reversed colors....");
        //12
        ArrayList<String> tempList= new ArrayList<>();
        for (int i = 0; i < colors.size(); i++) {
            if(i>=1 && i<colors.size()-1) {
                tempList.add(colors.get(i));
            }
        }
        getColors(tempList, 12);
        //13
        getColors(colors, 13);
        getColors(sortedColors, 13);
        System.out.println("Compare two arrayLists: "+colors.equals(sortedColors));
        //14
        colors.set(0, colors.set(2, colors.get(0)));
        // or just use Collections.swap(colors, 1, 4);
        getColors(colors, 14);
        //15
        colors.addAll(sortedColors);
        getColors(colors, 15);
        //16
        ArrayList newList= (ArrayList) colors.clone();
        getColors(newList, 16);
        System.out.println("................cloned colors.................");
        //17
        newList.clear();
        getColors(newList, 17);
        System.out.println("................cleared List..................");
        //18
        System.out.println("Is colors array is empty? : "+colors.isEmpty());
        //19
        colors.trimToSize(); //but I don't get it, what is different without trim...
        getColors(colors, 19);
        //20
        //Is it possible to change size after initialization?
        //21
        colors.set(4, "SkyBlue");
        getColors(colors, 21);
        //22
        System.out.println("22.");
        for (int i = 0; i < colors.size(); i++) {
            System.out.print(i+1+"."+colors.get(i)+" ");
        }

    }

    void getColors(ArrayList colors, int task) {
        System.out.println(task+".");
        for (int i = 0; i < colors.size(); i++) {
            System.out.print(colors.get(i)+" ");
        }
        System.out.println();
    }
    void nr(int task) {
        System.out.println(task+".");
    }
}
