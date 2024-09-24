// 27.Convert days into months

#include<stdio.h>
int main() {
	int d, m;
	
	printf("Enter number of days: ");
	scanf("%d", &d);
	
	printf("Months: %d", d / 30);
	
	return 0;
}
