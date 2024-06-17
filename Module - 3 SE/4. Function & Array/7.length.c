// 7. WAP Find out length of string without using inbuilt function

#include<stdio.h>
int main() {
	int length = 0, i = 0;
	char string[50];
	printf("Enter your string: ");
	scanf("%s", string);
	
	while (string[i] != '\0') {
		length++;
		i++;
	}
	
	printf("Length of string is %d", length);
	
	return 0;
}
