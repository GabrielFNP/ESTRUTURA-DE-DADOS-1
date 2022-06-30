#include <stdio.h> 

void preenchendoVetor(char *vetor, char elemento) {
	int i = 0;
	while(i<10) {
		*vetor = elemento;
		vetor++;
		i++;
		elemento++;
	} 
}
void imprimindoVetor(char *vetor) {
	int i;
	for (i=0; i<10; i++) 
		printf("\n[%d]: %c", (i+1), *(vetor+i));
}
int main() {
	char vetor[10], elemento = 'J';
	printf("Usando a aritimetica de ponteiros...");
	preenchendoVetor(vetor, elemento);
	imprimindoVetor(vetor);
	
	return 0;
}
