// 13.Find character value from ascii

#include <stdio.h>
int main() {
    int asciiValue;
    
    while (1) {
    	printf("Enter an ASCII value (0-127): ");
    	scanf("%d", &asciiValue);
    	
    	if (asciiValue >= 0 && asciiValue <= 127) {
        break;
    	} else {
        printf("Invalid ASCII value. Please enter a value between 0 and 127.\n");
    	}
	}
    
	char character = (char)asciiValue;
    printf("The character for ASCII value %d is '%c'\n", asciiValue, character);
    
    return 0;
}




