package EstruturaAtv.Aula13.Atv02;
import java.util.Scanner;
import java.util.Stack;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> even = new Stack<>();
        Stack<Integer> odd = new Stack<>();
        int x; 
        System.out.print("Enter random numbers:::: ");
        x = scanner.nextInt();
        while (x != 0) {
            if( x%2==0){ 
                even.push(x);
            }else odd.push(x);

            System.out.print("Enter random numbers:::: ");
            x = scanner.nextInt();
        }
        while(!even.isEmpty() && !odd.isEmpty()){
            odd.pop();
            even.pop();
        }
        if(!even.isEmpty()){
            System.out.println(" Stack EVEN has elements:!");
            System.out.println(" Stack has "+ even.size() + " elements.");
            for(Integer i: even){
                System.out.println("numbers: "+ i );
            }
        }
        if(!odd.isEmpty()){
            System.out.println(" Stack ODD has elements:!");
            System.out.println(" Stack has "+ odd.size() + " elements.");
            for(Integer i: odd){
                System.out.println("numbers: "+ i );
            } 
        }
        scanner.close();
    }
    
}
