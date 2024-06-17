#include<stdio.h>
#include<math.h>
int main() {
	float radius = 5;
	float area = 3.14 * pow(radius,2);
	float circumference = 2 * 3.14 * radius;
	printf("Area is %f and circumference is %f",area ,circumference);
	return 0;
}
