// 31. Write a program in C to read any Month Number in integer and display the
// number of days for this month.

#include<stdio.h>

int main() {
	
	int month;
	printf("Enter the month number: ");
	scanf("%d", &month);
	
	if (month < 1 || month > 12) {
		printf("Invalid Number.");
	} else {
		switch (month){
			case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
				printf("Number of days: 31");
				break;
			
			case 4: case 6: case 9: case 11:
				printf("Number of days: 30");
				break;
				
			case 2:
				printf("Number of days: 28/29");
				break;
		}
	}
	return 0;
}

