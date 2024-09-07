// Write a Java program to reverse elements in an array list.

import java.util.ArrayList;
import java.util.Collections;

class fiftyOne {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Red");
        list.add("Green");
        list.add("Black");
        list.add("White");
        list.add("Pink");

        System.out.println("Reversed ArrayList: " + list.reversed());

        // Write a Java program to extract a portion of an array list.
        System.out.println("Sub List: " + list.subList(2, 4));

        // Write a Java program to compare two array lists.
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Purple");
        list1.add("Orange");
        list1.add("Violet");
        list1.add("Indigo");
        list1.add("Brown");
        System.out.println("Is list1 equal to list? " + list1.equals(list));

        // Write a Java program of swap two elements in an array list.
        Collections.swap(list, 0, 2);
        System.out.println("Swapped ArrayList: " + list);

        // Write a Java program to join two array lists.
        list.addAll(list1);
        System.out.println("Joined ArrayList: " + list);
    }
}