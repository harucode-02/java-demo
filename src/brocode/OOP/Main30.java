package brocode.OOP;

import java.util.Scanner;

public class Main30 {
    static void main(String[] args) {

//        Enums = (Enumerations) A special kind of class that
//                represents a fixed set of constants.
//                They improve code readability and are easy to maintain.
//                More efficient with switches rather than comparing Strings.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day of the week: ");
        String response = scanner.nextLine().toUpperCase();

        try{
            M30Day day = M30Day.valueOf(response);

            switch (day){
                case MONDAY,
                     TUESDAY,
                     WEDNESDAY,
                     THURSDAY,
                     FRIDAY -> System.out.println("It is a weekday");
                case SATURDAY,
                     SUNDAY,
                     PIZZADAY-> System.out.println("It is the weekend");
            }
        }
        catch (IllegalArgumentException e){
            System.out.println("Please enter a valid day");
        }

//        M30Day day = M30Day.valueOf(response);
//
////            M30Day day = M30Day.WEDNESDAY;
//
//            switch (day){
//                case MONDAY,
//                     TUESDAY,
//                     WEDNESDAY,
//                     THURSDAY,
//                     FRIDAY -> System.out.println("It is a weekday");
//                case SATURDAY, SUNDAY-> System.out.println("It is the weekend");
//            }
//        System.out.println(day);
//        System.out.println(day.getDayNumber());
        scanner.close();
    }
}
