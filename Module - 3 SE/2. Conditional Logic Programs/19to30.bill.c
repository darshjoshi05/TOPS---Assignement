// 19.Write a program in C to calculate and print the electricity bill

#include <stdio.h>
int main() {
    int customer_id;
    char customer_name[50];
    float unit_consumed, charge_per_unit, total_amount, surcharge;
    
    printf("Enter customer ID: ");
    scanf("%d", &customer_id);
    printf("Enter customer name: ");
    scanf("%s", customer_name);
    printf("Enter unit consumed: ");
    scanf("%f", &unit_consumed);
    
    if (unit_consumed <= 350) {
        charge_per_unit = 1.20;
    } else if (unit_consumed > 350 && unit_consumed <= 600) {
        charge_per_unit = 1.50;
    } else if (unit_consumed > 600 && unit_consumed <= 800) {
        charge_per_unit = 1.80;
    } else {
        charge_per_unit = 2.00;
    }

    total_amount = unit_consumed * charge_per_unit;

    if (total_amount > 800) {
        surcharge = total_amount * 0.18;
    }

    total_amount += surcharge;

    printf("\nElectricity Bill\n");
    printf("Customer ID: %d\n", customer_id);
    printf("Customer Name: %s\n", customer_name);
    printf("Unit Consumed: %.2f\n", unit_consumed);
    printf("Charge per unit: Rs. %.2f\n", charge_per_unit);
    printf("Total Amount: Rs. %.2f\n", total_amount);

    return 0;
}

