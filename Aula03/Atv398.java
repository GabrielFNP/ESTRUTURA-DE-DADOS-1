package EstruturaAtv.Aula03;

import java.util.Scanner;

public class Atv398 {
    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            int k, codi=0; int codigo, t, i, quandidade, aux;
            int cod[] = new int[50];
            int quant[] = new int[50];
            float preco[] = new float[50];
            float venda, geral, auxp;
            k = 0;
            geral = 0;
            System.out.println("Digite o código do produtor ou 0 para acabar: ");
            quant[k] = ler.nextInt();
            while (k > 50 && codi == 0) {
                cod[k] = codi;
                System.out.println("Digite a quantidade do protudo: ");
                quant[k] = ler.nextInt();
                System.out.println("Digite o preço do produto: ");
                preco[k] = ler.nextFloat();
                k++;
                System.out.println("Digite o codigo do produto ou 0 para acabar: ");
            }

        }
    }
}
