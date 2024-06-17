// 12. Program of Armstrong Number in C Using For Loop & While Loop

#include<stdio.h>
#include<math.h>

int main() {
	int orgN, n, sumN = 0, digits = 0, rem, i;
	printf("Enter a number: ");
	scanf("%d", &n);
	orgN = n;
	while (n != 0) {
		n /= 10;
		digits++;
	}	
	
	n = orgN;
	for (i = 1; i <= digits; i++) {
		rem = n % 10;
		n /= 10;
		sumN += pow(rem, digits);
	}
	
	if (orgN == sumN) {
		printf("%d is an Armstrong Number. ", orgN);
	} else {
		printf("%d is not an Armstrong Number. ", orgN);
	}
	return 0;
}
