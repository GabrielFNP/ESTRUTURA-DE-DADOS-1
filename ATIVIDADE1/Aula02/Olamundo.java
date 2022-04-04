package Aula02;

public class Olamundo {
    private char Turma;

    public static void main(String[] args){
        Olamundo objeto1 = new Olamundo();
        Olamundo objeto2 = new Olamundo();

        objeto2.Turma= 'c';
        System.out.println("Ola mundo, turma"+ objeto1.Turma);
        System.out.println("Nova Turma adicionada"+ "\n"+objeto2.Turma);
}}
