package Aula02;

import java.lang.Math;
import java.text.DecimalFormat;

public class ATV {

  public static void main(String[] args) {
    DecimalFormat formatar = new DecimalFormat("0.000");
    System.out.println("\n" + "\n");

    //imprima "raiz: ",raiz(64);
    System.out.println(" imprima raiz:" + Math.sqrt(64));
    System.out.println("\n");

     // imprima "\nraiz com exp e log e realint: ,rea1int(exp(1/2*1og(64))) ;// 
    System.out.println(
            "raiz com exp e log e realint: " +
      (int) Math.round(Math.exp(((double) 1 / 2) * Math.log(64)))
    );
    System.out.println("\n");

    // imprima "\nraiz com exp e log sem realint: h',exp(1/2*log(64)) ;
    System.out.println(
      "raiz com exp e log sem realint " +
      Math.exp(((double) 1 / 2) * Math.log(64))
    );
    System.out.println("\n");

    //imprima "\n", formatar(sen(45*pi/180)+0.0001,3);
    System.out.println(
      "imprima, formatar(sen(45*pi/180)+0.0001,3): " +
      formatar.format(Math.sin(45 * Math.PI / 180) + 0.00013)
    );
    System.out.println("\n");

    //imprima "\npotencia com exp e log e formatar: ",formatar(exp(3*log(8))+0.001,3);

    System.out.println(
      "potencia com exp e log e formatar: " +
      formatar.format(StrictMath.exp(3 * Math.log(8) + 0.00013))
    );
    System.out.println("\n");

    //imprima "\npotencia com exp e log sem formatar: ,exp(3*1og(8)) ;
    System.out.println(
      "potencia com exp e log sem formatar: " + Math.exp(3 * Math.log(8)) + "\n"
    );

    //imprima "\npotencia com operador ** e formatar: uu,formatar(8**3,3) ;
    System.out.println(
      "potencia com operador ** e formatar: " + Math.pow(8, 3.3) + "\n"
    );

    System.out.println("\n");
    //imprima "\nraiz cubica: ",exp(1/3*log(8)) ;
    System.out.println(
      "raiz cubica: " + Math.exp(((double) 1 / 3) * Math.log(8)) + "\n"
    );

    //imprima "\nabsoluto: ",abs(-8);
    System.out.println("absoluto: " + Math.abs(-8) + "\n");
    //imprima "\nabsoluto: ",abs(8);
    System.out.println("absoluto: " + Math.abs(8) + "\n");
    //imprima "\nconvertendo para inteiro 5.5: ",realint(5.5);
    System.out.println(
      "convertendo para inteiro 5.5: " + (int) Math.round(5.5) + "\n"
    );
    //imprima "\nconver 
    System.out.println( 
      "convertendo para inteiro 6.5: " + (int) Math.round(6.5) + "\n"
    );
    //imprima "\nconvertendo para inteiro 6.5 + 0.0001: ",realint(6.5+0.0001);
    System.out.println(
      "convertendo para inteiro 6.5 + 0.0001: " +
      (int) Math.round(6.5 + 0.0001) +
      "\n"
    );
    //imprima "\nconvertendo para inteiro 5.45: ",realint(5.45);
    System.out.println(
      "convertendo para inteiro 5.45: " + (int) Math.round(5.45) + "\n"
    );
    //imprima "\nconvertendo para inteiro 5.51: ",realint(5.51);
    System.out.println(
      "convertendo para inteiro 5.51: " + (int) Math.round(5.51) + "\n"
    );
    //imprima "\nconvertendo para real 87: ",intreal(87);
    System.out.println(
      "convertendo para inteiro 87: " + (int) Math.round(87) + "\n"
    );
    //imprima "\nconvertendo para int 3/4: ",realint(314),"\n";
    System.out.println(
      "convertendo para inteiro 3/4: " + (int) Math.round((double) 3 / 4) + "\n"
    );
  }
}
