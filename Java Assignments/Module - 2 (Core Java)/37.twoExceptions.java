// W.A.J. P to demonstrate multiple catch blocks, (one is to handle divide by zero exception and another one is to handle ArrayIndexOutOfBoundException)

import java.util.Scanner;

class thirtySeven {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter two numbers: ");

            int a = sc.nextInt();
            int b = sc.nextInt();

            int[] arr = new int[3];
            arr[5] = a / b;

            System.out.println("Result: " + arr[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: " + e);
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e);
        }

    }
}