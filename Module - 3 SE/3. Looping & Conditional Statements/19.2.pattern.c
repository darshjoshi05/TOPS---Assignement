#include<stdio.h>
int main() {
	int i, j;
	char Alpha = 'A';
	for (i = 1; i <= 5; i++) {
		for (j = 1; j <= i; j++) {
			printf("%c ", Alpha);
			Alpha++;
		}
		printf("\n");
	}
	return 0;
}
