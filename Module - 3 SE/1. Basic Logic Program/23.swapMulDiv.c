#include<stdio.h>
int main() {
	int n1, n2;
	printf("Enter 2 numbers: ");
	scanf("%d %d", &n1, &n2);
	n1 = n1 * n2; 
	n2 = n1 / n2; 
	n1 = n1 / n2; 
	printf("Number 1 is %d & Number 2 is %d", n1, n2);
	return 0;
}
