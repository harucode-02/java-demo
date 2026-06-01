package brocode.OOP;

public class M07Person {

    String first;
    String last;

    M07Person(String first, String last){
        this.first = first;
        this.last = last;
    }

    void showName() {
        System.out.println(this.first + " " + this.last);
    }
}
