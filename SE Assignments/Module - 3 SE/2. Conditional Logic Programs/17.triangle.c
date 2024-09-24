// 17.Write a C program to check whether a triangle can be formed with the given
// values for the angles.

#include <stdio.h>
int main() {
    int angle1, angle2, angle3;
    printf("Enter three angles of the triangle: ");
    scanf("%d %d %d", &angle1, &angle2, &angle3);
    if (angle1 + angle2 + angle3 == 180) {
        printf("The triangle can be formed with these angles.");
    } else {
        printf("The triangle cannot be formed with these angles.");
    }
    return 0;
}

