import java.util.ArrayList;
import java.util.List;

/**
 * Created by proshad on 11/14/16.
 */
public abstract class Shape {
    protected List<Point> points = new ArrayList<Point>();
    protected String shapeName = "Unknown Shape";

    public Shape(){

    }
    public Shape(List<Point> points){
        this.points = points;
    }
    public List<Point> getPoints(){
        return points;
    }
    public String getShapeName(){
        return shapeName;
    }

    public abstract void draw();

}
