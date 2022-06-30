#include <stdio.h>

int main() {
	int A;
	int *B = &A;   //calcula o dobro
	int **C = &B;  //calcula o triplo
	int ***D = &C; //calcula o quádruplo
	
	printf("\nEntre com o valor base: ");
	scanf("%d", &A);
	
	printf("\nDobro do valor eh: %d", (*B * 2));
	printf("\nTriplo do valor eh: %d", (**C * 3));
	printf("\nQuadruplo do valor eh: %d", (***D * 4)); 
	
	return 0;
}
