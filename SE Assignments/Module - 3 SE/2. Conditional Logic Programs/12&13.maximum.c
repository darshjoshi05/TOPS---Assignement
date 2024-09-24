// 12.WAP to find maximum number among 3 numbers using ternary operator

#include<stdio.h>
int main() {
	int n1, n2, n3;
	printf("Enter 3 numbers for comparison: ");
	scanf("%d %d %d", &n1, &n2, &n3);
	(n1 > n2 && n3) ? printf("%d is maximum", n1) : ((n2 > n3) ? printf("%d is maximum", n2) : printf("%d is maximum", n3));
	return 0;
}
