// W.A.J.P to concatenate a given string to the end of another string.

import java.util.Scanner;

class fourteen {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            String s1, s2;

            System.out.print("Enter string 1: ");
            s1 = in.nextLine();

            System.out.print("Enter string 2: ");
            s2 = in.nextLine();

            System.out.print("Concatenation: " + s1.concat(s2));
        }
    }
}