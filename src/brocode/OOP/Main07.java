package brocode.OOP;

public class Main07 {
    static void main(String[] args) {
        // super = Refers to the parent class (subclass <- superclass)
        //         Used in constructors and method overriding
        //         Calls the parent constructor to initialize attributes

        M07Person person = new M07Person("Tom", "Riddle");
        M07Student student = new M07Student("Harry", "Potter", 3.25);
        M07Employee employee = new M07Employee("Rubeus", "Hagrid", 50000);

        employee.showSalary();

//        person.showName();
//        student.showName();

//        System.out.println(student.gpa);
//        student.showGPA();
    }
}
