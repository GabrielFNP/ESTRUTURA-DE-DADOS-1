package EstruturaAtv.Aula07.Atv01;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite:");
        String txt = scan.nextLine();

        Iverter muda = new Iverter(txt);
        int quantidade = muda.getQtd();
        muda.empty();

        for (int i = 0; i < quantidade; i++) {
            System.out.print(muda.getElementos() + " ");
        }
    }
    
}
