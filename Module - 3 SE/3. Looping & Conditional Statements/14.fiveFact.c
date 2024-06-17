// 14.Accept 5 numbers from user and find those numbers factorials

#include<stdio.h>
int main() {
	int i, n, fact = 1, orgN;
	for (i = 1; i <= 5; i++) {
		printf("Enter %d numbers: ", i);
		scanf("%d", &n);
		orgN = n;
		while (n > 0) {
			fact *= n;
			n--;
		}
		printf("Factorail of %d is %d\n", orgN, fact);
		fact = 1;
	}
	return 0;
}
