// Write a Java program to iterate through all elements in a hash list

import java.util.ArrayList;

class fortyEight {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Red");
        list.add("Green");
        list.add("Black");
        list.add("White");
        list.add("Pink");

        for (String obj : list) {
            System.out.println(obj);
        }
    }
}