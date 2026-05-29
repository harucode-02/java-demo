package brocode.OOP;

public class M04Car {
    String model;
    String color;

    M04Car(String model, String color){
        this.model = model;
        this.color = color;
    }

    void drive(){
        System.out.println("You drive the " + this.color + " " + this.model);
    }
}
