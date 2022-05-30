package Estruturadedadosatv;
import java.util.Scanner;
public class atv418 {
    public static void main(String[] args) {

            try (Scanner sc = new Scanner(System.in)) {
                int[][] a = new int[4][4];
                int[][] b = new int[4][4];
                int[][] soma = new int[4][4];
                int l = 0;
                int c = 0;

      do {
                do {
                    System.out.print("Digite o elemento de A[ " + (l + 1) + " ][ " + (c+1)+" ] : ");
                    a[l][c]  = sc.nextInt();
                    c++;
                } while (c < 4);
                l++;
                c = 0;
      } while (l < 4);
      //--------------------
      l = 0;
      do {
                do {
                    System.out.print("Digite o elemento de B[ " + (l + 1) + " ][ " + (c+1)+" ] : ");
                    b[l][c] = sc.nextInt();
                    soma[l][c] = a[l][c] + b[l][c];
                c++;
                } while (c < 4);
                l++;
                c = 0;
      } while (l < 4);

      System.out.println("\t Matriz Soma \n");
      l=0;
      do {
                do { 
                    System.out.print("\t " + soma[l][c]);
                    System.out.println();
                    c++;
                } while (c < 4);
                l++;
                c = 0;
      } while ( l < 4);
            }
            System.out.println();

    }
}