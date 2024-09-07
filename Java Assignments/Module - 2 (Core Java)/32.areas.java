// We have to calculate the area of a rectangle, a square and a circle. Create an abstract class 'Shape' with three abstract methods namely 'RectangleArea' taking two parameters, 'SquareArea' and 'CircleArea' taking one parameter each. The parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its side and that of 'CircleArea' is its radius. Now create another class 'Area' containing all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the area of rectangle, square and circle respectively. Create an object of class 'Area' and call all the three methods

class thirtyTwo {
    public static void main(String[] args) {
        Area area = new Area();
        area.RectangleArea(10, 5);
        area.SquareArea(5);
        area.CircleArea(7);
    }
}

abstract class Shape {
    abstract void RectangleArea(int l, int b);

    abstract void SquareArea(int s);

    abstract void CircleArea(int r);
}

class Area extends Shape {
    public void RectangleArea(int l, int b) {
        System.out.println("Area of rectangle: " + l * b);
    }

    public void SquareArea(int s) {
        System.out.println("Area of square: " + s * s);
    }

    public void CircleArea(int r) {
        System.out.println("Area of circle: " + 3.14 * r * r);
    }
}