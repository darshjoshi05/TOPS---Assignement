// • W.A.J.P to check whether a given string ends with the contents of another string. "Java Exercises" ends with "se"? False "Java Exercise" ends with "se"? True

import java.util.Scanner;

class sixteen {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            String check = ".com";
            System.out.print("Enter your email: ");
            String email = in.nextLine();
            boolean result = false;

            for (int i = 0; i < email.length(); i++) {
                if (email.charAt(i) == '.') {
                    for (int j = 1; j < check.length(); j++) {
                        if (email.charAt(j + i) == check.charAt(j)) {
                            result = true;
                        } else {
                            result = false;
                        }
                    }
                }
            }

            System.out.print(result);
        }
    }
}