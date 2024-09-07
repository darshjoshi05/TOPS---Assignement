//Create a class to print the area of a square and a rectangle. The class has two methods with the same name but different number of parameters. The method for printing area of a rectangle has two parameters which are length and breadth respectively while the other method for printing area of square has one parameter which is side of square.

class twentyTwo {

    public static void main(String[] args) {

        System.out.println("Area of rectangle: " + area.rectangle(10, 5));
        System.out.println("Area of square: " + area.square(5));
    }
}

class area {

    public static int rectangle(int l, int b) {
        return l * b;
    }

    public static int square(int s) {
        return s * s;
    }
}
