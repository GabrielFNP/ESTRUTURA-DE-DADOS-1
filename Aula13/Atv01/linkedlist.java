package EstruturaAtv.Aula13.Atv01;

public class linkedlist {
    private Cell top;

    public void push(String name) {
        Cell newcell = new Cell();
        newcell.setDado(name);
        newcell.setPrevious(this.top);
        this.top = newcell;
    }

    public String pop() {
        if (!isEmpyt()) {
            String d = this.top.getDado();

            this.top = this.top.getPrevious();
            return d;
        } else {
            System.out.println("empty stack!!!");
            return "";
        }
    }

    public boolean isEmpyt() {
        if (this.top == null) {
            return true;
        } else
            return false;
    }

    public int sizePilha() {
        Cell p;
        int cont = 0;
        p = this.top;
        while (p != null) {
            p = p.getPrevious();
            cont++;
        }
        return cont;
    }

    public void imprimir() {
        Cell p;
        p = this.top;
        if (isEmpyt()) {
            System.out.println("empty stack!!!");
        } else {
            while (p != null) {
                System.out.println("Name stack..: " + p.getDado());
                p = p.getPrevious();
            }
        }
    }

    public Cell top() {
        if (isEmpyt()) {
            System.out.println("empty stack!!!");
            return null;
        } else {
            System.out.println("Name on top of Stack..: " + top.getDado());
            return this.top;
        }
    }

}