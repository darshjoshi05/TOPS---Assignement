// 4. WAP to make simple calculator (operation include Addition, Subtraction,
// Multiplication, Division, modulo) using conditional statement

#include<stdio.h>
int main() {
	int n1, n2, ans;
	char operation;
	printf("Enter two numbers: ");
	scanf("%d %d", &n1, &n2);
	printf("Operation(A - Addition, S - Subtraction, M - Multiply, D - Division & U - Modulo): ");
	scanf(" %c", &operation);
	if (operation == 'A') {
		ans = n1 + n2;
		printf("Addition: %d", ans);
	} else if (operation == 'S') {
		ans = n1 - n2;
		printf("Subtraction: %d", ans);
	} else if (operation == 'M') {
		ans = n1 * n2;
		printf("Multiplication: %d", ans);
	} else if (operation == 'D') {
		ans = n1 / n2;
		printf("Division: %d", ans);
	} else if (operation == 'U') {
		ans = n1 % n2;
		printf("Modulo: %d", ans);
	} else {
		printf("Invalid Operation.");
	}
	return 0;
}
