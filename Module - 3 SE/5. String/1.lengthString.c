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
    printf("Length of string : %d",length);
	return 0;
}
