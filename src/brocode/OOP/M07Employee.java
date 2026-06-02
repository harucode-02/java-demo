package brocode.OOP;

public class M07Employee extends M07Person {

    int salary;

    M07Employee(String first, String last, int salary) {
        super(first, last);
        this.salary = salary;
    }

    void showSalary() {
        System.out.println(this.first + "'s salary is $" + this.salary);
    }
}
