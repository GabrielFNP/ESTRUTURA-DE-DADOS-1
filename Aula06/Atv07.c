#include<stdio.h>

int somar(int *a, int b){
    *a = *a + b;
}

int main(){
    int A,B;
    printf("Entre com um valor pra A e B:\n");
    scanf("%i %i",&A,&B);
    
    somar(&A, B);
    printf("A soma dos dois numeros armazenas na variavel A é = %i",A);
}
