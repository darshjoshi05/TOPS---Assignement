// 15. Write a program in C to find the largest and smallest words in a string.

#include <stdio.h>
#include <string.h>

int main() {
    char string[5][50], large[50], small[50];
    int i, length[5]; 

    printf("Enter 5 strings: ");
    for(i = 0; i < 5; i++) {
        scanf("%s", string[i]);
        length[i] = strlen(string[i]);
    }

    strcpy(large, string[0]);
    strcpy(small, string[0]);
    int max = length[0], min = length[0];

    for (i = 1; i < 5; i++) {
        if (length[i] > max) {
            strcpy(large, string[i]);
            max = length[i];
        }
        if (length[i] < min) {
            strcpy(small, string[i]);
            min = length[i];
        }
    }

    printf("Largest word is: %s\n", large);
    printf("Smallest word is: %s\n", small);

    return 0;
}

