// 9. WAP to show difference between Structure and Union.

#include<stdio.h>

// Different keyword to define structure and union

struct structExample {
	int id;
	char name[50];
};

union unionExample {
	int id;
	char name[50];
};

int main() {
	struct stuctExample s;
	union unionExample u;
	
	// Difference in memory
	printf("Size of Structure: %d", sizeof(s));
	printf("Size of Union: %d", sizeof(u));
	
	return 0;
}
