package EstruturaAtv.Aula13.Atv03;

import java.util.Random;

public class Appp {
    public static void main(String[] args) throws Exception {
        Random rand = new Random();
        Dinamica p1 = new Dinamica();
        Dinamica p2 = new Dinamica();
        Dinamica p3 = new Dinamica();
        
        for(int i = 0; i<100;i++){
            int num = rand.nextInt(1,10);
            if(num >= 1 && num <=3){
                p1.push(num);
            } else if(num >= 4 && num <=6){
                p2.push(num);
            } else if(num >= 7 && num <=9){
                p3.push(num);
            }
        }
        for(int i = 0; i<100;i++){
            int num = rand.nextInt(1,4);
            switch (num) {
                case 1:
                    p1.push(p2.pop());
                    p1.push(p3.pop());
                    break;
                case 2:
                    p2.push(p1.pop());
                    p2.push(p3.pop());
                    break;
                case 3:
                    p3.push(p1.pop());
                    p3.push(p2.pop());
                    break;
                default:
                    break;
            }
        }
        p1.imprimir(p2,p3);
    }
}