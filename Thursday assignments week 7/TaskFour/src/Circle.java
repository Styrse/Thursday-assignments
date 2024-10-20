//4. b
public class Circle implements Shape {

    private double radius;

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return Math.PI*Math.pow(radius, 2);
    }
}
