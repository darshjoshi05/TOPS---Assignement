// Take two numbers from the user and perform the division operation and handle the Arithmetic Exception.

import java.util.Scanner;

class thirtySix {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter two numbers to divide: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            try {
                int c = a / b;
                System.out.println("Result: " + c);
            } catch (ArithmeticException e) {
                System.out.println("Exception: " + e);
            }
        }

    }
}