package brocode.OOP;

public class Main14 {
    static void main(String[] args) {
//        They help protect object data and add rules for accessing or modifying them.
//        GETTERS = Methods that make a field READABLE.
//        SETTERS = Methods that make a field WRITEABLE.

        M14Car car = new M14Car("Charger", "Yellow", 10000);

        car.setColor("Blue");
        car.setPrice(5000);

//        car.setModel("Corvette");
//        car.model = "Corvette";

        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());
    }
}
