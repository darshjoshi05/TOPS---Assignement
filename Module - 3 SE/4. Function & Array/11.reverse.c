// 11.WAP to accept 5 numbers from user and display in reverse order using for loop and array

#include<stdio.h>
int main() {
	int array[5], i;
	printf("Enter 5 numbers: ");
	
	for (i = 0; i <= 4; i++) {
		scanf("%d", &array[i]);
	}
	
	printf("Reversed:\t");
	
	for (i = 4; i >= 0; i--) {
		printf("%d\t", array[i]);
	}
	
	return 0;
}
