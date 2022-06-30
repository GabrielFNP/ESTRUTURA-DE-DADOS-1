#include<stdio.h>

int negativos( int n,float *vet ){
    for(int i = 1; i <= 5; i++){
        if(vet[i] < 0){
            n++;
        }
    }
    return n;
}

int main(){
    int nro = 0;
    float vet[5];
    for(int i= 1; i <= 5; i++){
        printf("Insira o valor para a posicao %d :",i);
        scanf("%f",&vet[i]);
    }
    printf("há %d numero(s) negativos!",negativos(nro, &vet));
    return 0;
}
