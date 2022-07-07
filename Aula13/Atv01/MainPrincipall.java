package EstruturaAtv.Aula13.Atv01;
/*Escreva um programa em Java que utilize uma pilha dinâmica para verificar se expressões aritméticas estão com a parametrização correta. O programa deve verificar expressões para ver se cada  “abre parênteses”  tem um “fecha parênteses” correspondente.

Ex.:Correto:  (  (  )  )  –  (  (  ) (  )  )  –  (  )  (  )

Incorreto:  ) (  –  (  (  )  (  –  )  )  (  (

Correto: { [ ( - ) ] }

Incorreto: { [ ( - ] } )((7*5)*4-(8/3)

O programa deve avaliar se uma expressão matemética lida do teclado está escrita corretamente com o uso dos parênteses, colchetes ou chaves.

Ex.: Correto: ((7*5)*4-(8/3)) 

Incorreto: ((7*5)*4-(8/3)

Gravar um vídeo de 5 a 10 min e postar o código no GitHub */
import java.util.Scanner;

public class MainPrincipall {
    public static void main(String[] args) throws Exception {
        try (Scanner scan = new Scanner(System.in)) {
            linkedlist Parentheses = new linkedlist();
            linkedlist brackets = new linkedlist();
            linkedlist Keys = new linkedlist();
            boolean verificação = true;

            System.out.println("Enter the expression::");
            String palavra = scan.next();
            String vet[] = palavra.split("");
            for (int i = 0; i < vet.length; i++) {
                if (vet[i].equals("(")) {
                    Parentheses.push(vet[i]);
                }
                if (vet[i].equals(")")) {
                    if (Parentheses.isEmpyt()) {
                        verificação = false;
                        break;
                    } else
                        Parentheses.pop();
                }

                if (vet[i].equals("[")) {
                    brackets.push(vet[i]);
                }
                if (vet[i].equals("]")) {
                    if (brackets.isEmpyt()) {
                        verificação = false;
                        break;
                    } else
                        brackets.pop();
                }

                if (vet[i].equals("{")) {
                    Keys.push(vet[i]);
                }
                if (vet[i].equals("}")) {
                    if (Keys.isEmpyt()) {
                        verificação = false;
                        break;
                    } else
                        Keys.pop();
                }
            }
            if (Keys.isEmpyt()) {
                if (Parentheses.isEmpyt() && brackets.isEmpyt() && Keys.isEmpyt() && verificação) {
                    System.out.println("The expression is correct");
                } else {
                    System.out.println("The expression is not correct");
                }
            }
        }
    }
}