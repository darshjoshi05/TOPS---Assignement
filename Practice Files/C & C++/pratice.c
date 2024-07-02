//#include<stdio.h>
//int main() {
//	int n, min = 32767, max = 0, sum = 0, avg = 0, totalValues = 0;
//	
//	again:
//	printf("Enter any +ve number and -1 to exit: ");
//	if ((scanf("%d", &n)) && n != -1) {
//		if (n > 0) {
//			if (n > max) {
//				max = n;
//			}
//			
//			if (n < min) {
//				min = n;
//			}
//			
//			sum += n;
//			totalValues++;
//		}
//	} else {
//		printf("Enter only postive number.\n");
//	}
//	
//	if (n == -1) {
//		goto end;
//	}
//	
//	goto again;
//	end:
//	printf("\nSum: %d", sum);
//	printf("\nMin: %d", min);
//	printf("\nMax: %d", max);
//	printf("\nAvg: %d", sum / totalValues);
//	return 0;
//}

// Take size and elements from user in array and print unique values only
// Take 2D array from the user and perfrom their multiply

//#include<stdio.h>
//int main() {
//	int x, i, j;
//	
//	printf("Enter size of your array: ");
//	scanf("%d", &x);
//	
//	int a[x], temp;
//	for (i = 0; i < x; i++) {
//		printf("Enter number %d: ", i + 1);
//		scanf("%d", &a[i]);
//	}
//	
//	for (i = 0; i < x; i++) {
//		for (j = i + 1; j < x; j++) {
//			if (a[i] > a[j]) {
//				temp = a[i];
//				a[i] = a[j];
//				a[j] = temp;			
//			}
//		}
//	}
//		
//	for (i = 0; i < x; i++) {
//		if (a[i] == a[i + 1]) { 
//			x -= 1;
//			for (j = i; j < x; j++) {
//				a[j] = a[j + 1];
//			}
//		}
//	}
//  
//	printf("Unique Numbers: ");
//	for (i = 0; i < x; i++) {
//		printf("%d\t", a[i]);
//	}
//	
//	return 0;
//}

//#include<stdio.h>
//int main() {
//	int x, i, j;
//	
//	printf("Enter size for your 2D Array: ");
//	scanf("%d", &x);
//	
//	int a1[x][x], a2[x][x], mul[x][x];
//	
//	for (i = 0; i < x; i++) {
//		for (j = 0; j < x; j++) {
//			printf("Enter number[%d][%d] of Array 1: ", i, j);
//			scanf("%d", &a1[i][j]);
//		}
//	}
//	
//	for (i = 0; i < x; i++) {
//		for (j = 0; j < x; j++) {
//			printf("Enter number[%d][%d] of Array 2: ", i, j);
//			scanf("%d", &a2[i][j]);
//		}
//	}
//	
//	for (i = 0; i < x; i++) {
//		for (j = 0; j < x; j++) {
//			mul[i][j] = a1[i][j] * a2[i][j];
//		}
//	}
//	
//	for (i = 0; i < x; i++) {
//		for (j = 0; j < x; j++) {
//			printf("%d\t", mul[i][j]);
//		}
//		printf("\n");
//	}
//	return 0;
//}

//#include<stdio.h>
//int main() {
//	int i, j, count = 0, size, a[50];
//	
//	printf("Enter the array size: ");
//	scanf("%d", &size);
//	
//	for (i = 0; i < size; i++) {
//		printf("Enter value of array[%i]: ", i);
//		scanf("%d", &a[i]);
//	}
//	
//	for (i = 0; i < size; i++) {
//		count = 0;
//		for (j = 0; j < size; j++) {
//			if (i != j) {
//				if (a[i] == a[j]) {
//					count++;
//				}
//			}
//		}
//		if (count == 0) {
//			printf("%d\t", a[i]);
//		}
//	}
//	return 0;
//}

// Frequency of a number
#include<stdio.h>
int main() {
	int size, a[50], i , j;
	
	printf("Enter array size: ");
	scanf("%d", &size);
	
	for (i = 0; i < size; i++) {
		printf("Enter value of array[%d]: ", i);
		scanf("%d", &a[i]);
	}
	
	int count[size], f[size];
	// 1 1 2 3 3
	for (i = 0; i < size; i++) {
		count[i] = 1;
		for (j = 0; j < size; j++) {
			if (i != j && count != 0) {
				if (a[i] == a[j]) {
					count[i]++;
					count[j] = 0;
				}
			}
		}
	}
	
	for (i = 0; i < size; i++) {
		printf("%d\t", a[i]);
	}
	printf("\n");
	for (i = 0; i < size; i++) {
		printf("%d\t", f[i]);
	}
	
//	printf("\n");
//	for (i = 0; i < size; i++) {
//		if (count[i] > 0) {
//			printf("Frequency of number %d: %d\n", a[i], count[i]);
//		}
//	}
	return 0;
}


