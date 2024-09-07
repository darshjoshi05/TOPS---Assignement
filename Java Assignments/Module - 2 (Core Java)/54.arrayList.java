// Write a Java program to increase the size of an array list.

import java.util.ArrayList;

class fiftyFour {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Red");
        list.add("Green");
        list.add("Black");
        list.add("White");
        list.add("Pink");

        System.out.println("Original ArrayList: " + list);
        list.ensureCapacity(10);
        System.out.println("Updated ArrayList: " + list);

        // Write a Java program to replace the second element of an Array List with the
        // specified element.

        list.set(1, "Yellow");
        System.out.println("Replaced Element: " + list);

        // Write a Java program to print all the elements of an Array List using the
        // position of the elements.

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}