// Write a Java program to compare two sets and retain elements which are same on both sets.

import java.util.HashSet;
import java.util.Set;

class fiftyFive {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<String>();
        set1.add("Red");
        set1.add("Green");
        set1.add("Black");
        set1.add("White");
        set1.add("Pink");

        Set<String> set2 = new HashSet<String>();
        set2.add("Red");
        set2.add("Black");
        set2.add("Pink");
        set2.add("Yellow");
        set2.add("Orange");
        set1.retainAll(set2);

        System.out.println(set1);
    }
}
