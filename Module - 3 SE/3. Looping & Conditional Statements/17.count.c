// 17.Calculate 5 numbers from user and calculate number of even and odd using
// of while loop

#include<stdio.h>
int main() {
	int i = 1, n, oddCount = 0, evenCount = 0;
	while (i <= 5) {
		printf("Enter number %d: ", i);
		scanf("%d", &n);
		if (n % 2 == 0) {
			evenCount++;
		} else {
			oddCount++;
		}
		i++;
	}
	printf("Even Numbers: %d & Odd Numbers: %d", evenCount, oddCount);
	return 0;
}
