package brocode.OOP;

public class M10Circle extends M10Shape{

    double radius;

    M10Circle(double radius){
        this.radius = radius;
    }

    @Override
    double area(){
        return Math.PI * radius * radius;
    }
}
