// W.A.J.P to get the character at the given index within the String. Original String = Tops Technologies! The character at position 0 is T, The character at position 10 is o

import java.util.Scanner;

class thirteen {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("For output of character at index 3 and 7 ");
            System.out.print("Enter a string: ");
            String s = in.nextLine();

            System.out.println("Character at index 3: " + s.charAt(3));
            System.out.println("Character at index 7: " + s.charAt(7));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("String does not have index 7.");
        }
    }
}