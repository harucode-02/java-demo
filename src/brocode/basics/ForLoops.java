package brocode.basics;

import java.util.Scanner;

public class ForLoops {
    static void main(String[] args) throws InterruptedException {

        // for loops = execute some code a CERTAIN amount of times

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many seconds to countdown from?: ");
        int start = scanner.nextInt();

        scanner.close();

        for(int i = start; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("HAPPY NEW YEAR!");

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter how many times you want to loop: ");
//        int max = scanner.nextInt();
//
//        for(int i = 1; i <= max; i++){
//            System.out.println(i);
//        }
//
//        scanner.close();


//        for(int i = 10; i > 0; i-=3){
//            System.out.println(i);
//        }
    }
}
