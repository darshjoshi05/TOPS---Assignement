// W.A.J.P to create the validate method that takes integer value as a parameter. If the age is less than 18, then throw an Arithmetic Exception otherwise print a message welcome to vote.

class thirtyEight {

    public static void main(String[] args) {

        validate(25);
    }

    public static void validate(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("Age is less than 18");
        } else {
            System.out.println("Welcome to vote!");
        }
    }
}
