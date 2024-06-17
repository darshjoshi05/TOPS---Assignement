// 8. WAP to accept the height of a person in centimeters and categorize the
// person according to their height.


#include <stdio.h>
int main() {
    int height;
    printf("Enter the height in centimeters: ");
    scanf("%d", &height);
    if (height < 150) {
        printf("The person is Short.\n");
    } else if (height >= 150 && height < 170) {
        printf("The person is Average.\n");
    } else if (height >= 170 && height < 190) {
        printf("The person is Tall.\n");
    } else {
        printf("The person is Very Tall.\n");
    }
    return 0;
}

