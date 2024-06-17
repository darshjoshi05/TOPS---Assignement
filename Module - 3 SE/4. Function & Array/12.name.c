// 12. WAP to accept 5 students name and store it in array

#include<stdio.h>
int main() {
	char students[5][50];
	int i;
	
	printf("Enter 5 students name: ");
	
	for (i = 0; i < 5; i++) {
		scanf("%s", &students[i]);
	}
	
	for (i = 0; i < 5; i++) {
		printf("Student %d name: %s\n", i + 1, students[i]);
	}
	
	return 0;
}
