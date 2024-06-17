// 11. Accept 5 names from user at run time.

#include<stdio.h>

int main() {
	char name[5][50];
	int i;
	
	for (i = 0; i <= 4; i++) {
		printf("Enter name %d: ", i + 1);
		scanf("%s", name[i]);
	}
	
	for (i = 0; i < 5; i++) {
		printf("Name %d: %s\n", i + 1, name[i]);
	}
	
	return 0;
}
