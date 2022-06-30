#include<stdio.h>

int vmaximo, repetindo; 

    vmaximo = 0;
    repetindo = 0;

void verificando(int *elementos, int num_elementos) {  

    int j;
    vmaximo = elementos[0];

        for(j=0; j<num_elementos; j++) {  

            if(vmaximo<=elementos[j]) {
            vmaximo = elementos[j];
}
}

        for(j=0; j<num_elementos; j++) {  

            if(vmaximo==elementos[j]) {
            repetindo++;
}
}
}

void main (){

    int N;
    int i = 0;

    printf("Digite a quantidade de  numeros para sua lista:\n");
    scanf ("%d", &N);

    int lista[N];

    for (i = 0; i < N; i++){

       printf("\nDigite o numero %d:\n", i+1);
       scanf("%d", &lista[i]);

}

    verificando(lista, N); 

    printf("\nO maior numero digitado foi: %d\n", vmaximo);
    printf("Este numero se repetiu %d vezes\n", repetindo);


