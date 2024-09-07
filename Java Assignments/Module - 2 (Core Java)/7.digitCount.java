//Write a Java program that reads a positive integer and count the number of digitsthe number.

import java.util.Scanner;

class seven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int n = in.nextInt();
        int digits = 0;

        while (n != 0) {
            n /= 10;
            digits++;
        }
        in.close();
        System.out.print("Digits are " + digits);
    }
}