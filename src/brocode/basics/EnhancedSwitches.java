package brocode.basics;

import jdk.jshell.Snippet;

import java.util.Scanner;

public class EnhancedSwitches {
    static void main(String[] args) {

        //   Enhanced switch = A replacement to many else if statements
        //                      (Java14 feature)

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day of the week: ");
        String day = scanner.nextLine();

        switch (day.toLowerCase()) {
            case "monday", "tuesday", "wednesday", "thursday", "friday" ->
                    System.out.println("It is a weekday 🥱");
            case "saturday", "sunday" ->
                    System.out.println("It is the weekend 😀");
            default -> System.out.println(day + " is not a day");
        }

    }
}
