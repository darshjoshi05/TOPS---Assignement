// 11.WAP to find number is even or odd using ternary operator

#include<stdio.h>
int main() {
	int n;
	printf("Enter a number: ");
	scanf("%d", &n);
	(n % 2 == 0) ? printf("Number is even.") : printf("Number is odd.");
	return 0;
}
