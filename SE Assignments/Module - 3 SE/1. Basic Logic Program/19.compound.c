#include<stdio.h>
#include<math.h>

int main() {
	float compoundInterest, principal, rate, period, amount;
	printf("Enter principal, rate and period. ");
	scanf("%f",&principal);
	scanf("%f",&rate);
	scanf("%f",&period);
	amount = principal * (pow((1 + (rate / 100)),period));
	compoundInterest = amount - principal;
	printf("Compound Interest: %.2f",compoundInterest);
	return 0;
}
