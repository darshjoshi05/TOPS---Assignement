// 1. Write a Java program to create a new array list, add some colors (string) and print out the collection. Write a Java program to iterate through all elements in an array list.

// 2. Write a Java program to iterate through all elements in an array list.

// 3. Write a Java program to insert an element into the array list at the first position.

// 4. Write a Java program to retrieve an element (at a specified index) from a given array list.

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

class fortySix {

    public static void main(String[] args) {

        // 1.
        ArrayList<String> list = new ArrayList<String>();
        list.add("Red");
        list.add("Green");
        list.add("Orange");
        list.add("White");
        list.add("Black");

        // 2.
        for (String str : list) {
            System.out.println(str);
        }

        // 3.
        list.add(0, "Pink");
        System.out.println(list);

        // 4.
        System.out.println(list.get(0));

        // 5. Write a Java program to update specific array element by given element.
        list.set(0, "Blue");
        System.out.println(list);

        // 6. Write a Java program to remove the third element from an array list.
        list.remove(2);
        System.out.println(list);

        // 7. Write a Java program to search an element in an array list.
        System.out.println(list.contains("White"));

        // 8. Write a Java program to sort a given array list.
        list.sort(null);
        System.out.println(list);

        // 9. Write a Java program to copy one array list into another.
        ArrayList<String> list2 = new ArrayList<String>();
        list2.addAll(list);
        System.out.println("List 2: " + list2);

        // 10. Write a Java program to shuffle elements in an array list.
        Random r = new Random();
        int low = 0;
        int high = 5;

        for (int i = 0; i < 5; i++) {
            int random1 = r.nextInt(high - low) + low;
            int random2 = r.nextInt(high - low) + low;

            String temp = list.get(random1);
            list.set(random1, list.get(random2));
            list.set(random2, temp);
        }
        System.out.println("Random: " + list);

        Collections.shuffle(list);
        System.out.println("Collections: " + list);

    }
}