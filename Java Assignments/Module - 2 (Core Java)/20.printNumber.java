//Create a class named 'Print Number' to print various numbers of different data types by creating different methods with the same name 'printn' having a parameter for each data type.

class twenty {

    public static void main(String[] args) {

        printNumber number = new printNumber();

        System.out.println(number.printn(10));

    }

}

class printNumber {

    public int printn(int n) {
        return n;
    }

    public float printn(float f) {
        return f;
    }

    public double printn(double d) {
        return d;
    }

    public long printn(long l) {
        return l;
    }

    public short printn(short s) {
        return s;
    }
}
