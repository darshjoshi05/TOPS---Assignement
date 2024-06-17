#include<stdio.h>
int main () {
	int n1, n2, ans, choice;
	printf("Menu:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n");
	scanf("%d", &choice);
	printf("Enter two numbers: \n");
	scanf("%d %d", &n1, &n2);
	switch (choice) {
		case 1:
			printf("Result: %d", n1 + n2);
			break;
			
		case 2:
			printf("Result: %d", n1 - n2);
			break;
			
		case 3:
			printf("Result: %d", n1 * n2);
			break;
			
		case 4:
			printf("Result: %d", n1 / n2);
			break;
			
		default:
			printf("Invalid choice.");
			break;
	}
	return 0;
}
