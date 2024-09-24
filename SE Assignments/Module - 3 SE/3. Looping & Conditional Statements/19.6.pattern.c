#include<stdio.h>
int main() {
	int i, j;
	char alpha = 'A';
	for (i = 1; i <= 5; i++) {
		alpha = 'A';
		for (j = 1; j <= i; j++) {
			printf("%c ", alpha);
			alpha++;
		}
		printf("\n");
	}
	return 0;
}
