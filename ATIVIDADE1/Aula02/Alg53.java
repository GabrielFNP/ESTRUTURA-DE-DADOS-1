package Aula02;
import javax.swing.JOptionPane;

public class Alg53 {
  public static void main(String[] args) {
    Paralelepipedo pad1= new Paralelepipedo();
      
    String s;
    s =JOptionPane.showInputDialog("Entre com o valor da lateral A");
    
    pad1.dA = Double.parseDouble(s);
            
    s = JOptionPane.showInputDialog("Entre com o valor da lateral B");
    
    pad1.dB = Double.parseDouble(s);
    pad1.dC =Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor da lateral C"));
    pad1.dDiagonal = Math.sqrt(Math.pow(pad1.dA, 2)+Math.pow(pad1.dB, 2)+Math.pow(pad1.dC, 2));
    System.out.println("O valor da diagonal do paralelepipedo eh.."+pad1.dDiagonal);
    
    JOptionPane.showMessageDialog(null, "O valor da diagonal do paralelepipedo eh: "+ pad1.dDiagonal);
    
    if (pad1.dDiagonal <= 10){
        JOptionPane.showMessageDialog(null, "Diagonal Curta");
    }else {
                JOptionPane.showMessageDialog(null, "Diagonal Longa");
                }
     s = JOptionPane.showInputDialog("Deseja Continuar (s/n)?");
     switch(s){
         case "s": JOptionPane.showMessageDialog(null,"Sinto muito nao posso contunar pois ainda não vimos lacos de repeticao");
          break;
         case "n": JOptionPane.showMessageDialog(null,"Opcao correta, vamos terminar");
         break;
         default: JOptionPane.showMessageDialog(null,"Opcao invalida");

     
 }
    
}}
