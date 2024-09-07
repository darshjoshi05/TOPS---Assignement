//W.A.J.P to compare a given string to the specified character sequence. Comparing topsint.com and topsint.com: true Comparing Topsint.com and topsint.com: false

import java.util.Scanner;

class n15 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            String s1, s2;

            System.out.print("Enter string 1: ");
            s1 = in.nextLine();

            System.out.print("Enter string 2: ");
            s2 = in.nextLine();

            if (s1.equals(s2)) {
                System.out.print("True: Both strings are equal.");
            } else {
                System.out.println("False: Both strings are not equal.");
            }
        }
    }
}