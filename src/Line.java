import java.util.List;

/**
 * Created by proshad on 11/14/16.
 */
public class Line extends Shape {
    public Line(List<Point> points) {
        super(points);
        this.shapeName = "Line";
    }

    @Override
    public void draw() {
        System.out.println("Drawing a line with co-ordinate of :");
        System.out.print(String.format("(%.2f,%.2f) and (%.2f,%.2f)", points.get(0).getX(), points.get(0).getY(), points.get(1).getX(), points.get(1).getY()));
        System.out.println();
    }
}
