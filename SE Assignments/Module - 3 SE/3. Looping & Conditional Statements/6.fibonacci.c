#include<stdio.h>
int main() {
	int i, n1 = 0, n2 = 1, n3 = n1 + n2, seriesTill;
	printf("Enter a number for fibonacci series: ");
	scanf("%d",&seriesTill);
	for(i = 1; i <= seriesTill; i++) {
		n1 = n2;
		n2 = n3;
		n3 = n2 + n1;
		printf("%d ",n3);
	}
	return 0;
}

