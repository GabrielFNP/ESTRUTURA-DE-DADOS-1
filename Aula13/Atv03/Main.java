package EstruturaAtv.Aula13.Atv03;

import java.util.Random;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> stack3 = new Stack<>();
        int randomnumber;
        System.out.println("number:: ");
        for (int i = 0; i <= 100; i++) {
            randomnumber = RandomNumberGenerator.generate(1, 9);
            if (randomnumber >= 1 && randomnumber <= 3) {
                stack1.add(randomnumber);
            } else if (randomnumber >= 4 && randomnumber <= 6) {
                stack2.add(randomnumber);
            } else {
                stack3.add(randomnumber);
            }
        }
        for (int i = 0; i <= 100; i++) {
            randomnumber = RandomNumberGenerator.generate(1, 3);
            if (stack1.isEmpty() || stack2.isEmpty() || stack3.isEmpty()) {
                break;
            }
            if (randomnumber == 1) {
                stack1.push(stack2.pop());
                stack1.push(stack3.pop());

            } else if (randomnumber == 2) {
                stack2.push(stack1.pop());
                stack2.push(stack3.pop());

            } else {
                stack3.push(stack1.pop());
                stack3.push(stack2.pop());

            }
        }
        //Interpolação de string
        System.out.printf("%-10s%-10s%-10s\n", "Pilha 1", "Pilha 2", "Pilha 3");
        String stack1Number, stack2Number, stack3Number;
        while (!stack1.isEmpty() || !stack2.isEmpty() || !stack3.isEmpty()) {
            //Utilizando operador ternário.
            stack1Number = stack1.isEmpty() ? " " : Integer.toString(stack1.pop());
            stack2Number = stack2.isEmpty() ? " " : Integer.toString(stack2.pop());
            stack3Number = stack3.isEmpty() ? " " : Integer.toString(stack3.pop());
            System.out.printf("%-10s%-10s%-10s\n", stack1Number, stack2Number, stack3Number);
        } 
    }

}
