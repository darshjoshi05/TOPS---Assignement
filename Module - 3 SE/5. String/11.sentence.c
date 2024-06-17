// 11.Write a program in C to read a sentence and replace lowercase characters with
// uppercase and vice versa.

#include<stdio.h>
#include<string.h>
#include<ctype.h>

int main() {
	char sen[100];
	int len, i;
	
	printf("Enter a sentence: ");
	scanf("%[^\n]s", sen);
	
	len = strlen(sen);

	for (i = 0; i <= len; i++) {
		if (sen[i] >= 'A' && sen[i] <= 'Z') {
			sen[i] = tolower(sen[i]);
		} else {
			sen[i] = toupper(sen[i]);
		}
	}
	
	printf("Modified Sentence: %s", sen);
	
	return 0;
}

