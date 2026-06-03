package brocode.OOP;

public class Main25 {
    static void main(String[] args) {

//        Anonymous class = A class that doesn't have a name. Cannot be reused.
//                          Add custom behavior without having to create a new class.
//                          Often used for one time uses (TimerTask, Runnable, callbacks)

        M25Dog dog1 = new M25Dog();
        M25Dog dog2 = new M25Dog(){
            @Override
            void speak(){
                System.out.println("Scooby Doo says *Ruh Roh*");
            }
        };

//        M25TalkingDog talkingDog = new M25TalkingDog();

//        talkingDog.speak();
        dog1.speak();
        dog2.speak();
    }
}
