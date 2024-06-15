// 16.Convert country’s name in abbreviate form

#include <stdio.h>
#include <ctype.h>

int main() {
    char country[100], abb[50];
    int i, count = 0;

    for (i = 0; i < 50; i++) {
        abb[i] = '\0';
    }

    printf("Enter your country name: ");
    fgets(country, sizeof(country), stdin);
    
    if (country[0] != ' ' && country[0] != '\n') {
        abb[count++] = toupper(country[0]);
    }

    for (i = 1; country[i] != '\0'; i++) {
        if (country[i] == ' ' && country[i + 1] != ' ' && country[i + 1] != '\0' && country[i + 1] != '\n') {
            abb[count++] = toupper(country[i + 1]);
        }
    }
    
    abb[count] = '\0';

    printf("Abbreviation: %s\n", abb);

    return 0;
}
