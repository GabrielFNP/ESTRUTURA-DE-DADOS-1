#include<stdio.h>

void calc_esfera(float R, float *area, float *volume) {
    (*area) = 4 * 3.1415 * R * R;
    (*volume) = (4/3) * 3.1415 * R * R * R;
}

int main(void){
    
    float raio, area, volume;
    
    printf("Entre com o raio: ");
    scanf("%f", &raio);

    calc_esfera(raio, &area, &volume);
    printf("\nA area  da superficie é: %.2f", area);
    printf("\nO volume de uma esfera é: %.2f\n", volume);

    return 0;
}
