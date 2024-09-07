// Write a Java program to Take three numbers from the user and print the greatest number.

import java.util.Scanner;

class numbers {
    public static void main(String[] args) {
        int x, y, z;

        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter number 1 : ");
            x = in.nextInt();

            System.out.print("Enter number 2 : ");
            y = in.nextInt();

            System.out.print("Enter number 3 : ");
            z = in.nextInt();

            function obj = new function();
            obj.compare(x, y, z);
        }

    }
}

class function {
    public void compare(int x, int y, int z) {
        if (x > y && x > z) {
            System.out.println(x + " is largest");
        } else if (y > z) {
            System.out.println(y + " is largest");
        } else {
            System.out.println(z + " is largest");
        }
    }
}