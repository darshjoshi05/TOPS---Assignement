// 8. Write a program of structure employee that provides the following 
// a. . information -print and display empno, empname, address and age

#include<stdio.h>

struct employeeInfo {
	int no, age;
	char name[50], address[50];
};

int main() {
	struct employeeInfo one;
	printf("Enter no., name, address & age of employee: ");
	scanf("%d %s %s %d", &one.no, &one.name, &one.address, &one.age);
	printf("Employee - No: %d, Name: %s, Address: %s & Age: %d", one.no, one.name, one.address, one.age);
	return 0;
}
