// Create a class named 'Shape' with a method to print "This is this is shape". Then create two other classes named 'Rectangle', 'Circle' inheriting the Shape class, both having a method to print "This is rectangular shape" and "This is circular shape" respectively. Create a subclass 'Square' of 'Rectangle' having a method to print "Square is a rectangle". Now call the method of 'Shape' and 'Rectangle' class by the object of 'Square' class.

class thirtyFour {

    public static void main(String[] args) {

        Square square = new Square();
        square.shape();
        square.rectangle();
        square.square();
    }
}

class Shape {
    public void shape() {
        System.out.println("This is a shape");
    }
}

class Rectangle extends Shape {
    public void rectangle() {
        System.out.println("This is a rectangular shape");
    }
}

class Circle extends Shape {
    public void circle() {
        System.out.println("This is a circular shape");
    }
}

class Square extends Rectangle {
    public void square() {
        System.out.println("Square is a rectangle");
    }
}
