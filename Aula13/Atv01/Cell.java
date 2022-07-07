package EstruturaAtv.Aula13.Atv01;
public class Cell {
    // atribut
    private String  name;
    private Cell previous;

    public Cell() {
    }

    public Cell(String nome, Cell previous) {
        this.name = name;
        this.previous = previous;
    }

    public String getDado() {
        return this.name;
    }

    public void setDado(String name) {
        this.name = name;
    }

    public Cell getPrevious() {
        return (this.previous);
    }

    public void setPrevious(Cell previous) {
        this.previous = previous;
    }
}