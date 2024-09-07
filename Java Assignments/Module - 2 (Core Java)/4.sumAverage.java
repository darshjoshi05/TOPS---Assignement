// Write a program in Java to input 5 numbers from keyboard and find their sum and average using for loop.

import java.util.Scanner;

class first {
    public static void main(String[] args) {
        working obj = new working();
        obj.work();
    }
}

class working {
    public void work() {
        int sum = 0, avg = 0, num;

        try (Scanner in = new Scanner(System.in)) {
            for (int i = 0; i < 5; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                num = in.nextInt();
                sum += num;
            }

            avg = sum / 5;
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + avg);
        }
    }
}