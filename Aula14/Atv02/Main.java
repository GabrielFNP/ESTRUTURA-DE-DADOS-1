package EstruturaAtv.Aula14.Atv02;

import java.util.Deque;
import java.util.Scanner;
import java.util.ArrayDeque;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Deque<Car> parking = new ArrayDeque<>();
        Deque<Car> waitlist = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        char state;
        char list;
        char finalize;
        int board = 0;
        Car car;
        while (true) {
            System.out.println("-----------------|WELCOME TO PARKING BETWEEN SQUARES|----------------");
            System.out.println("--------------------------| Parking |------------------------------");
            System.out.print("'C' FOR ARRIVAL!------------||OR||-------- 'P' FOR DEPARTURE: ");

            state = scanner.next().charAt(0);
            System.out.println("/n--------------------------|----|------------------------------/n");

            if (state == 'C' || state == 'c') {
                if (parking.size() == 10) {
                    System.out.println("The car will wait for the space");
                    waitlist.addFirst(new Car(state, board));
                    System.out.println("Your car is on the waiting list::" + waitlist.size());
                } else {
                    System.out.print("license plate: ");
                    board = scanner.nextInt();
                    parking.addFirst(new Car(state, board));
                    

                }

            } else if (state == 'P' || state == 'p') {
                System.out.print("license plate: ");
                // c (3) a(1) b (2) -
                int x;
                board = scanner.nextInt(); // 1
                while ((car = parking.removeLast()).board != board) {
                    
                    parking.addFirst(car);
                    Car.incrementMovement();

                }
                Car.incrementMovement();
                System.out.println("Vehicle removed, total movements::" + Car.movements);
                if (!waitlist.isEmpty()) {

                    System.out.println("waiting list vacancy available ");
                    System.out.print("'C' FOR ARRIVAL!------------||OR||-------- 'P' FOR DEPARTURE: ");
                    list = scanner.next().charAt(0);
                    if (list == 'C') {
                        parking.addFirst(waitlist.removeLast());
                    } else {
                        waitlist.removeFirst();
                    }

                }
                
            } else {
                System.out.println("Invalid option");

            }
            System.out.println("Cars:::");

            System.out.print("'F' FOR finish!");

            finalize = scanner.next().charAt(0);
            if(finalize =='F'){
                break;
            }

        }

        scanner.close();
    }

    
}
