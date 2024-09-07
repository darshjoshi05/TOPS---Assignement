// W.A.J.P to find the second most frequent character in a given string. The
// given string is: successes The second most frequent char in the string is: c

import java.util.Scanner;

class ninteen {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = in.next();
        char[] words = word.toCharArray();

        int[] count = new int[256];

        for (char c : words) {
            count[c]++;
        }

        int maxIndex = 0;
        int maxCount = 0;
        for (int i = 1; i < 256; i++) {
            if (count[i] > count[maxIndex]) {
                maxIndex = i;
                maxCount = count[i];
            }
        }

        int secondCount = 0;
        char secondChar = '\0';
        for (int i = 0; i < 256; i++) {
            if (i != maxIndex && count[i] > secondCount) {
                secondCount = count[i];
                secondChar = (char) i;
            }
        }

        System.out.println("Second most frequent character is - " + secondChar);

        in.close();
    }
}