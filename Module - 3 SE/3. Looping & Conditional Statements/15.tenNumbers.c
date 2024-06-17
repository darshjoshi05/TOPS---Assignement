// 15.Calculate sum of 10 numbers using of while loop

#include<stdio.h>
int main () {
	int n, i = 1, sum = 0;
	printf("Enter 10 numbers for summation: ");
	while (i <= 10) {
		scanf("%d", &n);
		sum += n;
		i++;
	}
	printf("Sum: %d", sum);
	return 0;
}
