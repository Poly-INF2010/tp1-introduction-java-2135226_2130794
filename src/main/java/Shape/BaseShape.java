package Shape;

import Interface.Transform;
import Point.Point2d;

import java.util.*;
import java.util.stream.Collectors;

public class BaseShape extends Transform implements Cloneable {
    protected final Collection<Point2d> coords;

//helper function to clone a list of points 
  public Collection<Point2d> cloneCoords(Collection<Point2d> coords) {
        return coords.stream().map(Point2d::clone).collect(Collectors.toList());
    }

    /**
     * Create a BaseShape with empty coordinades
     */
    public BaseShape() {
        this.coords = new ArrayList<>();
    }

    /**
     * Create a BaseShape from a collection of 2D points
     * @param coords The collection of 2D points
     */
    public BaseShape(Collection<Point2d> coords) {
        this.coords = cloneCoords(coords);
    }

    /**
     * Add a deep copy of the 2D point to the Shape
     * @param coord 2D point to add
     * @return Updated BaseShape
     */
    public BaseShape add(Point2d coord) {
        coords.add(coord.clone());
        return this;
    }

    /**
     * Add a deep copy of the 2D points of the shape to the current shape
     * @param shape Shape to add to the current shape
     * @return Updated BaseShape
     */
    public BaseShape add(BaseShape shape) {
        addAll(shape.cloneCoords());
        return this;
    }

    /**
     * Add a deep copy of the points in the collection to the shape
     * @param coords Collections of point to add
     * @return Updated BaseShape
     */
    public BaseShape addAll(Collection<Point2d> coords) {
        this.coords.addAll(cloneCoords(coords));
        return this;
    }

    /**
     * Remove the 2D point from the shape
     * @param coord Point to remove
     * @return Updated BaseShape
     */
    public BaseShape remove(Point2d coord) {
        coords.remove(coord);
        return this;
    }

    /**
     * Remove the 2D points in the shape from the current shape
     * @param shape Shape containing the points to remove
     * @return Updated BaseShape
     */
    public BaseShape remove(BaseShape shape) {
        return this.removeAll(shape.coords);
    }

    /**
     * Remove the 2D points in the collection from the current shape
     * @param coords Collection of 2D points to remove
     * @return Updated BaseShape
     */
    public BaseShape removeAll(Collection<Point2d> coords) {
        this.coords.removeAll(coords);
        return this;
    }

    /**
     *  Replace all the coords in a shape with new ones
     * @param newCoords new coords to replace the old one
     * @return Updated BaseShape
     * */
    public BaseShape replaceAll(Collection<Point2d> newCoords) {
        coords.clear();
        addAll(newCoords);
        return this;
    }

    /**
     * Return a shallow copy of the coordinates of the shape
     * @return Shallow copy of all coordinates contained by this BaseShape
     */
    public Collection<Point2d> getCoords() {
        return new ArrayList<>(coords);
    }

    /**
     * Create and return a deep copy of the coordinates of the shape
     * @return Deep copy of all coordinates contained by this BaseShape
     */
    public Collection<Point2d> cloneCoords() {
        return cloneCoords(coords);
    }


    /**
     * @return Maximum X coordinate of the shape
     */
    public Double getMaxX() {

        double maxX = -Double.MAX_VALUE;
        for (Point2d coord : coords) {
            maxX = Math.max(maxX, coord.X());
        }
        return maxX;
    }

    /**
     * @return Maximum Y coordinate of the shape
     */
    public Double getMaxY() {

        double maxY = -Double.MAX_VALUE;
        for (Point2d coord : coords) {
            maxY = Math.max(maxY, coord.Y());
        }
        return maxY;
    }

    /**
     * @return 2D Point containing the maximum X and Y coordinates of the shape
     */
    public Point2d getMaxCoord() {
        return new Point2d(getMaxX(), getMaxY());
    }

    /**
     * @return Minimum X coordinate of the shape
     */
    public Double getMinX() {

        double minX = Double.MAX_VALUE;
        for (Point2d coord : coords) {
            minX = Math.min(minX, coord.X());
        }
        return minX;
    }

    /**
     * @return Minimum Y coordinate of the shape
     */
    public Double getMinY() {

        double minY = Double.MAX_VALUE;
        for (Point2d coord : coords) {
            minY = Math.min(minY, coord.Y());
        }
        return minY;
    }

    /**
     * @return 2D point containing the minimum X and Y coordinate of the shape
     */
    public Point2d getMinCoord() {
        return new Point2d(getMinX(), getMinY());
    }

    /**
     * @return Deep copy of the current shape
     */
    public BaseShape clone() {return new BaseShape(coords);}
}
