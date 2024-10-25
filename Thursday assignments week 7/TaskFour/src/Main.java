import processing.core.PApplet;

public class Main extends PApplet {
    public static PApplet applet;

    public void setup() {

        applet = this;

        Circle circle1 = new Circle(314.15265358);
        System.out.println(circle1.getArea());

        Square square1 = new Square(18.90);
        System.out.println(square1.getArea());

        ShapeBuilder shapeBuilder = new ShapeBuilder();
        shapeBuilder.addShape(circle1);
        shapeBuilder.addShape(square1);

        System.out.println("Total area: " + shapeBuilder.getTotalArea());

        circle1.display();
    }
    public void settings() {
        size(700, 900);
    }

    public static void main(String[] args){
        String[] appletArgs = new String[]{"Main"};
        PApplet.main(appletArgs);

    }
}