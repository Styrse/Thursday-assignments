public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(9.45);
        System.out.println(circle1.getArea());

        Square square1 = new Square(18.90);
        System.out.println(square1.getArea());

        ShapeBuilder shapeBuilder = new ShapeBuilder();
        shapeBuilder.addShape(circle1);
        shapeBuilder.addShape(square1);

        System.out.println(shapeBuilder.getTotalArea());
    }
}