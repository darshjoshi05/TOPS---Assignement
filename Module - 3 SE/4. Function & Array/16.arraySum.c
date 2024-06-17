// 16. Accept 5 numbers from user and perform sum of array

#include<stdio.h>
int main() {
	int i, array[4], sum = 0;
	
	printf("Enter 5 numbers: ");
	for (i = 0; i < 5; i++) {
		scanf("%d", &array[i]);
		sum += array[i];
	}
	
	printf("Sum: %d", sum);
	
	return 0;
}
