// 10.Write a program in C to extract a substring from a given string

#include<stdio.h>
#include<string.h>

int main() {
	char string[50], substring[50];
	int i, choice, value, length;
	
	printf("Enter your string: ");
	scanf("%s", string);
	
	printf("Enter your choice for substring:\n1. Left\n2. Right\n");
	scanf("%d", &choice);
	
	printf("Enter the number for substring: ");
	scanf("%d", &value);
	
	length = strlen(string);
	
	switch (choice) {
		case 1:
			for (i = 0; i <= value - 1; i++) {
				substring[i] = string[i];
			}
			printf("Your substring is %s.", substring);
			break;
			
		case 2:
			for (i = 0; i <= value; i++) {
				substring[i] = string[length - value + i];
			}
			printf("Your substring is %s.", substring);
			break;
				
		default:
			printf("Invalid Choice.");
	}
	return 0;
}


