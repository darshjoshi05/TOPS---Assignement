// Write a Java program to get a collection view of the values contained in this map.

import java.util.Map;
import java.util.Collection;
import java.util.HashMap;

class fiftySix {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Black");
        map.put(4, "White");
        map.put(5, "Pink");
        System.out.println("Map: " + map);

        Collection<String> values = map.values();
        System.out.println("Values: " + values);
    }
}