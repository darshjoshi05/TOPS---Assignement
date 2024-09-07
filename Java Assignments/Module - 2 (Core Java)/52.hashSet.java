// Write a Java program to convert a hash set to an array.

import java.util.HashSet;
import java.util.Arrays;
import java.util.ArrayList;

class fiftyTwo {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("Java");
        hashSet.add("Python");
        hashSet.add("C++");
        hashSet.add("C");

        String[] arr = hashSet.toArray(new String[hashSet.size()]);
        System.out.println("Array: " + Arrays.toString(arr));

        // Write a Java program to convert a hash set to a List/Array List.
        ArrayList<String> arrayList = new ArrayList<String>(hashSet);
        System.out.println("ArrayList: " + arrayList);
    }
}