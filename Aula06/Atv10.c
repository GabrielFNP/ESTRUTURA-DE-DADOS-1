-#include <stdio.h>

int main() {
    
  int valor[5];

  int *ponteiro_valor = valor;  // Esta apontando para o inicio do array.
  for(int i = 0; i < 5; ++i) {
    printf("Entre com um número: ");
    scanf("%d", ponteiro_valor);
    ++ponteiro_valor;// incrementa o ponteiro para o proximo elemento.
  }
  ponteiro_valor = valor;
  for(int i = 0; i < 5; ++i) {
    printf("%d\n", (*ponteiro_valor) * 2);// imprimindo o dobro de cada elemento.
    ++ponteiro_valor;
  }

  return 0;
}
