// 13.Write a program in C to remove characters from a string except alphabets.

#include<stdio.h>
int main() {
	char s[50];
	int i;
	
	printf("Enter your string: ");
	scanf("%s", s);
	
	for (i = 0; s[i] != '\0'; i++) {
		if (s[i] >= 'a' && s[i] <= 'z') {
			s[i] = s[i];
		} else {
			s[i] = ' ';
		}
	}
	
	printf("Modified String: %s", s);
	
	return 0;
}
