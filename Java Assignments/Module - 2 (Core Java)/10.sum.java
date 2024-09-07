//Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn. Input number: 5 -> 5 + 55 + 555

import java.util.Scanner;

class ten {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = in.nextInt();

        int temp = n;
        int sum = temp;
        for (int i = 0; i < 2; i++) {
            temp = (temp * 10) + n;
            sum += temp;
        }

        System.out.print("Sum: " + sum);
        in.close();
    }
}
