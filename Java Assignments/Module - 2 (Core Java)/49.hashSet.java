// Write a Java program to get the number of elements in a hash set.

import java.util.HashSet;
import java.util.Set;

class fortyNine {
    public static void main(String[] args) {

        Set<String> set = new HashSet<String>();
        set.add("Red");
        set.add("Green");
        set.add("Black");
        set.add("White");
        set.add("Pink");
        System.out.println(set.size());
    }
}