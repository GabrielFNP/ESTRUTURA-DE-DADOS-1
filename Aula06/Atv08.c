#include <stdio.h>
#include <stdlib.h>

int main (void) {
	int i;
	float vetor[10];
	float *p;
	p = vetor;

    printf("Gerando 10 valores!!!\n");
	for (i = 0; i < 10; i++) { 
	
	}
    printf("\nENDERE�OS DO ARRAY:\n\n");
	for (i = 0; i < 10; i++) {
        printf("Endereco: %p\tPosi�ao: %d\n", vetor + i, *(vetor + i));
	}
	return 0;
}
