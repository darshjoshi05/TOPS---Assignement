// 13.WAP to accept 5 numbers from user and check entered number is even or odd using of array

#include<stdio.h>
int main() {
	int numbers[4], i, oddCount = 0, evenCount = 0;
	
	printf("Enter 5 numbers: ");
	for (i = 0; i < 5; i++) {
		scanf("%d", &numbers[i]);
	}
	
	for (i = 0; i < 5; i++) {
		if (numbers[i] % 2 == 0) {
			evenCount++;
		} else {
			oddCount++;
		}
	}
	
	printf("Even Numbers: %d\nOdd Numbers: %d", evenCount, oddCount);
	
	return 0;
}
