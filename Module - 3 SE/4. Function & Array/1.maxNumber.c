#include<stdio.h>

void maxNumber() {
	int x;
    printf("How many numbers you want to enter?");
    scanf("%d",&x);
    
    int numbers[x], i, max;
    printf("Enter %d numbers: ", x);
    for(i = 0; i < x; i++) {
        scanf("%d", &numbers[i]);
    }
    
    max = numbers[0];
    
    for(i = 0; i < x; i++) {
    	if(numbers[i] > max) {
    		max = numbers[i];
		}
	}
    printf("Max Number: %d",max);
}

int main() {
    maxNumber();
    return 0;
}

