// Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class named 'Triangle' without any parameter in its constructor

class twentySix {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.area();
        triangle.perimeter();
    }
}

class Triangle {
    int side1 = 3;
    int side2 = 4;
    int side3 = 5;
    int semiperimeter = (side1 + side2 + side3) / 2;
    int area = (int) Math
            .sqrt(semiperimeter * (semiperimeter - side1) * (semiperimeter - side2) * (semiperimeter - side3));
    int perimeter = side1 + side2 + side3;

    void area() {
        System.out.println("Area of Triangle: " + area);
    }

    void perimeter() {
        System.out.println("Perimeter of Triangle: " + perimeter);
    }
}