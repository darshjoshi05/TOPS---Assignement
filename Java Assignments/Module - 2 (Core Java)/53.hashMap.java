// Write a Java program to check whether a map contains key-value mappings (empty) or not.

import java.util.HashMap;
import java.util.Map;

class fiftyThree {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Black");
        map.put(4, "White");
        map.put(5, "Pink");

        System.out.println("Map is empty: " + map.isEmpty());
    }
}