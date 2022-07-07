package EstruturaAtv.Aula13.Atv03;

public class RandomNumberGenerator {
    public static int generate(int x, int y) { //x eh intervalo inferior. y eh o intervalo superior.
        return (int) ((y - x + 1) * Math.random() + x);// gera um numero entre 1 e 9
    }
    
}
