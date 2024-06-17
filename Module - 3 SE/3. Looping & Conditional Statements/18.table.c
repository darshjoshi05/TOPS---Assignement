#include<stdio.h>
int main() {
	int i, tableFor, ans, tableTill;
	printf("Enter a numbers and till for its table: ");
	scanf("%d",&tableFor);
	scanf("%d",&tableTill);
	for(i=1; i <= tableTill; i++) {
		ans = tableFor * i;
		printf("%d X %d = %d \n", tableFor, i, ans);
	}
	return 0;
}
