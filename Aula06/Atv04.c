void troca(int *a, int *b){
    int c;
    c = *a;
    *a = *b;
    *b = c;
}

int main(){
    int A = 10, B= 15;
    printf("Numeros antes da troca:\n");
    printf("A: %d\tB: %d\n", A, B);
    troca(&A, &B);
    printf("Numeros apos a troca:\n");
    printf("A: %d\tB: %d\n", A, B);

    return 0;
}
