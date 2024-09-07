// Create an abstract class 'Parent' with a method 'message'. It has two subclasses each having a method with the same name 'message' that prints "This is first subclass" and "This is second subclass" respectively. Call the methods 'message' by creating an object for each subclass.

class twentyEight {
    public static void main(String[] args) {

        Child1 child1 = new Child1();
        Child2 child2 = new Child2();
        child1.message();
        child2.message();
    }
}

abstract class Parent {
    abstract void message();
}

class Child1 extends Parent {
    void message() {
        System.out.println("This is first subclass");
    }
}

class Child2 extends Parent {
    void message() {
        System.out.println("This is second subclass");
    }
}