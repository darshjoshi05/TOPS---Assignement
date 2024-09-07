// W.A.J.P to create a custom exception if Customer withdraw amount which is greater than account balance then program will show custom exception otherwise amount will deduct from account balance. Account balance is: 2000 Enter withdraw amount:2500

class thirtyNine {

    public static void main(String[] args) {
        try {
            validate(1800);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void validate(int amount) throws Exception {
        if (amount > 2000) {
            throw new Exception("Amount cannot be greater than 2000");
        } else {
            System.out.println("Withdraw amount: " + amount);
        }
    }
}