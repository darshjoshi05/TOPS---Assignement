#include<stdio.h>
int main () {
	int i;
	for (i = 1; i <= 50; i++) {
		if (i <= 9) {
			printf("0%d ", i);
		} else {
			printf("%d ", i);
			if (i % 10 == 0) {
			printf("\n");
			}
		}
	}
	return 0;
}
