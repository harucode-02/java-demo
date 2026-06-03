package brocode.OOP;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main27 {
    static void main(String[] args) {

        // Java COUNTDOWN TIMER PROGRAM

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter # of seconds to coundown from: ");
        int response = scanner.nextInt();

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            int count = response;
//            int count = 5;

            @Override
            public void run() {
                System.out.println(count);
                count--;
                if (count < 0) {
                    System.out.println("HAPPY NEW YEAR!");
                    timer.cancel();
                }
            }
        };

        timer.scheduleAtFixedRate(task, 0, 1000); //(task, delay, period)

        scanner.close();
    }
}
