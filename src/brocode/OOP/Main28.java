package brocode.OOP;

import javax.swing.*;
import java.util.ArrayList;

public class Main28 {
    static void main(String[] args) {
    /*
  • Generics = A concept where you can write a class, interface, or method
               that is compatible with different data types.
               <T> type parameter (placeholder that gets replaced with a real type)
               <String> type argument (specifies the type)
     */


        M28Product<String, Double> product1 = new M28Product<>("apple", 0.50);
        M28Product<String, Integer> product2 = new M28Product<>("ticket", 15);

        System.out.println(product2.getItem());
        System.out.println(product2.getPrice());
//        M28Product<String, Double> product = new M28Product<>("apple", 0.50);
//
//        System.out.println(product.getItem());
//        System.out.println(product.getPrice());

//        M28Box<Integer> box = new M28Box<>();
//        box.setItem(3);
//        System.out.println(box.getItem());

//        M28Box<Double> box = new M28Box<>();
//        box.setItem(3.14);
//        System.out.println(box.getItem());

//        M28Box<String> box = new M28Box<>();
//        box.setItem("banana");
//        System.out.println(box.getItem());

//        ArrayList<String> fruits = new ArrayList<>();
//
//        fruits.add("apple");
//        fruits.add("orange");
//        fruits.add("banana");

//        ArrayList<Integer> numbers = new ArrayList<>();
//
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(2);

//        ArrayList<Boolean> fruits = new ArrayList<>();
//
//        fruits.add(true);
//        fruits.add(false);
//        fruits.add(true);

    }
}
