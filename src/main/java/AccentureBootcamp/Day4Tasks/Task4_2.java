package AccentureBootcamp.Day4Tasks;

/*
Linked List

* 1.Write a Java program to append the specified element to the end of a linked list.
* 2.iterate through all elements in a linked list.
* 3.iterate through all elements in a linked list starting at the specified position.
* 4.iterate a linked list in reverse order.
* 5.insert the specified element at the specified position in the linked list.
* 6.insert elements into the linked list at the first and last position.
* 7.insert the specified element at the front of a linked list.
* 8.insert the specified element at the end of a linked list.
* 9.insert some elements at the specified position into a linked list.
* 10.get the first and last occurrence of the specified elements in a linked list.
* 11.display the elements and their positions in a linked list.
* 12.remove a specified element from a linked list.
* 13.remove first and last element from a linked list.
* 14.remove all the elements from a linked list.
* 15.swap two elements in a linked list.
* 16.shuffle the elements in a linked list.
* 17.join two linked lists.
* 18.clone an linked list to another linked list.
* 19.remove and return the first element of a linked list.
* 20.retrieve but does not remove, the first element of a linked list.
* 21.retrieve but does not remove, the last element of a linked list.
* 22.check if a particular element exists in a linked list.
* 23.convert a linked list to array list.
* 24.compare two linked lists.
* 25.test an linked list is empty or not.
* 26.replace an element in a linked list.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Task4_2 {

    public Task4_2() {
        LinkedList<String> ll= new LinkedList<>();
        ll.add("Fredy");
        ll.add("Night");
        ll.add("Rinald");
        ll.add("Henry");
        ll.add("City");
        System.out.println("ORIGINAL List: "+ll);

        //1
        ll.add("Element =D");
        getList(ll, 1);

        //2
        getList(2);
        for (String s : ll) {
            System.out.println(s);
        }

        //3
        getList(3);
        for (int i = 3; i < ll.size(); i++) {
            System.out.println(ll.get(i));
        }

        //4
        getList(4);
        for (int i = ll.size()-1; i >= 0; i--) {
            System.out.println(ll.get(i));
        }

        //5
        ll.set(2, "Tippy");
        getList(ll, 5);

        //6
        ll.set(0, "Citrus");
        ll.set(ll.size()-1, "Lemon");
        getList(ll, 6);

        //7
        String fElement= "I_wont_to_be_First";
        ll.addFirst(fElement);
        getList(ll, 7);

        //8
        String lElement= "I_wont_to_be_Last";
        ll.addLast(lElement);
        getList(ll, 8);

        //9
        ll.set(3, "Me");
        ll.set(5, "Me to");
        getList(ll, 9);

        //10
        getList(10);
        String element1= ll.getFirst();
        String element2= ll.getLast();
        System.out.println("First element- "+element1+"\nLast element- "+element2);

        //11
        getList(11);
        for (int i = 0; i < ll.size(); i++) {
            System.out.print(" "+i+"."+ll.get(i));
            if(i==ll.size()-1) {
                System.out.println();
            }
        }

        //12
        ll.remove("Night");
        getList(ll, 12);

        //13
        ll.removeFirst();
        ll.removeLast();
        getList(ll, 13);

        //14
        ll.clear();
        getList(ll, 14);

        //15
        getList(15);
        ll.add("Felix");
        ll.add("Zix");
        ll.add("Nell");
        ll.add("Creepy");
        ll.add("Sam");
        getList(ll, 0);
        Collections.swap(ll, 0, 3);
        getList(ll, 0);

        //16
        Collections.shuffle(ll);
        getList(ll, 16);

        //17
        LinkedList<String> ll2= new LinkedList<>();
        ll2.add("Mouse");
        ll2.add("Tiger");
        ll2.add("Cat");
        ll2.add("Aligator");
        ll.addAll(ll2);
        getList(ll, 18);

        //18
        LinkedList ll3= (LinkedList)ll2.clone();
        getList(ll3, 18);

        //19
        getList(19);
        ll.pop();
        String removedElemet= ll.pop();
        System.out.println("Removed element: "+removedElemet);
        getList(ll, 0);

        //20
        getList(20);
        String firstElement= ll.getFirst();
        System.out.println("First element of string: "+firstElement);

        //21
        getList(21);
        String lastElement= ll.getLast();
        System.out.println("Last element of string: "+lastElement);

        //22
        getList(22);
        if(ll.contains("Aligator")) {
            System.out.println("Yes list contains element");
        } else{
            System.out.println("No, element doesn't exist");
        }

        //23
        getList(23);
        ArrayList<String> linkedToArrayList= new ArrayList<>();
        linkedToArrayList.addAll(ll);
        System.out.println(linkedToArrayList);

        //24
        getList(24);
        System.out.println(ll.containsAll(ll2));
        System.out.println(ll);
        System.out.println(ll2);
        for (int i = 0; i < ll.size(); i++) {
            if(i> ll2.size()-1) {
                break;
            } else {
                if (ll.contains(ll2.get(i))) {
                    System.out.println("YES, \"" + ll2.get(i) + "\" are on both lists");
                } else {
                    System.out.println("NO, \"" + ll2.get(i) + "\" are not on both lists");
                }
            }
        }

        //25
        getList(25);
        if(ll.isEmpty()) {
            System.out.println("List is empty");
        } else{
            System.out.println("List is not empty list consists of "+ll.size()+" elements");
        }

        //26
        ll.set(3, "Superior");
    }

    void getList(int task) {
        System.out.println(task+".");
    }

    void getList(LinkedList linkedList, int task) {
        if(task!=0) {
            System.out.println(task + ".");
        }
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.print(linkedList.get(i)+" ");
        }
        System.out.println();
        }

}
