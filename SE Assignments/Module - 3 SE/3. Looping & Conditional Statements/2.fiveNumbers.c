#include <stdio.h>

int main() {
    int number;
    int i;

    printf("Enter 5 numbers:\n");
    for(i = 0; i < 5; i++) {
        printf("Enter number %d: ", i + 1);
        scanf("%d", &number);
        printf("%d ", number); 
    }

    return 0;
}

