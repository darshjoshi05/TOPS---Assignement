// 5. WAP to take two Array input from user and sort them in ascending or
// descending order as per user’s choice

#include<stdio.h>
int main() {
	int array1[5], array2[5], choice, i, j, temp;
	
	printf("Enter 5 values for Array 1: \n");
	for (i = 0; i <= 4; i++) {
		scanf("%d", &array1[i]);
	}

	printf("Enter 5 values for Array 2: \n");
	for (i = 0; i <= 4; i++) {
		scanf("%d", &array2[i]);
	}
	
	printf("Enter your choice:\n1. Ascending\n2. Descending\n");
	scanf("%d", &choice);
	switch (choice) {
		case 1:
			for (i = 0; i <= 4; i++) {
				for (j = i + 1; j <= 4; j++) {
					if (array1[i] > array1[j]) {
					temp = array1[i];
					array1[i] = array1[j];
					array1[j] = temp;
					}
				}
			}
			printf("After sorting: ");
			for (i = 0; i <= 4; i++) {
				printf("%d\t", array1[i]);
			}
			
			for (i = 0; i <= 4; i++) {
				for (j = i + 1; j <= 4; j++) {
					if (array2[i] > array2[j]) {
					temp = array2[i];
					array2[i] = array2[j];
					array2[j] = temp;
					}
				}
			}
			printf("\nAfter sorting: ");
			for (i = 0; i <= 4; i++) {
				printf("%d\t", array2[i]);
			}
			
			break;
			
		case 2:
			for (i = 0; i <= 4; i++) {
				for (j = i + 1; j <= 4; j++) {
					if (array1[i] < array1[j]) {
					temp = array1[i];
					array1[i] = array1[j];
					array1[j] = temp;
					}
				}
			}
			printf("After sorting: ");
			for (i = 0; i <= 4; i++) {
				printf("%d\t", array1[i]);
			}
			
			for (i = 0; i <= 4; i++) {
				for (j = i + 1; j <= 4; j++) {
					if (array2[i] < array2[j]) {
					temp = array2[i];
					array2[i] = array2[j];
					array2[j] = temp;
					}
				}
			}
			printf("\nAfter sorting: ");
			for (i = 0; i <= 4; i++) {
				printf("%d\t", array2[i]);
			}
			
			break;
			
		default: 
			printf("Invalid Option.");
	}
	return 0;
}
