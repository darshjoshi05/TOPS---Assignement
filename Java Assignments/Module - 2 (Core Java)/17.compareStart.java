// W.A.J.P to check whether a given string starts with the contents of another string. Red is favorite color. Starts with Red? True Orange is also my favorite color. Starts with Red? False I3.

import java.util.Scanner;

class seventeen {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {

            System.out.print("Enter a color with a string: ");
            String input = in.nextLine();

            String check = "Red";
            boolean result = false;

            if (input.charAt(0) == 'R') {
                for (int j = 1; j < check.length(); j++) {
                    if (input.charAt(j) == check.charAt(j)) {
                        result = true;
                    } else {
                        result = false;
                    }
                }
            }
            System.out.println(result);
        }

    }
}