package brocode.basics;

import java.util.Arrays;

public class ArraysMethod {
    static void main(String[] args) {
        // array = a collection of values of the same data type
        //         * think of it as a variable that can store more than 1 value *

        String[] fruits = {"apple", "orange", "banana", "coconut"};

        //fruits[0] = "pineapple";
        //int numOfFruits = fruits.length;

        //System.out.println(numOfFruits);
        //System.out.println(fruits[0]);

//        for(int i = 0; i < fruits.length; i++){
//            System.out.print(fruits[i] + " ");
//        }

//        Arrays.sort(fruits);

        Arrays.fill(fruits, "pineapple");

        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
