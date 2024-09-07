//Create a class named 'Rectangle' with two data members 'length' and 'breadth' and two methods to print the area and perimeter of the rectangle respectively. Its constructor having parameters for length and breadth is used to initialize the length and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' class with its constructor having a parameter for its side (suppose s) calling the constructor of its parent class as 'super (s, s)'. Print the area and perimeter of a rectangle and a square.

class twentyFive {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(10, 5);
        rectangle.area();
        rectangle.perimeter();

        Square square = new Square(5);
        square.area();
        square.perimeter();
    }
}

class Rectangle {
    int length, breadth;

    public Rectangle(int l, int b) {
        this.length = l;
        this.breadth = b;
    }

    public boolean isSquare() {
        return length == breadth;
    }

    public void area() {
        if (isSquare() == false) {
            System.out.println("Area of rectangle: " + length * breadth);
        } else {
            System.out.println("Area of square: " + length * breadth);
        }

    }

    public void perimeter() {
        if (isSquare() == false) {
            System.out.println("Perimeter of rectangle: " + 2 * (length + breadth));
        } else {
            System.out.println("Perimeter of square: " + 4 * length);
        }
    }
}

class Square extends Rectangle {

    public Square(int s) {
        super(s, s);
    }

}