package EstruturaAtv.Aula12.Atv01;

public class Main {
    /*Vamos testar se a lista está funcionando
corretamente:
● 1) Adicione Homer e Marge na lista e depois
imprima o resultado.
● 2) Esvazie a lista e imprima.
● 3) Adicione Homer na lista. Depois adicione Bart na
posição 0 e Moll na posição 1 e imprima a lista
● 4) Esvazie a lista.

Listas Encadeadas Parte II

● Vamos testar se a lista está funcionando
corretamente:
● 5) Adicione Homer e Bart na lista e depois Adicione
Lisa no início da lista. Imprima o resultado e o
tamanho da lista.
● 6) Esvazie a lista e imprima.
● 7) Adicione Homer, Maggie na lista. Depois adicione
Bart na posição 0 e Marge na posição 1 e
imprima a lista. Verifique se Lisa está na lista.
● 8) Esvazie a lista.

Listas Encadeadas Parte II

● Vamos testar se a lista está funcionando corretamente:
● 9) Adicione Homer e Bart na lista e depois imprima o
resultado e o tamanho da lista.
● 10) Verifique se Marge, Homer, Bart e Maggie estão na
lista e depois imprima o resultado e o tamanho da lista.
● 11) Esvazie a lista.
● 12) Adicione Homer e Bart no começo da lista. Depois
adicione Marge, e depois Maggie na posição 1 e depois
Ned Flanders no Começo da lista e Sr. Burns no Final
da lista imprima a lista
● 13) Remova do fim da lista e imprima a lista.

Listas Encadeadas Parte II

● Vamos testar se a lista está funcionando corretamente:
● 14) Remova a posição 1, depois imprima a lista e o
tamanho da lista.
● 15) Verifique se Marge, Homer, Bart e Maggie estão na
lista e depois imprima o resultado e o tamanho da lista.
● 16) Remova do começo da lista, depois imprima a lista e o
tamanho da lista.
● 17) Verifique se Marge, Homer, Bart e Maggie na lista e
depois imprima o resultado e o tamanho da lista.
● 18) Esvazie a lista e imprima. */
    public static void main(String[] args) throws Exception {
        ListaDupla ld = new ListaDupla();
        //● 1) Adicione Homer e Marge na lista e depois imprima o resultado.
//● 2) Esvazie a lista e imprima.
//● 3) Adicione Homer na lista. Depois adicione Bart na posição 0 e Moll na posição 1 e imprima a lista
//● 4) Esvazie a lista.
        ld.Adiciona("Homer");
        ld.Adiciona("Marge");
        System.out.println(ld.Imprimir());

        ld.EsvaziaLista();
        System.out.println(ld.Imprimir());

        ld.Adiciona("Homer");
        ld.Adiciona(0, "Bart");
        ld.Adiciona(1, "Moll");
        System.out.println(ld.Imprimir());

        ld.Adiciona("Homer");
        ld.Adiciona("Bart");
        ld.AdicionaNoComeco("Lisa");

        System.out.println(ld.Imprimir());
        System.out.println(ld.tamanho());
        

        ld.EsvaziaLista();

        ld.Adiciona("Homer");
        ld.Adiciona("Bart");
        System.out.println(ld.Imprimir());
        System.out.println(ld.tamanho());
        

        System.out.println("Marge: "+ld.Contem("Marge")+"Homer: "+ld.Contem("Homer")+"Bart: "+ld.Contem("Bart")+"Maggie: "+ld.Contem("Maggie"));
        System.out.println(ld.Imprimir());
        System.out.println(ld.tamanho());
        

        ld.EsvaziaLista();

        ld.AdicionaNoComeco("Homer");
        ld.AdicionaNoComeco("Bart");
        ld.Adiciona(1, "Marge");
        ld.Adiciona(1, "Maggie");
        ld.AdicionaNoComeco("Ned Flanders");
        ld.Adiciona("Sr. Burns");
        System.out.println(ld.Imprimir());

        ld.RemovedoFim();
        System.out.println(ld.Imprimir()); 

        ld.RemovedoComeco();
        System.out.println(ld.Imprimir());
        System.out.println(ld.tamanho());
        

        System.out.println("Marge: "+ld.Contem("Marge")+"Homer: "+ld.Contem("Homer")+"Bart: "+ld.Contem("Bart")+"Maggie: "+ld.Contem("Maggie"));
        System.out.println(ld.Imprimir());
        System.out.println(ld.tamanho());
        

        ld.RemovedoComeco();
        System.out.println(ld.Imprimir());
        System.out.println(ld.tamanho());
        

        System.out.println("Marge: "+ld.Contem("Marge")+"Homer: "+ld.Contem("Homer")+"Bart: "+ld.Contem("Bart")+"Maggie: "+ld.Contem("Maggie"));
        System.out.println(ld.Imprimir());
        System.out.println(ld.tamanho());
        

        ld.EsvaziaLista();
        System.out.println(ld.Imprimir());


    }
}