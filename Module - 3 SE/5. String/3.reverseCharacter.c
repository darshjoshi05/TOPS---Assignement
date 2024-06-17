// 3. Write a program in C to print individual characters of a string in reverse order

#include<stdio.h>
int main () {
	char string[50], length = 0;
	printf("Enter a string: ");
	scanf("%s", &string);
	
	int i;
	for (i = 0; string[i] != '\0'; i++) {
		length++;
	}
	
	printf("Reversed: ");
	for (i = length; i >= 0; i--) {
		printf("%c\t", string[i]);
	}
	return 0;
}
