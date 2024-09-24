#include<stdio.h>
int main() {
	int year, day, month;
	printf("Enter number of years: ");
	scanf("%d",&year);
	day = year * 365;
	month = year * 12;
	printf("Days: %d & Month: %d", day, month);
	return 0;
}
