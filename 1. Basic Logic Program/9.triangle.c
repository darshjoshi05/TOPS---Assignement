#include <stdio.h>

int main() {
    float side1, side2, side3, perimeter;

    printf("Enter the length of the first side of the triangle: ");
    scanf("%f", &side1);

    printf("Enter the length of the second side of the triangle: ");
    scanf("%f", &side2);

    printf("Enter the length of the third side of the triangle: ");
    scanf("%f", &side3);

    perimeter = side1 + side2 + side3;

    printf("The perimeter of the triangle is: %.2f\n", perimeter);

    return 0;
}
