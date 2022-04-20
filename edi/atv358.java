import java.util.Scanner;
public class atv358 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {    ////variaveis
            int menor10 = 0;
            int menor20 = 0;
            int maior20 = 0;
            float lucro;
            float[] compra = new float[100];
            float[] venda = new float [100];
            int a = 0;

            do {
             System.out.println("Preço compra: ");   /////atribuições
                compra[a] = sc.nextFloat();
             System.out.println("Preço venda: ");
                venda[a] = sc.nextFloat();  
             a++;
            } while (a < 100);
            a = 0;
            do {
            lucro = venda[a] - compra[a];  /////calculo
            if (lucro < 0.1 * compra[a]) {
                  menor10++;
            } else if (lucro <= 0.2 * compra[a]) {
                  menor20++;
            } else {
                  maior20++;
                }
            a++;
            } while (a < 100);                       //resultados
            System.out.println("total de mercadorias com lucro < 10%:" + menor10);
            System.out.println("total de mercadorias com 10% <= lucro <= 20%: " + menor20);
            System.out.println("total de mercadorias com lucro > 20%: "+ maior20);
        }
    }
}