// 15.Convert school’s name in abbreviated form

#include <stdio.h>
#include <ctype.h>

int main() {
    char school[100], abb[50];
    int i, count = 0;

    for (i = 0; i < 50; i++) {
        abb[i] = '\0';
    }

    printf("Enter your school name: ");
    fgets(school, sizeof(school), stdin);
    
    if (school[0] != ' ' && school[0] != '\n') {
        abb[count++] = toupper(school[0]);
    }

    for (i = 1; school[i] != '\0'; i++) {
        if (school[i] == ' ' && school[i + 1] != ' ' && school[i + 1] != '\0' && school[i + 1] != '\n') {
            abb[count++] = toupper(school[i + 1]);
        }
    }
    
    abb[count] = '\0';

    printf("Abbreviation: %s\n", abb);

    return 0;
}

