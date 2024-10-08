// We have to calculate the percentage of marks obtained in three subjects (each out of 100) by student A and in four subjects (each out of 100) by student B. Create an abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by two other classes 'A' and 'B' each having a method with the same name which returns the percentage of the students. The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects as its parameters for student B. Create an object for each of the two classes and print the percentage of marks for both the students.

class thirty {
    public static void main(String[] args) {
        MarksA stuedeA = new MarksA(60, 70, 80);
        MarksB studentB = new MarksB(60, 70, 80, 90);
        stuedeA.getPercentage();
        studentB.getPercentage();
    }
}

abstract class Marks {
    abstract void getPercentage();
}

class MarksA extends Marks {
    int a, b, c;

    MarksA(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void getPercentage() {
        System.out.println((a + b + c) / 3);
    }
}

class MarksB extends Marks {
    int d, e, f, g;

    MarksB(int d, int e, int f, int g) {
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }

    void getPercentage() {
        System.out.println((d + e + f + g) / 4);
    }
}