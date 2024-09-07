// Write a Java program to append the specified element to the end of a hash set.

import java.util.LinkedHashSet;
import java.util.Set;

class fortySeven {

    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<String>();
        set.add("Red");
        set.add("Green");
        set.add("Black");
        set.add("White");
        set.add("Pink");

        System.out.println("Original Hash Set: " + set);
        set.add("Purple");
        System.out.println("Updated Hash Set: " + set);
    }
}