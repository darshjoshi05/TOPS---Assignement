// 5. Write a program in C to compare two strings without using string library functions

#include<stdio.h>
int main() {
	char str[1][50];
	int length[1], i, j;
	
	for (i = 0; i < 2; i++) {
		printf("Enter string %d: ", i + 1);
		scanf("%s", &str[i]);
	}
	
	for (i = 0; i < 2; i++) {
		length[i] = 0;
		for (j = 0; str[i][j] != '\0'; j++) {
			length[i]++;
		}
	}
	
	
	if (length[0] == length[1]) {
		printf("\nBoth strings are equal.");
	} else {
		printf("\nBoth strings are not equal.");
	}
	return 0;
}
