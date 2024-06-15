#include<stdio.h>
int main() {
	int salary, premium;
	printf("Enter your salary? ");
	scanf("%d",&salary);
	premium = salary * 0.1;
	printf("Your insurance premium is %d",premium);
}
