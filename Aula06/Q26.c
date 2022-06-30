#include <stdio.h>
#include <math.h>

float delta(float a, float b, float c){
float d;
d = (b * b - 4 * a * c);
return d;
}

float raiz(float d){
float r;
r = sqrt(d); 	//Calcula raiz quadrada
return r;
}

int raizes(float a, float b, float c, float d, float r, float *x1, float *x2){
*x1 = ((- + r)/2 * a);
*x2 = ((- - r)/2 * a);
return ;

}

int main(){

float a, b, c, d, r, x1, x2;

printf("Entre com o valor de a: ");
scanf("%f",&a);
printf("Entre com o valor de b: ");
scanf("%f",&b);
printf("Entre com o valor de c: ");
scanf("%f",&c);

d = delta(a, b, c);
r = raiz(d);

//Se ? < 0 nao existe real
if (d < 0){
printf("O valor de delta eh: %.2f\n",d);
printf("Nao existe raiz de delta.\n");

}else{
    
//Se ? = 0 existe uma raiz real   
if (d == 0){
printf("O valor de delta eh: %.2f\n",d);
printf("A raiz de delta eh: %.2f\n",r);

raizes(a, b, c, d, r, &x1, &x2);
printf("Tem uma raiz: x1=%.2f e x2=%.2f\n", x1, x2);

}else{
    
//Se ? = 0 existem duas ra´izes reais   
if (d >= 0){
printf("O valor de delta eh: %.2f\n",d);
printf("A raiz de delta eh: %.2f\n",r);
raizes(a, b, c, d, r, &x1, &x2);
printf("Tem duas raizes: x1= %.2f eh x2= %.2f\n", x1, x2);

    }
  }
}
return 0;

}
