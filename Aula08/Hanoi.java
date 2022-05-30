package Estruturadedadosatv.Aula08;

import java.lang.Math;

public class Hanoi {
    public static void main(String[] args) {
        long tempoInicial = System.currentTimeMillis();
        int discos = 4; // 1,10,20,30,40,41
        long p;
        hanoi(discos, 'A', 'B', 'C');
        long tempoFinal = System.currentTimeMillis();
        long tempoTotal = tempoFinal - tempoInicial;
        int miliSeg = (int) tempoTotal % 1000;
        int seg = (int) (tempoTotal / 1000) % 60;
        int min = (int) (tempoTotal / 60000) % 60;
        int hr = (int) tempoTotal / 3600000;
        System.out.println(String.format("%02d:%02d:%02d:%03d", hr, min, seg, miliSeg));

        p = (long) (Math.pow(2, discos) - 1);

        System.out.println("movimentos: " + p);
    }

    private static void hanoi(int discos, char origem, char aux, char destino) {
        if (discos > 0) {

            hanoi(discos - 1, origem, destino, aux);
            System.out.printf("%s -> %s\n", origem, destino);
            hanoi(discos - 1, aux, origem, destino);
        }
    }
}