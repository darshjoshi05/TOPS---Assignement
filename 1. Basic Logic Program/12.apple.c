#include<stdio.h>
int main() {
	int students;
	int apple = 5;
	printf("Enter the number of students: ");
	scanf("%d",&students);
	int requirement = students * apple;
	printf("%d apples are required",requirement);
	return 0;
}
