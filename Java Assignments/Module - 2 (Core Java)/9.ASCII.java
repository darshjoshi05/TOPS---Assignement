// Write a Java program to print the ASCII value of a given character.

import java.util.Scanner;

class nine {
    public static void main(String[] args) {
        char c;
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter your character: ");
            c = in.next().charAt(0);

            int ASCII = c;
            System.out.print("ASCII value is: " + ASCII);
        }
    }
}