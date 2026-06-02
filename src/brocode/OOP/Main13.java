package brocode.OOP;

import java.util.Scanner;

public class Main13 {
    static void main(String[] args) {
//        Runtime polymorphism = When the method that gets executed is decided
//                               at runtime based on the actual type of the object.

        Scanner scanner = new Scanner(System.in);
        M13Animal animal;
        System.out.print("Would you like a dog or a cat? (1 = dog, 2 = cat): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            animal = new M13Dog();
            animal.speak();
        } else if (choice == 2) {
            animal = new M13Cat();
            animal.speak();
        }
    }
}
