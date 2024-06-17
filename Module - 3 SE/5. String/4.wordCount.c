// 4. Write a program in C to count the total number of words in a string.

#include<stdio.h>
int main() {
	char str[50], i;
	int length = 0;
	printf("Enter your string: ");
	scanf("%s", str);
	for(i = 0; str[i] != '\0'; i++)
	{
		length++; 
    }
    printf("Number of words in string : %d",length);
	return 0;
}
