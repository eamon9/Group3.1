package AccentureBootcamp.Day4Tasks;


/*
HashSet

* 1.Write a Java program to append the specified element to the end of a hash set.
* 2.iterate through all elements in a hash list.
* 3.get the number of elements in a hash set.
* 4.empty a hash set.
* 5.test a hash set is empty or not.
* 6.clone a hash set to another hash set.
* 7.convert a hash set to an array.
* 8.convert a hash set to a tree set.
* 9.convert a hash set to a List/ArrayList.
* 10.compare two hash set.
* 11.compare two sets and retain elements which are same on both sets.
* 12.remove all of the elements from a hash set.
* */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Task4_3 {
    public Task4_3() {

        HashSet<String> hs= new HashSet<>();
        hs.add("Audi");
        hs.add("BMW");
        hs.add("Citroen");
        hs.add("Bentley");
        hs.add("VW");
        hs.add("Ford");
        System.out.println("ORIGINAL List: "+hs);

        //1
        hs.add("Opel");
        getSet(hs, 1);

        //2
        getSet(2);
        for (String s : hs) {
            System.out.print(s+" ");
        }
        System.out.println();

        //3
        getSet(3);
        System.out.println("Set has "+hs.size()+" elements");

        //4
        hs.clear();
        getSet(hs, 4);

        //5
        getSet(5);
        if(hs.isEmpty()) {
            System.out.println("List is empty");
        } else{
            System.out.println("List is not empty list consists of "+hs.size()+" elements");
        }

        //6
        hs.add("80");
        hs.add("X6");
        hs.add("C9");
        hs.add("Boost");
        hs.add("Jetta");
        hs.add("Mustang");

        HashSet<String> newHs= new HashSet<>();
        newHs.add("Rabbit");
        newHs.add("Dog");
        newHs.add("Cat");
        newHs.add("Giraffe");
        newHs.add("Pantera");

        //newHs.addAll(hs);
        newHs= (HashSet)hs.clone();
        getSet(newHs, 6);

        //7
        getSet(7);
        String[] markArray= new String[hs.size()];
        hs.toArray(markArray);
        System.out.print("Array elements:");
        for (int i = 0; i < markArray.length; i++) {
            System.out.print(" "+markArray[i]);
        }
        System.out.println();

        //8
        getSet(8);
        Set<String> treeSet = new TreeSet<>(hs);
        for(String element : treeSet){
            System.out.print(element+" ");
        }
        System.out.println();

        //9
        getSet(9);
        ArrayList<String> arrayList = new ArrayList<>(hs);
        for(String element : arrayList){
            System.out.print(element+" ");
        }
        System.out.println();

        //10
        getSet(10);
        for (String element : hs){
            if (newHs.contains(element)) {
                System.out.println("Yes identical");
            }
            else System.out.println("No there are differences");
        }

        //11
        getSet(11);
        newHs.remove("Boost");
        newHs.remove("X6");
        newHs.remove("C9");
        newHs.add("Škoda");
        newHs.add("Ferrari");

        System.out.println("newHs SetL: "+newHs);
        hs.retainAll(newHs);
        System.out.println(hs);

        //12
        getSet(12);
        hs.clear();
        System.out.println(hs);
    }

    void getSet(int task) {
        System.out.println(task+".");
    }

    void getSet(HashSet hashSet, int task) {
        if(task!=0) {
            System.out.println(task + ".");
        }
        for (int i = 0; i < hashSet.size(); i++) {
            System.out.print(hashSet.toArray()[i]+" ");
        }
        System.out.println();
    }
}
