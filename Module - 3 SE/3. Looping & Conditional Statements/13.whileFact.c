// 13.calculate the Factorial of a Given Number using while loop

#include<stdio.h>
int main () {
	int fact = 1, n;
	printf("Enter the number: ");
	scanf("%d", &n);
	while (n > 0) {
		fact *= n;
		n--;
	}
	printf("Factorial: %d", fact);
	return 0;
}
