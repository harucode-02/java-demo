package brocode.OOP;

public class M10Triangle extends M10Shape{

    double base;
    double height;

    M10Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    double area(){
        return 0.5 * base * height;
    }
}
