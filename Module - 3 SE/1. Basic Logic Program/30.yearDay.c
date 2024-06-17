// 30.WAP to convert years into days and days into years

#include<stdio.h>
int main() {
	int year, day;
	printf("Enter the number of years: ");
	scanf("%d",&year);
	day = year * 365;
	printf("Days: %d",day);
	return 0;
}

#include<stdio.h>
int main() {
	int year, day;
	printf("Enter the number of days: ");
	scanf("%d",&day);
	year = day / 365;
	printf("Years: %d",year);
	return 0;
}
