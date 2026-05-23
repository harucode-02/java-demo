package brocode.basics;

// 🟩 variable = a reusable container for a value
//              a variable behaves as if it was the value it contains

// 🟥 Primitive = simple value stored directly in memory (stack)
// 🟦 Reference = memory address (stack) that points to the (heap)

// 🟥 Primitive vs 🟦 Reference
// ---------------------------
// int             string
// double          array
// char            object
// boolean

// 2 Steps to creating a variable
//---------------------------------
// 1. declaration
// 2. assignment

public class Variables {
    static void main() {
        int age = 30;
        int year = 2025;
        int quantity = 1;

        double price = 19999.99;
        double gpa = 3.5;
        double temperature = -12.5;

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        boolean isStudent = true;
        boolean forSale = true  ;
        boolean isOnline = true;

        String name = "Bro Code";
        String food = "pizza";
        String email = "fake123@gmail.com";
        String car = "Mustang";
        String color = "red";

        if(forSale){
            System.out.println("There is a " + car + " for sale");
        }
        else{
            System.out.println("There is a " + car + " for sale");
        }
//        System.out.println("Your choice is a " + color + " " + year + " " + car);
//        System.out.println("The price is: " + currency + price);
//        System.out.println("Hello " + name);
//        System.out.println("You are " + age + " years old");
//        System.out.println("Your GPA is: " + gpa);
//        System.out.println("Your average letter grade is: " + grade);
//        System.out.println("Your email is " + email);
//        System.out.println("Your favorite food is: " + food);
//        System.out.println("Hello " + name);
//        if(isStudent){
//            System.out.println("You are a student!");
//        }
//        else{
//            System.out.println("You are NOT a student!");
//        }
//        System.out.println(forSale);
//        System.out.println(currency);
//        System.out.println("$" + price);
//        System.out.println("The year is " + year);
//        System.out.println(age);
    }
}
