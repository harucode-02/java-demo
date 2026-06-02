package brocode.OOP;

public class M07Student extends M07Person {

    double gpa;

    M07Student(String first, String last, double gpa) {
        super(first, last);
        this.gpa = gpa;
    }

    void showGPA() {
        System.out.println(this.first + "'s GPA is: " + this.gpa);
    }
}
