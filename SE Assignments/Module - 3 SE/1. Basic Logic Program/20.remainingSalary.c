#include<stdio.h>
int main() {
	int salary, remain;
	printf("Enter your monthly salary: ");
	scanf("%d",&salary);
	remain = salary * 0.9 * 0.9;
	printf("Your remaining salary is %d",remain);
}
