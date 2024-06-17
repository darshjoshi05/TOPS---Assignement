#include<stdio.h>
int main() {
	int n1, n2;
	printf("Enter the two numbers: ");
	scanf("%d %d",&n1 ,&n2);
	if (n1 == n2) {
		printf("Numbers are same.");
	} else{
		printf("Numbers are different.");
	}
	return 0;
}
