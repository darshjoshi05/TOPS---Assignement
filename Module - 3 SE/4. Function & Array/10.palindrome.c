// 10.WAP to perform Palindrome number using for loop and function

#include<stdio.h>

int checkPalindrome(int n) {
	int rev = 0, rem = 0, org = n;
	
	while(n != 0) {
		rem = n % 10;
		rev = rev * 10 + rem;
		n /= 10;
	} 
	
	if (org == rev) {
		return printf("Your number is Palindrome.");
	} else {
		return printf("Your number is not a Palindrome.");
	}	
} 

int main() {
	int n;
	printf("Enter your number: ");
	scanf("%d", &n);
	checkPalindrome(n);
	return 0;
}
