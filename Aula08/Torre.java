package EstruturaAtv.Aula08;
import java.util.Scanner;

public class Torre {
    static long movimentos = 0;

    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        Double n;
        System.out.println("Entre com a quantidade de discos: ");
        n = entrada.nextDouble();

        double movimentosMinimos = Math.pow(2, n) - 1;
        long tempoInicial = System.currentTimeMillis();
        
        TorresdeHanoi(n, 'A', 'B', 'C');

        System.out.println("Quantidade de movimentos totais: " + movimentos);
        System.out.println("Quantidade de movimentos mínimos: " + movimentosMinimos);
        long tempoFinal = System.currentTimeMillis();
        System.out.printf("Tempo total de execução foi %.3f s%n" , (tempoFinal - tempoInicial)/1000d);
    }

    private static void TorresdeHanoi(Double n, char O, char D, char T) {
        if (n > 0) {
            TorresdeHanoi(n - 1, O, T, D);
            movimentos++;
            TorresdeHanoi(n - 1, T, D, O);
        }
    }
}