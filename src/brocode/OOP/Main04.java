package brocode.OOP;

public class Main04 {
    static void main(String[] args) {
//        M04Car car1 = new M04Car("X", "Red");
//        M04Car car2 = new M04Car("Y", "Blue");
//        M04Car car3 = new M04Car("CyberTruck", "Gray");
//
//        M04Car[] cars = {car1, car2, car3};

        M04Car[] cars = {new M04Car("X", "Red"),
                         new M04Car("Y", "Blue"),
                         new M04Car("CyberTruck", "Gray")};

//        for(int i = 0; i < cars.length; i++){
//            cars[i].drive();
//        }

        for (M04Car car : cars) {
            car.color = "black";
        }

        for (M04Car car : cars) {
            car.drive();
        }
    }
}
