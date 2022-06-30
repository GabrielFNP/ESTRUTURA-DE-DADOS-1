package EstruturaAtv.Aula07.Atv01;

    
public class Iverter {
    String[] elemento;
    String txt;
    char[] invertido;
    int top, qtd, qtdPalavra;
    

    public Iverter(String txt) {
        elemento = new String[qtd];
        elemento = txt.split(" ");

        this.txt = txt;
        this.qtd = elemento.length;
        top = -1;

        for (int i = 0; i < qtd; i++) {
            push(elemento[i]);
        }

    }

    public void push(String y) {   
        top++;
        this.qtdPalavra = y.length();  
        this.invertido = new char[qtdPalavra];

        int j = 0;

        for (int i = (qtdPalavra - 1); i > -1; i--) { 
            invertido[i] = y.charAt(j);   
            j++;
        }

        elemento[top] = String.valueOf(invertido);
    }
     public String top() {   
        return elemento[top];
    }
 
    public String pop() {   
        String a;
        a = elemento[top];
        top--;

        return a;
    }

    public boolean isEmpty() {  
        return (top == -1);
    }

    public void empty() { 
        top = -1;
    }

    public boolean isFull() {  
        return (top == (qtd - 1));
    }


    public int getQtd() {  
        return qtd;
    }
    public String getElementos() {
        top++;
        return top();
    }
}