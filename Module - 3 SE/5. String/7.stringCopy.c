// 7. Write a program in C to copy one string to another string.

#include<stdio.h>
#include<string.h>

int main() {
	char string[50], stringCopy[50];
	printf("Enter a string: ");
	scanf("%s", string);
	
	strcpy(stringCopy, string);
	printf("Copied String: %s", stringCopy);
	return 0;
}
