// 32. Accept 2 numbers and find out its sum check it size

#include<stdio.h>
int main() {
	int a, b, sum;
	
	printf("Enter 2 numbers: ");
	scanf("%d %d", &a, &b);
	
	sum = a + b;
	printf("Size: %d", sizeof(sum));
	
	return 0;
}
