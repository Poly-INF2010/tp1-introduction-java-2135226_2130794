package Shape;

import Point.Point2d;

import java.util.Collection;

public class Rectangle extends BaseShape {
    /**
     * Create a filled rectangle centered on (0, 0)
     * @param width Width of the rectangle
     * @param height Height of the rectangle
     */
    public Rectangle(Double width, Double height) {
        double a = width/2;
        double b = height/2;
        for(double i = -a; i <=a;  i += 0.5){
            for(double j = -b; j <= b; j += 0.5){
                add(new Point2d(i,j));
            }
        }
    }

    /**
     * Create a filled rectangle centered on (0, 0)
     * @param dimensions 2D point containing the width and height of the rectangle
     */
    public Rectangle(Point2d dimensions) {
        this(dimensions.X(), dimensions.Y());
    }

    /**
     * Create a rectangle from a given collection of Points
     * @param coords The collection of 2D points
     */
    private Rectangle(Collection<Point2d> coords) {
        new BaseShape(coords);
    }

    /**
     * @return Deep copy of the rectangle
     */
    @Override
    public Rectangle clone() {return new Rectangle(this.getCoords());}
}
