#include <stdio.h>


int main() {
    
	float matriz[3][3] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
	int i, j;
	
	printf("Endere�o de cada posi�ao da matriz:\n\n");
	for (i=0; i<3; i++) {
		for (j=0; j<3; j++)
			printf("%p\n", &matriz[i][j]);
	}	
	
	return 0;
}
