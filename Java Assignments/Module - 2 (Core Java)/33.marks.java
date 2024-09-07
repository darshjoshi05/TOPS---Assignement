// Write a program which will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below: Marks Grade 1-100 A 1-90 B 1-80 B 1-70 C 1-60 D 41-50 DD

import java.util.Scanner;

class thiryThree {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter marks(out of 100): ");
            int marks = sc.nextInt();
            getGrade(marks);
        }
    }

    public static void getGrade(int marks) {
        if (marks > 90) {
            System.out.println("Grade A");
        } else if (marks > 80 && marks <= 90) {
            System.out.println("Grade B");
        } else if (marks > 70 && marks <= 80) {
            System.out.println("Grade C");
        } else if (marks > 60 && marks <= 70) {
            System.out.println("Grade D");
        } else if (marks > 50 && marks <= 60) {
            System.out.println("Grade DD");
        } else {
            System.out.println("Fail");
        }
    }

}
