// 12.Write a program in C to find the number of times a given word 'is' appears in
// the given string.

#include<stdio.h>
int main() {
	char n[50];
	int i, count = 0;
	
	printf("Enter your string: ");
	scanf("%s", n);
	
	for (i = 0; n[i] != '\0'; i++) {
		if (n[i] == 'i' && n[i + 1] == 's') {
			count++;
		}
	}
	
	printf("'is' appears %d times in the string.", count);

	return 0;
}
