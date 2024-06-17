// ----- with 3rd variable -----
//#include<stdio.h>
//int main() {
//	int n1, n2, temp;
//	printf("Enter 2 numbers: ");
//	scanf("%d %d", &n1, &n2);
//	temp = n1;
//	n1 = n2;
//	n2 = temp;
//	printf("Number 1 is %d and Number 2 is %d", n1, n2);
//	return 0;
//}

// ----- without 3rd variable ----- 1=1+2, 2=1-2, 1=1-2  =4+5(1) =9-5(2) =9-5(1)
#include<stdio.h>
int main() {
	int n1, n2;
	printf("Enter 2 numbers: ");
	scanf("%d %d", &n1, &n2);
	n1 = n1 + n2; 
	n2 = n1 - n2; 
	n1 = n1 - n2; 
	printf("Number 1 is %d and Number 2 is %d", n1, n2);
	return 0;
}





