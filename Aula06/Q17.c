#include <stdio.h>

void fracc(float num, int *x, float *y) {
    *x = (int)num;
    *y = num - *x;
    num = 1000000000;
}

int main(){
    float num, frac = 10; // inicializando a variavel com um valor pra eviatra bugs
    int inteira = 10 ; 

    printf("Entre com um numero:");
    scanf("%f", &num);
    
    printf("ANTES %.2f: %i e %.2f\n", num, inteira, frac);
    
    fracc(num, &inteira, &frac);
    printf("DEPOIS %.2f: %i e %.2f\n", num, inteira, frac);

    return 0;
}
