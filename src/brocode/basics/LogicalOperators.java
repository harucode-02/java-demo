package brocode.basics;

import java.util.Scanner;

public class LogicalOperators {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
         && == AND
         || == OR
         ! == NOT
        */

        // username must be between 4-12 characters
        // username must not contain spaces or underscores

        String username;

        System.out.print("Enter your new username: ");
        username = scanner.nextLine();

        if (username.length() < 4 || username.length() > 12) {
            System.out.println("Username must be between 4-12 characters");
        } else if (username.contains(" ") || username.contains("_")) {
            System.out.println("Username must not contain spaces or underscores");
        } else {
            System.out.println("Welcome " + username);
        }

        scanner.close();
//        double temp = 35;
//        boolean isSunny = true;
//
//        if(temp <= 30 && temp >= 0 && isSunny){
//            System.out.println("The weather is GOOD 😊");
//            System.out.println("It is SUNNY outside ☀️");
//        }
//        else if(temp <= 30 && temp >= 0 && !isSunny){
//            System.out.println("The weather is GOOD 😊");
//            System.out.println("It is CLOUDY outside ☁️");
//        }
//        else if (temp > 30 || temp < 0){
//            System.out.println("The weather is bad 🥲");
//        }
    }
}
