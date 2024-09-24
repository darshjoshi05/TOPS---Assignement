#include <stdio.h>

int main() {
    int side, area;

    printf("Enter the length of the side of the cube: ");
    scanf("%d", &side);

    area = 6 * side * side;

    printf("The area of the cube is: %d\n", area);

    return 0;
}

