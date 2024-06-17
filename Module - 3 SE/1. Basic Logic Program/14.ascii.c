// 14.Find ascii value of given number

#include <stdio.h>
int main() {
    int number;
    
    while (1) {
    
        printf("Enter a single digit number (0-9): ");
        scanf("%d", &number);
        
        if (number >= 0 && number <= 9) {
            break; 
        } else {
            printf("Invalid input. Please enter a single digit number between 0 and 9.\n");
        }
    }
    
    char character = '0' + number;
    
    printf("The ASCII value of the digit %d is %d\n", number, (int)character);

    return 0;
}

