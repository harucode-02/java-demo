package brocode.OOP;

public class Main06 {
    static void main(String[] args) {
//        Inheritance = One class inherits the attributes and methods
//                      from another class.
//                      Child <- Parent <- Grandparent
        M06Dog dog = new M06Dog();
        M06Cat cat = new M06Cat();
        M06Plant plant = new M06Plant();

//        System.out.println(dog.isAlive);
//        System.out.println(cat.isAlive);
//        System.out.println(plant.isAlive);

//        dog.eat();
//        cat.eat();

//        System.out.println(dog.lives);
//        System.out.println(cat.lives);

//        dog.speak();
//        cat.speak();

        plant.photosynthesize();
    }
}
