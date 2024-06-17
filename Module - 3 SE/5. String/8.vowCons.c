// 8. Write a program in C to count the total number of vowels or consonants in a string.

#include<stdio.h>
int main() {
	int i, vow = 0, cons = 0;
	char str[50];
	
	printf("Enter a string: ");
	scanf("%s", &str);
	
	for (i = 0; str[i] != '\0'; i++) {
		if (str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u') {
			vow++;
		} else {
			cons++;
		}
	}
	
	printf("Number of vowels: %d\nNumber of consonants: %d", vow, cons);
	return 0;
}
