package brocode.basics;
import java.util.Random;

public class RandomNumbers {
    static void main() {
        Random random = new Random();

        boolean isHeads;

        isHeads = random.nextBoolean();

        if(isHeads){
            System.out.println("HEADS!");
        }
        else{
            System.out.println("TAILS!");
        }

//      System.out.println(isHeads);

/*
        double number;

        number = random.nextDouble();

        System.out.println(number);

*/

/*
        int number1;
        int number2;
        int number3;

        number1 = random.nextInt(1, 101);
        number2 = random.nextInt(1, 101);
        number3 = random.nextInt(1, 101);

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

*/
    }
}
