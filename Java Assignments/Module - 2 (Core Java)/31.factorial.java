// Write a program to print the factorial of a number by defining a method named 'Factorial'.

import java.util.Scanner;

class thirtyOne {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            int fact = Factorial(n);
            System.out.println("Factorial of " + n + " is: " + fact);
        }
    }

    public static int Factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
