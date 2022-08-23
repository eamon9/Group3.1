package AccentureBootcamp.Day4Tasks;



/*
TreeSet

* 1.Write a Java program to create a new tree set, add some colors (string) and print out the tree set.
* 2.iterate through all elements in a tree set.
* 3.add all the elements of a specified tree set to another tree set.
* 4.create a reverse order view of the elements contained in a given tree set.
* 5.get the first and last elements in a tree set.
* 6.clone a tree set list to another tree set.
* 7.get the number of elements in a tree set.
* 8.compare two tree sets.
* 9.find the numbers less than 7 in a tree set.
* 10.get the element in a tree set which is greater than or equal to the given element.
* 11.get the element in a tree set which is less than or equal to the given element.
* 12.get the element in a tree set which is strictly greater than or equal to the given element.
* 13.get an element in a tree set which is strictly less than the given element.
* 14.retrieve and remove the first element of a tree set.
* 15.retrieve and remove the last element of a tree set.
* 16.remove a given element from a tree set.
*/

import java.util.TreeSet;

public class Task4_4 {
    public Task4_4() {

        TreeSet<String> tsColors= new TreeSet<>();
        tsColors.add("Yellow");
        tsColors.add("Purple");
        tsColors.add("Pink");
        tsColors.add("Red");
        tsColors.add("SkyBlue");
        System.out.println("ORIGINAL List of colors: "+tsColors);

        //1
        tsColors.add("Silver");
        tsColors.add("Orange");
        getSet(tsColors, 1);

        //2
        getSet(2);
        for (int i = 0; i < tsColors.size(); i++) {
            System.out.print(tsColors.toArray()[i]+" ");
        }
        System.out.println();

        //3
        getSet(3);
        TreeSet<String> tsColorsByUser= new TreeSet<>();
        tsColorsByUser.add("Green");
        tsColorsByUser.add("Black");
        tsColorsByUser.add("White");
        System.out.println("ORIGINAL List of USER colors: "+tsColorsByUser);
        tsColors.addAll(tsColorsByUser);
        System.out.println(tsColors);

        //4
        getSet(4);
        for (int i = tsColors.size()-1; i >= 0; i--) {
            System.out.print(tsColors.toArray()[i]+" ");
        }
        System.out.println();

        //5
        getSet(5);
        System.out.println("First element: "+tsColors.first());
        System.out.println("Last element: "+tsColors.last());

        //6
        getSet(6);
        TreeSet<String> tsClonedSet= (TreeSet)tsColors.clone();
        System.out.println("Cloned set: "+ tsClonedSet);

        //7
        getSet(7);


        //8
        getSet(8);

        //9
        getSet(9);

        //10
        getSet(10);

        //11
        getSet(11);

        //12
        getSet(12);

        //13
        getSet(13);

        //14
        getSet(14);

        //15
        getSet(15);

        //16
        getSet(16);

    }

    void getSet(int task) {
        System.out.println(task+".");
    }

    void getSet(TreeSet treeSet, int task) {
        if(task!=0) {
            System.out.println(task + ".");
        }
        for (int i = 0; i < treeSet.size(); i++) {
            System.out.print(treeSet.toArray()[i]+" ");
        }
        System.out.println();
    }
}
