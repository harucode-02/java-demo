package brocode.basics;

import java.util.Scanner;

public class ShoppingCartProgram {
    static void main() {
        // SHOPPING CART PROGRAM
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();

        System.out.print("What is the price for each?: ");
        price = scanner.nextDouble();

        System.out.print("How many would you like?: ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("\nYou have bought " + quantity + " " + item + "/s");
        System.out.println("Your total is " + currency + total);
//        System.out.println(total);
//        System.out.println(quantity);
//        System.out.println(price);
//        System.out.println(item);
        scanner.close();
    }
}
