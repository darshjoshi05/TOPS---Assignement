// 14.Write a program in C to combine two strings manually

#include<stdio.h>
#include<string.h>

int main() {
	char one[50], two[50];
	int i, length1, length2;
	
	printf("Enter 2 strings: ");
	scanf("%s %s", one, two);
	
	length1 = strlen(one);
	length2 = strlen(two);
	
	for (i = 0; i <= length2; i++) {
		one[length1 + i] = two[i];
	}
	
	one[length1 + length2] = '\0';
	printf("Combined String: %s", one);
	
	return 0;
}
