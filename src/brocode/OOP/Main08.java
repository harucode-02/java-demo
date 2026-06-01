package brocode.OOP;

public class Main08 {
    static void main(String[] args) {
//        Method overriding = When a subclass provides its own
//                            impLementation of a method that is already defined.
//                            Allows for code reusability and give specific implementations.
        M08Dog dog = new M08Dog();
        M08Cat cat = new M08Cat();
        M08Fish fish = new M08Fish();

        dog.move();
        cat.move();
        fish.move();
    }
}
