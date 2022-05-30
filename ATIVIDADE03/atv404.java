package Estruturadedadosatv;
import java.util.Scanner;
public class atv404 {
    public static void main(String[] args) {
       
        try (Scanner sc = new Scanner(System.in)) {
            int[][] N = new int[10][10];
            int L, c, t;
            L = 0;
            c = 0;
            t = 0;
            int x = L+1;

            do {
                do {
                    System.out.println("Entre com o elemento linha: " + (L + 1) + " Coluna: " +(c + 1));
                    N[L][c] = sc.nextInt();
                    c++;   
                } while (c <= 9);
                L++;
                c = 0;
            } while (L <= 9);

            System.out.println("Acima da diagonal principal");
            t = 0;
            L = 0;
            c = L+1;
            do {
                do {
               
                System.out.print("\t" + N[L][x]);   
                c++;  
                } while ( c <= 9);
                
                System.out.println();
                do {
                    System.out.print("\t");
                    t++;  
                } while ( t <= L);

            t = 0;
            L++;
            } while (L <= 8);
        }
        System.out.println();
    }

}