import java.util.List;

/**
 * Created by proshad on 11/14/16.
 */
public class RectangleDecorator extends ShapeDecorator {
    public RectangleDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public boolean validate() {
        boolean isValid = false;
        List<Point> points = this.shape.getPoints();
        if (points.size()==4){
            double width = calculateLength(points.get(0).getX(),points.get(3).getX(),points.get(0).getY(),points.get(3).getY());
            double height = calculateLength(points.get(0).getX(),points.get(1).getX(),points.get(0).getY(),points.get(1).getY());
            if (width>0 && height>0){
                isValid = true;
            }

        }else {
            System.out.println("A rectangle must have four points");
        }
        return isValid;
    }

    private double calculateLength(double x1, double x2, double y1, double y2){
        return Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
    }
}
