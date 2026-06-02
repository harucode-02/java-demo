package brocode.OOP;

public class Main12 {
    static void main(String[] args) {
//        Polymorphism = "POLY" = "MANY"
//                       "MORPH" = "SHAPE"
//                        Objects can identify as other objects.
//                        Objects can be treated as objects of a common superclass.
        M12Car car = new M12Car();
        M12Bike bike = new M12Bike();
        M12Boat boat = new M12Boat();

//        M12Vehicle[] vehicles = {car, bike, boat};
        M12Vehicle02[] vehicles = {car, bike, boat};

//        for(M12Vehicle vehicle : vehicles){
//            vehicle.go();
//        }

        for(M12Vehicle02 vehicle : vehicles){
            vehicle.go();
        }


//        car.go();
//        bike.go();
//        boat.go();
    }
}
