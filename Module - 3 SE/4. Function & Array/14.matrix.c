// 14.Perform 2D matrix array

#include<stdio.h>
int main() {
	int i, j, array[2][2];
	
	for (i = 0; i < 2; i++) {
		for (j = 0; j < 2; j++) {
			printf("Enter number[%d][%d]: ", i, j);
			scanf("%d", &array[i][j]);
		}
	}
	
	printf("2-D Matrix Array: \n");
	
	for (i = 0; i < 2; i++) {
		for (j = 0; j < 2; j++) {
			printf("%d\t", array[i][j]);
		}
		printf("\n");
	}
	
	return 0;
}
