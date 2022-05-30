package Estruturadedadosatv;

import java.util.Scanner;
public class atv400 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        int  i = 0;
        int  chave, quarto, op ;
        String resp = "";
        String resp1 = ""; 
        String nomep= "";
        float valor, total;
        chave = 0;
        op = 1;
        
        int[ ] leitos = new int [50];
        int[ ] nd = new int [50]; 
        String[] sit = new String[50];
        String[] din = new String[50];
        String[] dout = new String[50];
        String[] nome = new String[50];
        String[] tel = new String[50];
        float[] precos =  new float[50];
        float[] despesas =  new float[50];
        
        while (op != 7 ) {
           System.out.println("\n \n HOTEL DA FAZENDONA \n");
           System.out.println("1. Cadastrar quartos");
           System.out.println("2. Lista de todos os quartos");
           System.out.println("3. Lista dos quartos oculpados");
           System.out.println("4. Aluguel/Reserva quarto");
           System.out.println("5. Entra despesas extras");
           System.out.println("6. Calcula despesa quarto");
           System.out.println("7. Sair");
           System.out.println("Opção: ");
           op = sc.nextInt(); 
           System.out.println();
           if (op == 1) {
               if (chave == 1) {
                   System.out.println("Atenção! Dados já cadastrados ");
               } else{
                   
                while(i < 50){
                    // sit[i] <-"L";nd[i] <- 0; despesas[i] <- 0.;
                      // din[i] <-"XXXX"; dout[i] <-"XXXX"; nome[i] <- tel [i] <precos[i] <- 30.; leitos[i] <-5;}
                      // O trecho abaixo é o correto
                      System.out.println("Quantidade de leitos para o quarto: " + (i + 1) + ": ");
                      leitos[i] =  sc.nextInt();
                      System.out.println("Preço do quarto: ");
                      precos[i] =  sc.nextFloat();
                      sit[i] = "L";
                      nd[i] = 0;
                      despesas[i] = 0;
                      din[i] = "XXXX";
                      dout[i] = "XXXX";
                      nome[i] = "";
                      tel[i] = "";
                       i++;
                }
                   chave = 1;
               }
           }
           else if (true) {
               if (op == 2) {
                   if (chave == 0) {
                       System.out.println("Escolha a opção 1.");
                   } else {
                       i = 0;
                                           
                    while (i < 50){
                        System.out.println("Numero de quartos :" + (i + 1) + "\n");
                          System.out.println("Situação dos quartos " + sit[i] );
                          System.out.println(); 
                               if(sit[i]== "A" || sit[i] == "R")
                               { System.out.println("\nNome:" + nome[i] + "\nTelefone: " + tel[i]); 
                               System.out.println("\nQuantidade de leitos: " + leitos[i]);
                               System.out.println("\nPreco do quarto: "+ precos[i]);
                               System.out.println( "\nDespesas: " + despesas[i]);
                               System.out.println("\nData de entrada: " + din[i]);
                               System.out.println("\nData de saida: " + dout[i]);
                               System.out.println("\nNumero de dias: " + nd[i]);
                               System.out.println("\nPressione enter para continuar:");}
                               
                           i++;
                    }
                   }
               }
           }
           if (true){
               if (op == 3) {
                   if(chave == 0){
                       System.out.println("Escolha a opção 1.");
                   }
               } else {
                   i = 0;
                 while (i < 50){
                    if (sit[i] == "A") {
                        System.out.println("\n Numero do quarto: " + (i+1) + "\n");                    System.out.println("\nDespesas: " + despesas[i]);
                        System.out.println("\nData de entrada: " + din[i]);
                        System.out.println("\nData de saida: " + dout[i]);
                        System.out.println("\nNumero de dias: " + nd[i]);
                        System.out.println("\nPressione enter para continuar:");  
                        resp = sc.next();
                    }
    
                     i++;
                 }
               }
   
           }
         
           if (true) {
            if (op == 4) {
                if (chave == 0) {
                    System.out.println("Escolha a opção 1.");
                } else {
                    System.out.println("Digite A(aluguel) R(reserva): ");
                    resp = sc.next();
                                     
                     while (resp != "A" && resp != "a" && resp != "R" && resp != "r"){
                        System.out.println("Resposta invalida. Digite A(aluguel) R(reserva): ");
                        resp = sc.next();
                     }
                }
                 if ( resp == "A" || resp == "a") {
                 System.out.println("Entre com nome: ");
                 nomep = sc.next();
                 i=0;
                  while ( nomep != nome[i] && i < 49 ){
                    i++;
                  }
                 if (nomep == nome[i]) {
                     quarto = i;
                     sit[i] = "A";
                     despesas[i] = 0;
                     System.out.println("\ndata de entrada: ");
                     din[quarto] =  sc.next();
                     System.out.println("\ndata de saida: "); 
                     dout[quarto] = sc.next();
                     System.out.println("\nnumero de dias: "); 
                     nd[quarto] = sc.nextInt(); 
                 } 
               } else {
                 System.out.println("\nReserva não encontrada! ");
                 resp1 = "N";
                }
               }   
           
            
           if (resp1.equals("N") || resp1.equals("n") || resp.equals("r") || resp.equals("R")) {
               i = 0;
               if (i < 50) {
                   if (sit[i] == "L") {
                       System.out.println("Numero do quarto: " + (i + 1) + "\n");
                       System.out.println("Quantidade de leitos: " + leitos[i]);
                       System.out.println("Preco de quarto: " + precos[i]);
                       System.out.println("Pressione enter pra continuar: ");
                   }
                   i++;
               }
           
            System.out.println("Digite o numero de quarto para o aluguel ou reserva: ");
            quarto = sc.nextInt();
            while (quarto < 1 || quarto > 50) {
                System.out.println("Quarto invalido. Entre novamente: ");
                quarto = sc.nextInt();
                while ((sit[quarto-1] == "A")) {
                    System.out.println("Quarto ocupado. Digite novamente: ");
                   quarto = sc.nextInt();
                }
            }
           if (resp == "A" || resp == "a") {
               sit[quarto - 1] = "A";    
           }else{
               sit[quarto - 1] = "R";
           }
           System.out.println("Digite o nome: ");
           nome[quarto - 1] = sc.next();
           System.out.println("Digite o telefone de contato: ");
           tel[quarto-1] = sc.next();
           System.out.println("Data de entrada: ");
           din[quarto - 1] = sc.next();
           System.out.println("Data de saida: ");
           dout[quarto - 1] = sc.next();
           System.out.println("Numero de dias: ");
           nd[quarto - 1] = sc.nextInt();
       }
   
       } if (true) {
           if (op == 5 ) {
           if (chave == 0) {
               System.out.println("Escolha  a opção 1.");
           } else {
              System.out.println("Entre com o numero do quarto: "); 
              quarto =  sc.nextInt();
              
                while (quarto < 1|| quarto > 50){
                    System.out.println("Entre com numero do quarto: ");
                    quarto = sc.nextInt();
                }
              System.out.println("Despesas: ");
              valor = sc.nextFloat();
              despesas[quarto-1] = despesas[quarto-1] + valor;
           }        
        }
       } if (true) {
           if (op == 6) {
               if (chave==0) {
                   System.out.println("Escolha a opção 1.");
               } else {
                   System.out.println("Entre com o numero do quarto: ");
                   quarto = sc.nextInt();
                   while ( quarto < 1 || quarto > 50){
                    System.out.println("Entre com o numero do quarto: ");
                    quarto = sc.nextInt();
                   }
                total = despesas[quarto - 1] + precos[quarto - 1];
                System.out.println("Despesas: R$" + total);
                sit[quarto - 1] = "L";
                despesas[quarto- 1] = 0;
                din[quarto - 1] = "XXXX" ;
                dout[quarto - 1] = "XXXX";
                nd[quarto - 1] = 0;
                nome[quarto - 1] = "";  
               }
           }
       }{
           if (op == 7) {
               System.out.println("SAINDO");
           }else{
               System.out.println("Opção invalida");
           }
       }
       }
       System.out.println("\n"); 
       sc.close();
       
    }
}