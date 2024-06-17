// 27. 1/2 - 2/3 + 3/4 - 4/5 + 5/6 ..........n

#include <stdio.h>
int main() {
    int n, i;
    float sum = 0.0;
    printf("Enter the value of n: ");
    scanf("%d", &n);
    for (i = 1; i <= n; i++) {
        if (i % 2 == 0) {
            sum -= (float)i / (i + 1);
        } else {
            sum += (float)i / (i + 1);
        }
    }
    printf("Sum of the series up to %d terms is: %.2f\n", n, sum);
    return 0;
}

