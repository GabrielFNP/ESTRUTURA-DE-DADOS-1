#include <stdio.h>

int comparando(int *nro1, int *nro2){

int aux;

   if(*nro2 > *nro1) {
       aux = *nro2;
       *nro2 = *nro1;
       *nro1 = aux;
   }
}
int main(){

   int nro1, nro2;
  
   printf("Entre com o valor 1: ");
   scanf("%d", &nro1);

   printf("Entre com o valor 2: ");
   scanf("%d", &nro2);

   comparando(&nro1,&nro2); // Chamando a função
 
   printf("\nMaior valor: %d",nro1);
   printf("\nMenor valor: %d",nro2);
 
   return 0;
}
