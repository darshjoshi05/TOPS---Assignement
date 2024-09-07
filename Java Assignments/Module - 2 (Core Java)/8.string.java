// Write a Java program to count the letters, spaces, numbers and other characters of an input string.

import java.util.Scanner;

class eight {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in);) {
            int letters = 0, spaces = 0, numbers = 0, others = 0;

            System.out.print("Enter a sentence: ");
            String s = in.nextLine();

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch == ' ') {
                    spaces++;
                } else if (ch >= '0' && ch <= '9') {
                    numbers++;
                } else if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                    letters++;
                } else {
                    others++;
                }
            }
            System.out.println("Number of letters: " + letters);
            System.out.println("Number of spaces: " + spaces);
            System.out.println("Number of numbers: " + numbers);
            System.out.println("Number of other characters: " + others);
        }

    }
}