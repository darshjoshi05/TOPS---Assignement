// W.A.J.P to find all interleaving of given strings. The given strings are: WX YZ The interleaving strings are: YWZX WYZX YWXZ WXYZ YZWX WYXZ

import java.util.Scanner;

class AllCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = scanner.nextLine();

        System.out.println("All possible combinations are:");
        generateCombinations(input.toCharArray(), 0);

        scanner.close();
    }

    private static void generateCombinations(char[] input, int start) {
        if (start == input.length - 1) {
            System.out.println(new String(input));
            return;
        }

        for (int i = start; i < input.length; i++) {
            swap(input, start, i);
            generateCombinations(input, start + 1);
            swap(input, start, i); // backtrack
        }
    }

    private static void swap(char[] input, int i, int j) {
        char temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }
}
