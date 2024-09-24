// 18. Write a C program to calculate profit and loss on a transaction.

#include <stdio.h>

int main() {
    int CP, SP, profit, loss;
    printf("Enter the cost price: ");
    scanf("%d", &CP);
    printf("Enter the selling price: ");
    scanf("%d", &SP);
    if (SP > CP) {
        profit = SP - CP;
        printf("Profit: %d\n", profit);
    } else if (SP < CP) {
        loss = CP - SP;
        printf("Loss: %d\n", loss);
    } else {
        printf("No profit, no loss.\n");
    }
    return 0;
}

