//4. b
public class Square implements Shape {

    private double length;

    public Square(double length){
        this.length = length;
    }

    @Override
    public double getArea(){
        return length*length;
    }

    @Override
    public void display() {

    }
}
