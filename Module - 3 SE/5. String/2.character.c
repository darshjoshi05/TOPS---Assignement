// 2. Write a program in C to separate individual characters from a string.

#include<stdio.h>
int main () {
	char string[50];
	printf("Enter a string: ");
	scanf("%s", &string);
	
	int i;
	for (i = 0; string[i] != '\0'; i++) {
		printf("%c\t", string[i]);
	}
	return 0;
}
