// 25. (1*1) + (2*2) + (3*3) + (4*4) + (5*5) + ... + (n*n)

#include<stdio.h>
#include<math.h>

int main() {
	int i, n, sum = 0;
	printf("Enter the value of end: ");
	scanf("%d", &n);
	for (i = 1; i <= n; i++) {
		sum += pow (i, i);
	}
	printf("Sum: %d", sum);
	return 0;
}
