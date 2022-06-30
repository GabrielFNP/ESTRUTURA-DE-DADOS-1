#include <stdio.h>

int main()
{

  int x = 9;
  int y = 22;

  if (&x > &y)
  {
    printf("X tem o maior endereco de memoria\n");
    return;
  }
  printf("Y tem o maior endereco de memoria\n");
}
