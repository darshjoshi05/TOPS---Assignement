class Calculator {
    public static void main(String[] args) {

        Division obj = new Division();

        int addition = obj.op1(5, 5);
        int subtraction = obj.op2(10, 5);
        int multiplicaton = obj.op3(5, 5);
        int division = obj.op4(10, 5);

        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplicaton);
        System.out.println("Division: " + division);
    }
}

class Addition {
    public int op1(int a, int b) {
        return a + b;
    }
}

class Subtraction extends Addition {
    public int op2(int a, int b) {
        return a - b;
    }
}

class Multiplication extends Subtraction {
    public int op3(int a, int b) {
        return a * b;
    }
}

class Division extends Multiplication {
    public int op4(int a, int b) {
        return a / b;
    }
}