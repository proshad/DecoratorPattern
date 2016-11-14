import java.util.List;

/**
 * Created by proshad on 11/14/16.
 */
public abstract class ShapeDecorator extends Shape {

    protected Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        if (validate()) {
            System.out.println("Great! the shape, " + this.shape.shapeName + " has passed the validation");
            this.shape.draw();
        } else {
            System.out.println("Sorry! the shape, " + this.shape.shapeName + " cannot pass validation");
        }
    }

    public abstract boolean validate();
}
