// Assessment 2-D Matrix Multiplication

#include<stdio.h>

int main() {
	int i, j, a1[2][2], a2[2][2], count = 1;
	
	printf("\t\t\t\t\tMatrix Multiplication\n\n");
	
	printf("---------- Matrix: 1 ----------\n\n");
	
	for (i = 0; i < 2; i++) {
		for (j = 0; j < 2; j++) {
			printf("Enter number %d: ", count);
			scanf("%d", &a1[i][j]);
			count++;
		}
	}
	
	printf("\n");
	
	for (i = 0; i < 2; i++) {
		for (j = 0; j < 2; j++) {
			printf("%d\t", a1[i][j]);
		}
		printf("\n");
	}
	
	printf("\n\n");
	
	printf("---------- Matrix: 2 ----------\n\n");
	count = 1;
	
	for (i = 0; i < 2; i++) {
		for (j = 0; j < 2; j++) {
			printf("Enter number %d: ", count);
			scanf("%d", &a2[i][j]);
			count++;
		}
	}
	
	printf("\n");
	
	for (i = 0; i < 2; i++) {
		for (j = 0; j < 2; j++) {
			printf("%d\t", a2[i][j]);
		}
		printf("\n");
	}
	
	printf("\n\n");
	
	printf("---------- Result: Multiplication Matrix ----------\n\n");
	
	for (i = 0; i < 2; i++) {
		for (j = 0; j < 2; j++) {
			printf("%d\t", a1[i][j] * a2[i][j]);
		}
		printf("\n");
	}
	
	return 0;
}
