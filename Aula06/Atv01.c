#include <stdio.h>

int main()
{
    int x = 10;
    float y = 3.6;
    char z = 'A';

    int *ponteiroint = &x;
    float *ponteirofloat = &y;
    char *ponteirochar = &z;

    printf("Valores Originais:\n");
    printf("%i ", *ponteiroint);
    printf("\n%f", *ponteirofloat);
    printf("\n%c", *ponteirochar);

    printf("\n\n");

    *ponteiroint = 5;
    *ponteirofloat = 12.0;
    *ponteirochar = 'B';

    printf("Valores apos as modifica�oes:\n");
    printf("%i ", *ponteiroint);
    printf("\n%f", *ponteirofloat);
    printf("\n%c", *ponteirochar);
}
