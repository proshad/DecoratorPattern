import java.util.List;

/**
 * Created by proshad on 11/14/16.
 */
public class Rectangle extends Shape {
    public Rectangle(List<Point> points) {
        super(points);
        this.shapeName = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle with co-ordinate of :");
        System.out.print(String.format("(%.2f,%.2f), (%.2f,%.2f), (%.2f,%.2f) and (%.2f,%.2f)", points.get(0).getX(), points.get(0).getY(), points.get(1).getX(), points.get(1).getY(), points.get(2).getX(), points.get(2).getY(), points.get(3).getX(), points.get(3).getY()));
        System.out.println();
    }
}
