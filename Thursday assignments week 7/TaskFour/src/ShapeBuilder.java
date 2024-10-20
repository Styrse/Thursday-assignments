import java.util.ArrayList;

public class ShapeBuilder {

    private ArrayList<Shape> shapesList;

    ShapeBuilder(){
        this.shapesList = new ArrayList<>();
    }

    public void addShape(Shape s){
        this.shapesList.add(s);
    }

    //4. d
    public double getTotalArea(){
        double area = 0;
        for (int i = 0; i < shapesList.size(); i++){
            area += shapesList.get(i).getArea();
        }
        return area;
    }
}
