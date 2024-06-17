// 15. Store 5 numbers in array and sort it in ascending order

#include<stdio.h>
int main() {
	int i, array[4], j, temp;
	
	printf("Enter 5 numbers: ");
	for (i = 0; i < 5; i++) {
		scanf("%d", &array[i]);
	}
	
	for (i = 0; i < 5; i++) {
		for (j = i + 1; j < 5; j++) {
			if (array[i] > array[j]) {
				temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
	}
	
	printf("After sorting: ");
	for (i = 0; i < 5; i++) {
		printf("%d\t", array[i]);
	}
	
	return 0;
}
