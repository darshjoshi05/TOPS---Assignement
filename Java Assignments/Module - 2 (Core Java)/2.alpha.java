// Write a Java program that takes the user to provide a single character from the alphabet. Print Vowel or Consonant, depending on the user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.

import java.util.Scanner;

class execute {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter an alphabet: ");
        char alpha = in.next().charAt(0);

        if (alpha == 'a' || alpha == 'e' || alpha == 'i' || alpha == 'o' || alpha == 'u' || alpha == 'A' || alpha == 'E'
                || alpha == 'I' || alpha == 'O' || alpha == 'U') {
            System.out.print("Your alphabet is a vowel.");
        } else if ((alpha >= 'A' && alpha <= 'Z' && alpha != 'A' && alpha != 'E'
                && alpha != 'I' && alpha != 'O' && alpha != 'U')
                || (alpha >= 'a' && alpha <= 'z' && alpha != 'a' && alpha != 'e'
                        && alpha != 'i' && alpha != 'o' && alpha != 'u')) {
            System.out.print("Your alphabet is a consonant.");
        } else {
            System.out.print("You have entered invalid value.");
        }

        in.close();
    }
}
