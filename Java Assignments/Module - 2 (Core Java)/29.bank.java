// Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and $200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having a method named 'getBalance'. Call this method by creating an object of each of the three classes.

class twentyNine {
    public static void main(String[] args) {
        BankA bankA = new BankA();
        BankB bankB = new BankB();
        BankC bankC = new BankC();
        bankA.getBalance();
        bankB.getBalance();
        bankC.getBalance();
    }
}

abstract class Bank {
    abstract void getBalance();
}

class BankA extends Bank {
    void getBalance() {
        System.out.println("$100");
    }
}

class BankB extends Bank {
    void getBalance() {
        System.out.println("$150");
    }
}

class BankC extends Bank {
    void getBalance() {
        System.out.println("$200");
    }
}