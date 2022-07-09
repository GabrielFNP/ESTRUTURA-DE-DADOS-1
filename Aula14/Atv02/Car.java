package EstruturaAtv.Aula14.Atv02;

public class Car {
    char state;
    int board;
    static int movements;

    public static void incrementMovement() {
        movements = movements +1;
    }

    public Car(char state, int board) {
        this.state = state;
        this.board = board;

    }
}
