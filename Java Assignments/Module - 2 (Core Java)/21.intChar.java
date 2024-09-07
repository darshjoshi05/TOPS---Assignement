// Create a class to print an integer and a character with two methods having the same name but different sequence of the integer and the character parameters.

class twentyOne {
    public static void main(String[] args) {

        System.out.print("Integer and Character: ");
        printIntChar.IntChar(5, 'a');

        System.out.print("Character and Integer: ");
        printIntChar.CharInt('a', 5);

    }
}

class printIntChar {

    public static void IntChar(int i, char c) {
        System.out.print(i + " : ");
        System.out.println(c);
    }

    public static void CharInt(char c, int i) {
        System.out.print(c + " : ");
        System.out.println(i);
    }
}