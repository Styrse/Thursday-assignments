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

    @Override
    public void display() {
        Main.applet.ellipse(Main.applet.width/2, Main.applet.height/2, (float)this.radius, (float)this.radius);
    }
}
