// 7. Accept marks from user and check pass or fail

#include <stdio.h>
int main() {
    int marks;
    printf("Enter marks (out of 100): ");
    scanf("%d", &marks);
    if (marks >= 33) {
        printf("Congratulations! You passed.\n");
    } else {
        printf("Sorry, you failed. Please try again.\n");
    }
    return 0;
}

