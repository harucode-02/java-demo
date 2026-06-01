package brocode.OOP;

public class M10Rectangle extends M10Shape{

    double length;
    double width;

    M10Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    double area(){
        return length * width;
    }
}
