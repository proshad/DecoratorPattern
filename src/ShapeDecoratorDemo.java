import java.util.Arrays;

/**
 * Created by proshad on 11/14/16.
 */
public class ShapeDecoratorDemo {
    public static void main(String[] args) {

        System.out.println("*******Welcome to decorator pattern demo********");
        System.out.println("Validation for Line......");
        Shape validLineShape = new LineDecorator(new Line(Arrays.asList(new Point(3.0,4.0),new Point(5.0,6.0))));
        validLineShape.draw();

        Shape invalidLineShape = new LineDecorator(new Line(Arrays.asList(new Point(3.0,4.0),new Point(3.0,4.0))));
        invalidLineShape.draw();

        Shape invalidLineShape2 = new LineDecorator(new Line(Arrays.asList(new Point(3.0,4.0))));
        invalidLineShape2.draw();

        System.out.println("Validation for Rectangle......");
        Shape validRectangleShape = new RectangleDecorator(new Rectangle(Arrays.asList(new Point(3.0,4.0),new Point(5.0,6.0),new Point(7.0,8.0),new Point(9.0,10.0))));
        validRectangleShape.draw();

        Shape invalidRectangleShape = new RectangleDecorator(new Rectangle(Arrays.asList(new Point(3.0,4.0),new Point(5.0,6.0),new Point(7.0,8.0))));
        invalidRectangleShape.draw();


    }
}
