// 15.Write a C program to determine eligibility for admission to a professional
// course based on the following criteria

#include<stdio.h>
int main() {
	int math, physics, chemistry, total, totalMP;
	printf("Enter marks of maths, physics & chemistry: ");
	scanf("%d %d %d", &math, &physics, &chemistry);
	total = math + physics + chemistry;
	totalMP = math + physics;
	if((math >= 65 && physics >= 55 && chemistry >= 50 && total >= 190) || (totalMP >= 140)) {
		printf("You are eligible for the course.");
	} else {
		printf("You are not eligible.");
	}
	return 0;
}
