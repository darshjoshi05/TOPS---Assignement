#include <stdio.h>

int main() {
    float length, width, height, area;

    printf("Enter the length of the cuboid: ");
    scanf("%f", &length);

    printf("Enter the width of the cuboid: ");
    scanf("%f", &width);

    printf("Enter the height of the cuboid: ");
    scanf("%f", &height);

    area = 2 * (length * width + width * height + height * length);

    printf("The surface area of the cuboid is: %.2f\n", area);

    return 0;
}

