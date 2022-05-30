package Estruturadedadosatv;

public class Teste {
    int Teste (int x){
        if (x==0){
        return 1;}


    return(x*Teste(x-1));}
    public static void main(String[] args) {
        Teste texte  = new Teste( );
                System.out.println("_______________________");
                System.out.println("\n"+ texte.Teste(8));
                System.out.println("_______________________");
                System.out.println("\n"+ texte.Teste(20));
                System.out.println("_______________________");
                System.out.println("\n"+ texte.Teste(9));
                System.out.println("_______________________");
    }
}
