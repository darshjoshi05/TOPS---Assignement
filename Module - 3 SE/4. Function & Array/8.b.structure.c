// b. Write a program of structure for five employee that
// provides the following information -print and display
//  empno, empname, address andage

#include<stdio.h>

struct employeeInfo {
	int no, age;
	char name[50], address[50];
};

int main() {
	struct employeeInfo five[5];
	int i;
	
	for (i = 0; i < 5; i++) {
		printf("Enter details(no., name, address & age) of employee %d: ", i + 1);
		scanf("%d %s %s %d", &five[i].no, &five[i].name, &five[i].address, &five[i].age);
	}
	
	for (i = 0; i < 5; i++) {
		printf("Employee %d - No: %d, Name: %s, Address: %s and Age: %d\n", i + 1, five[i].no, five[i].name, five[i].address, five[i].age);
	}
	return 0;
}
