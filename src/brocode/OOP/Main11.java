package brocode.OOP;

public class Main11 {
    static void main(String[] args) {
//        Interface = A blueprint for a class that specifies a set of abstract methods
//                    that implementing classes MUST define.
//                    Supports multiple inheritance-like behavior.

        M11Rabbit rabbit = new M11Rabbit();
        M11Hawk hawk = new M11Hawk();
        M11Fish fish = new M11Fish();

//        rabbit.flee();
//        hawk.hunt();
        fish.flee();
        fish.hunt();
    }
}
