#include<stdio.h>
int main () {
	int days, month;
	printf("Enter the number of days: ");
	scanf("%d",&days);
	month = days / 30;
	printf("Month: %d",month);
	return 0;
}
