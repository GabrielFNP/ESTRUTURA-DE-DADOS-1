package Aula02;


public class Alg40 {

  public static void main(String[] args) {
    Divisao operacaoDeDivisao = new Divisao();
    operacaoDeDivisao.dividendo = 10;
    operacaoDeDivisao.divisor = 3;
    operacaoDeDivisao.quociente =
      operacaoDeDivisao.dividendo / operacaoDeDivisao.divisor;
    operacaoDeDivisao.resto =
      operacaoDeDivisao.dividendo % operacaoDeDivisao.divisor;
    System.out.println("O dividendo e: " + operacaoDeDivisao.dividendo);
    System.out.println("O divisor e: " + operacaoDeDivisao.divisor);
    System.out.println("O quociente e: " + operacaoDeDivisao.quociente);
    System.out.println("O resto e: " + operacaoDeDivisao.resto);
  }
}
