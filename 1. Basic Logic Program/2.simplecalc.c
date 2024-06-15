#include<stdio.h>
int main() {
	int n1,n2,ans;
	char choice;
	printf("What you want to do? + - * / ");
	scanf("%c", &choice);
	if(choice == '+' || choice == '-' || choice == '*' || choice == '/') {
		printf("Enter two numbers for the opertion: ");
		scanf("%d %d", &n1, &n2);
	}
	switch(choice) {
		case '+':
			ans = n1 + n2;
			printf("Addition: %d", ans);
			break;
		case '-':
			ans = n1 - n2;
			printf("Substraction: %d", ans);
			break;
		case '*':
			ans = n1 + n2;
			printf("Multiplication: %d", ans);
			break;
		case '/':
			ans = n1 + n2;
			printf("Division: %d", ans);
			break;
		default:
			printf("Please enter a valid operation.");	
	}
	return 0;
}
