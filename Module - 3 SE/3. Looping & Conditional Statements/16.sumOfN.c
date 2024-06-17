// 16. Calculate the Sum of Natural Numbers Using the While Loop

#include<stdio.h>
int main() {
	int end, sum = 0;
	printf("Enter end point for summation: ");
	scanf("%d", &end);
	while (end > 0) {
		sum += end;
		end--;
	}
	printf("Sum: %d", sum);
	return 0;
}
