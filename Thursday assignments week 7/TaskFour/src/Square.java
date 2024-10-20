//4. b
public class Square implements Shape {

    private double lenght;

    public Square(double lenght){
        this.lenght = lenght;
    }

    @Override
    public double getArea(){
        return lenght*lenght;
    }
}
