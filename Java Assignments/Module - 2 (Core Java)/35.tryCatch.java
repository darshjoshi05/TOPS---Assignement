// W.A.J. P to demonstrate try catch block,

class thirtyFive {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("Exception occured is: " + e);
        }
    }
}