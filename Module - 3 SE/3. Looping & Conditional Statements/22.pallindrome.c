// 22. Accept 3 numbers from user using while loop and check each numbers
// palindrome

#include<stdio.h>
int main () {
	int rev = 0, rem, n, i, orgN;
	for (i = 1; i <= 3; i++) {
		rev = 0;
		printf("Enter number %d: ", i);
		scanf("%d", &n);
		orgN = n;
		while (n != 0) {
			rem = n % 10;
			rev = (rev * 10) + rem;
			n /= 10; 
		}
		if (rev == orgN) {
			printf("%d is pallindrome.\n", orgN);
		} else {
			printf("%d is not a pallindrome.\n", orgN);
		}
	}
	return 0;
}
