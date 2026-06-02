package brocode.OOP;

public class M16Engine {
    String type;

    M16Engine(String type){
        this.type = type;
    }

    void start(){
        System.out.println("You start the " + this.type +  " engine");
    }
}
