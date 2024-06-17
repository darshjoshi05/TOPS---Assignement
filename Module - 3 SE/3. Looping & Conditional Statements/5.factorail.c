#include<stdio.h>
int main() {
	int i, number, ans = 1;
	printf("Enter a number for factorial: ");
	scanf("%d",&number);
	for(i = 1; i <= number; i++) {
		ans *= i;
	}
	printf("Factorial: %d",ans);
	return 0;
}
