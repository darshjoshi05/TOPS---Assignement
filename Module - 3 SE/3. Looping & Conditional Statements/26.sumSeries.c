// 26. (1)+ (1+2) + (1+2+3) + (1+2+3+4) + ... + (1+2+3+4+...+n)

#include<stdio.h>
int main () {
	int n, i, j, sum;
	printf("Enter number for sum: ");
	scanf("%d", &n);
	for (i = 1; i <= n; i++) {
		for (j = 1; j <= i; j++) {
			sum += j;
		}
	}
	printf("Sum: %d", sum);
	return 0;
}
