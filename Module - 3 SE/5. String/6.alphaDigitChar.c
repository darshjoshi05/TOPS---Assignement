// 6. Write a program in C to count the total number of alphabets, digits and special 
// characters in a string

#include<stdio.h>
int main() {
	int i, alphas = 0, digits = 0, chars = 0;
	char str[50];
	
	printf("Enter a string: ");
	scanf("%s", &str);
	
	for (i = 0; str[i] != '\0'; i++) {
		if (str[i] >= '0' && str[i] <= '9') {
			digits++;
		} else if (str[i] >= 'a' && str[i] <= 'z') {
			alphas++;
		} else {
			chars++;
		}
	}
	
	printf("Number of alphabets: %d\nNumber of digits: %d\nNumber of special characters: %d", alphas, digits, chars);
	return 0;
}
