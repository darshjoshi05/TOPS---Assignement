// Write a Java program to associate the specified value with the specified key in a Hash Map.

import java.util.HashMap;
import java.util.Map;

class fifty {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Black");
        map.put(4, "White");
        map.put(5, "Pink");
        System.out.println(map);

        // Write a Java program to count the number of key-value (size) mappings in a
        // map
        System.out.println("Size: " + map.size());
    }
}