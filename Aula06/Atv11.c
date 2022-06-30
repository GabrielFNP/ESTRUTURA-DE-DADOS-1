#include <stdio.h>
#include <stdlib.h>

int main (){
    
int vet[5], i;
int *Endercovetor;

Endercovetor = vet;

printf("Entre com os elementos\n");
for(i = 0; i < 5; i++){
printf("%d: ",i+1);
scanf("%d", &vet[i]);

}

printf("ELEMENTOS ADICIONADOS:\n\n");
for(i = 0; i < 5; i++){
printf("%d  ",vet[i]);
}

printf("\n\nENDERECOS DO ARRAY:\n");
for(i = 0; i < 5; i++){
printf("%i: %i : %i\n",i+1, vet[i], Endercovetor++);
} 

printf("\nENDERECOS DO ARRAY PARES:\n");
Endercovetor = vet;
for(i = 0; i < 5; i++){
if(vet[i] %2 == 0){
printf("\n%d  -->  Posicao = %d",vet[i], Endercovetor);
}
Endercovetor++;
}
}
