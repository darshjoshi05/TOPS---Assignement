// 8. Write a program to find out the max from given number

#include<stdio.h>
int main() {
	int n, rem, max;
	printf("Enter a number: ");
	scanf("%d", &n);
	max = rem = n % 10;
	while (n != 0) {
		rem = n % 10;
		n /= 10;
		if (rem > max) {
			max = rem;
		}
	}
	printf("Max: %d", max);
	return 0;
}
