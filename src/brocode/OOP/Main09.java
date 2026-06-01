package brocode.OOP;

public class Main09 {
    static void main(String[] args) {
//        tostring() = Method inherited from the Object class.
//        Used to return a string representation of an object.
//                By default, it returns a hash code as a unique identifier.
//                It can be overridden to provide meaningful details.
        M09Car car1 = new M09Car("Tesla", "X", 2025, "Black");
        M09Car car2 = new M09Car("Audi", "R8", 2015, "Gray");

        System.out.println(car1);
        System.out.println(car2);
//        System.out.println(car.color + " " + car.year + " " + car.make + " " + car.model);
    }
}
