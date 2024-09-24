#include<stdio.h>
int main() {
	int e1, e2, e3, e4, e5, total, average;
	printf("Enter the salary of employee 1: ");
	scanf("%d",&e1);
	printf("Enter the salary of employee 2: ");
	scanf("%d",&e2);
	printf("Enter the salary of employee 3: ");
	scanf("%d",&e3);
	printf("Enter the salary of employee 4: ");
	scanf("%d",&e4);
	printf("Enter the salary of employee 5: ");
	scanf("%d",&e5);
	total = e1 + e2 + e3 + e4 + e5;
	average = total / 5;
	printf("Total: %d & Average: %d", total, average);
	return 0;
}
