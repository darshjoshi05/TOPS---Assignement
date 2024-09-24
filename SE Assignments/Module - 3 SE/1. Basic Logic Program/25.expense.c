#include<stdio.h>
int main() {
	int e1, e2, e3, e4, e5, average;
	printf("Enter expense 1: ");
	scanf("%d",&e1);
	printf("Enter expense 2: ");
	scanf("%d",&e2);
	printf("Enter expense 3: ");
	scanf("%d",&e3);
	printf("Enter expense 4: ");
	scanf("%d",&e4);
	printf("Enter expense 5: ");
	scanf("%d",&e5);
	average = (e1 + e2 + e3 + e4 + e5) / 5;
	printf("Average: %d", average);
	return 0;
}
