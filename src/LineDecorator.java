import java.util.List;

/**
 * Created by proshad on 11/14/16.
 */
public class LineDecorator extends ShapeDecorator {

    public LineDecorator(Shape shape){
        super(shape);
    }
    @Override
    public boolean validate() {
        boolean isValid = false;
        List<Point> points = this.shape.getPoints();
        if (points.size()==2){
            // check whether two points are in same position
            if (points.get(0).getX() != points.get(1).getX() || points.get(0).getY() != points.get(1).getY()){
                isValid = true;
            }
        }else {
            System.out.println("A line must have two points");
        }
        return isValid;
    }
}
