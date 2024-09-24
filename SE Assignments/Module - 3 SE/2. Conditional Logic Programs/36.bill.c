#include<stdio.h>
int main() {
	float unit,bill;
	printf("Enter units consumed: ");
	scanf("%f",&unit);
	if (unit<=50) {
		bill = unit * 0.5;
	} else if (unit>50 && unit<=150) {
		bill = (50 * 0.5) + ((unit - 50) * 0.75);
	} else if (unit>151 && unit<=250) {
		bill = (50 * 0.5) + (100 * 0.75) + ((unit - 150) * 1.2);
	} else {
		bill = (50 * 0.5) + (100 * 0.75) + (100 * 1.2) + ((unit - 250) * 1.5);
	}
	bill *= 1.2;
	printf("Bill: %.2f",bill);
	return 0;
}
