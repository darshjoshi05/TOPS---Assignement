// Print the sum, difference and product of two complex numbers by creating a class named 'Complex' with separate methods for each operation whose real and imaginary parts are entered by user.

import java.util.Scanner;

class twentySeven {

    public static void main(String[] args) {
        Complex c1 = new Complex();
        Complex c2 = new Complex();
        c1.getdata();
        c2.getdata();
        c1.add(c2);
        c1.sub(c2);
        c1.mul(c2);
    }
}

class Complex {
    int real, imag;

    void getdata() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter real part: ");
            real = sc.nextInt();
            System.out.print("Enter imaginary part: ");
            imag = sc.nextInt();
        }
    }

    void add(Complex c2) {
        System.out.println("Sum: " + (real + c2.real) + " + " + (imag + c2.imag) + "i");
    }

    void sub(Complex c2) {
        System.out.println("Difference: " + (real - c2.real) + " + " + (imag - c2.imag) + "i");
    }

    void mul(Complex c2) {
        System.out.println(
                "Product: " + (real * c2.real - imag * c2.imag) + " + " + (real * c2.imag + imag * c2.real) + "i");
    }
}