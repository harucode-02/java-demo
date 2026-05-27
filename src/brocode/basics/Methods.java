package brocode.basics;

import static brocode.basics.Methods.cube;

public class Methods {
    public static void main(String[] args) {

        // methods = a block of reusable code that is executed when called ()

//        String name = "Patrick";
//        int age = 38;
//        happyBirthday(name, age);

//        double result = square(3);
//        System.out.println(result);

//        System.out.println(square(3));

//        System.out.println(cube(3));

//        String fullName = getFullName("Spongebob", "Squarepants");
//        System.out.println(fullName);

        int age = 12;
        if(ageCheck(age)){
            System.out.println("You may sign up!");
        }
        else{
            System.out.println("You must be 18+ to sign up");
        }
    }

    static boolean ageCheck(int age){
        if(age >= 18){
            return true;
        }
        else{
            return false;
        }
    }
    static String getFullName(String first, String last) {
        return  first + " " + last;
    }
    static double cube(double number){
        return number * number * number;
    }
    static double square(double number){
        return number * number;
    }
    static void happyBirthday(String name, int age) {
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s!\n", name);
        System.out.printf("You are %d years old!\n", age);
        System.out.println("Happy Birthday to you!\n");
    }
}
