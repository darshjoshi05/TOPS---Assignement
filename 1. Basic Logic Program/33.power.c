// 33. C Program to Read Integer and Print First Three Powers (N^1, N^2, N^3)

#include<stdio.h>
#include<math.h>

void main() {
	int n, p1, p2, p3;
	printf("Enter a number: ");
	scanf("%d",&n);
	p1 = pow(n, 1);
	p2 = pow(n, 2);
	p3 = pow(n, 3);
	printf("Power 1: %d, Power 2: %d & Power 3: %d", p1, p2, p3);
}
