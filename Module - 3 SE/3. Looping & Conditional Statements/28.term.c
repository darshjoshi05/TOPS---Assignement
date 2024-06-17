// 28. 1 2 3 6 9 18 27 54...

#include<stdio.h>
int main () {
	int i, n, term = 1;
	printf("Enter the term you want?(1, 2, 3, 6, 9, 18, .....):");
	scanf("%d", &n);
	for (i = 1; i < n; i++) {
		if (i % 2 != 0) {
			term *= 2;
		} else {
			term *= 1.5;
		}
	}
	printf("Term: %d", term);
	return 0;
}
