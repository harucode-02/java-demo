package brocode.OOP;

public class M16Car {

    String model;
    int year;
    M16Engine engine;

    M16Car(String model, int year, String engineType){
        this.model = model;
        this.year = year;
        this.engine = new M16Engine(engineType);
    }

    void start(){
        this.engine.start();
        System.out.println("The " + this.model + " is running");
    }
}
