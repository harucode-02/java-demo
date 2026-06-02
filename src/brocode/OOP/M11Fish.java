package brocode.OOP;

public class M11Fish implements M11Prey, M11Predator {

    @Override
    public void flee(){
        System.out.println("*The fish is swimming away*");
    }

    @Override
    public void hunt(){
        System.out.println("*The fish is hunting*");
    }
}
