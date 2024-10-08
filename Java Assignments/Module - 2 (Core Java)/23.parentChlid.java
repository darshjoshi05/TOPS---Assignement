// Create a class with a method that prints "This is a parent class" and its subclass with another method that prints "This is child class". Now, create an object for each of the class and call 1 - method of parent class by object of parent class 2 - method of child class by object of child class 3 - method of parent class by object of child class

class twentyThree {

    public static void main(String[] args) {

        ParentClass parent = new ParentClass();
        ChildClass child = new ChildClass();

        parent.parent();
        child.child();
        child.parent();

    }
}

class ParentClass {
    public void parent() {
        System.out.println("This is a parent class");
    }
}

class ChildClass extends ParentClass {
    public void child() {
        System.out.println("This is child class");
    }
}