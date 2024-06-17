// 9. Write a program in C to find the maximum number of characters in a string.

#include<stdio.h>
int main() {
	char string[50], compare;
	int i, count[50] = {0};
	
	printf("Enter your string: ");
	scanf("%s", &string);
	
	for(i = 0; string[i] != '\0'; i++) {
		compare = string[i];
		for (i = 0; string[i] != '\0'; i++) {
			if (compare == string[i + 1]) {
				count[i]++;
			} 
		}
	}
	
	printf("%d", count);
	
	return 0;
}



