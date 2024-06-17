// 10.Write a program you have to make a summation of first and last Digit.

#include<stdio.h>
int main() {
	int n, sum, rem, FD, LD;
	printf("Enter a number: ");
	scanf("%d", &n);
	LD = n % 10;
	while (n != 0) {
		rem = n % 10;
		n /= 10;
	}
	FD = rem;
	sum = LD + FD;
	printf("Sum: %d", sum);
	return 0;
}
