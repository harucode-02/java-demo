package brocode.OOP;

public class Main10 {
    static void main(String[] args) {
        // abstract = Used to define abstract classes and methods.
        //            Abstraction is the process of hiding implementation details
        //            and showing only the essential features;
        //            Abstract classes CAN'T be instantiated directly
        //            Can contain 'abstract' methods (which must be implemented)
        //            Can contain 'concrete' methods (which are inherited)

        M10Circle circle = new M10Circle(3);
        M10Triangle triangle = new M10Triangle(4, 5);
        M10Rectangle rectangle = new M10Rectangle(6, 7);

//        circle.display();
//        triangle.display();
//        rectangle.display();

        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());
    }
}
