// 6. WAP to make addition, Subtraction and multiplication of two matrix using 2-D Array

#include<stdio.h>
int main() {
	int i, j, array1[2][2], array2[2][2], add[2][2], sub[2][2], mul[2][2];
	
	for (i = 0; i <= 1; i++) {
		for (j = 0; j <= 1; j++) {
			printf("Enter value of Array 1 indexed[%d][%d]: ", i, j);
			scanf("%d", &array1[i][j]);
		}
	}
	
	printf("\n");
	
	for (i = 0; i <= 1; i++) {
		for (j = 0; j <= 1; j++) {
			printf("Enter value of Array 2 indexed[%d][%d]: ", i, j);
			scanf("%d", &array2[i][j]);
		}
	}
	
	for (i = 0; i <= 1; i++) {
		for (j = 0; j <= 1; j++) {
			add[i][j] = array1[i][j] + array2[i][j];
		}
	}
	
	for (i = 0; i <= 1; i++) {
		for (j = 0; j <= 1; j++) {
			sub[i][j] = array1[i][j] - array2[i][j];
		}
	}
	
	for (i = 0; i <= 1; i++) {
		for (j = 0; j <= 1; j++) {
			mul[i][j] = array1[i][j] * array2[i][j];
		}
	}
	
	printf("\nAddition:\n");
	
	for (i = 0; i <= 1; i++) {
		for (j = 0; j <= 1; j++) {
			printf("%d\t", add[i][j]);
		}
		printf("\n");
	}
	
	printf("\nSubtraction:\n");
	
	for (i = 0; i <= 1; i++) {
		for (j = 0; j <= 1; j++) {
			printf("%d\t", sub[i][j]);
		}
		printf("\n");
	}
	
	printf("\nMultiplication:\n");
	
	for (i = 0; i <= 1; i++) {
		for (j = 0; j <= 1; j++) {
			printf("%d\t", mul[i][j]);
		}
		printf("\n");
	}
	
	return 0;
}


