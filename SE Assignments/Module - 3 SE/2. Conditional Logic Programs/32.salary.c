// 32.Write a C program to calculate gross salary


#include <stdio.h>

int main() {
    float basic_salary, gross_salary, hra, da;

    printf("Enter the basic salary of the employee: ");
    scanf("%f", &basic_salary);

    if (basic_salary <= 10000) {
        hra = 0.20 * basic_salary;
        da = 0.80 * basic_salary;
    } else if (basic_salary <= 20000) {
        hra = 0.25 * basic_salary;
        da = 0.90 * basic_salary;
    } else {
        hra = 0.30 * basic_salary;
        da = 0.95 * basic_salary;
    }

    gross_salary = basic_salary + hra + da;

    printf("Gross salary: %.2f\n", gross_salary);

    return 0;
}

