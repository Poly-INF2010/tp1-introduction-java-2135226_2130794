package Letter;

import Point.Point2d;
import Shape.*;

public final class LetterFactory {
    final static Double maxHeight = 150.0;
    final static Double maxWidth = maxHeight / 2.5;
    final static Double halfMaxHeight = maxHeight / 2;
    final static Double halfMaxWidth = maxWidth / 2;
    final static Double stripeThickness = maxHeight / 8;
    final static Double halfStripeThickness = stripeThickness / 4;


    /** TODO
     * Create the letter A graphically
     * @return BaseShape containing the letter A
     */
    public static BaseShape create_A()  {
        Rectangle rectangle1 = new Rectangle(halfStripeThickness, maxHeight);
        Rectangle rectangle2 = new Rectangle(halfStripeThickness, maxHeight);
        Rectangle rectangle3 = new Rectangle(stripeThickness, halfStripeThickness);


        Point2d point1 = new Point2d(-15.0, 0.0);
        Point2d point2 = new Point2d(15.0, 0.0);
        Point2d point3 = new Point2d(0.0, 0.0);

        double angle1 = Math.toRadians(8);
        double angle2 = Math.toRadians(-8);

        rectangle1.translate(rectangle1.getCoords(), point1);
        rectangle1.rotate(rectangle1.getCoords(), angle1 );
        rectangle2.translate(rectangle2.getCoords(), point2);
        rectangle2.rotate(rectangle2.getCoords(), angle2 );
        rectangle3.translate(rectangle3.getCoords(), point3);

        return rectangle1.add(rectangle2).add(rectangle3);

    }

    /** TODO
     * Create the letter B graphically
     * @return BaseShape containing the letter B
     */
    public static BaseShape create_B() {
        Ellipse ellipse1 = new Ellipse(maxWidth, halfMaxHeight);
        Ellipse ellipse2 = new Ellipse(halfMaxWidth, halfMaxHeight/2);
        Ellipse ellipse3 = new Ellipse(maxWidth, halfMaxHeight);
        Ellipse ellipse4 = new Ellipse(halfMaxWidth, halfMaxHeight/2);
        Rectangle rectangle1 = new Rectangle(stripeThickness, maxHeight);

        Point2d point1 = new Point2d(15.0, 73.0);
        Point2d point2 = new Point2d(15.0, 73.0);
        Point2d point3 = new Point2d(15.0, 0.0);
        Point2d point4 = new Point2d(15.0, 0.0);
        Point2d point5 = new Point2d(0.0, 40.0);



        ellipse1.translate(ellipse1.getCoords(), point1);
        ellipse2.translate(ellipse2.getCoords(), point2);
        ellipse3.translate(ellipse3.getCoords(), point3);
        ellipse4.translate(ellipse4.getCoords(), point4);
        rectangle1.translate(rectangle1.getCoords(), point5);



        return rectangle1.add(ellipse1.remove(ellipse2).add(ellipse3.remove(ellipse4)));
    }

    /** TODO
     * Create the letter C graphically
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {
        Ellipse ellipse1 = new Ellipse(maxWidth, maxHeight);
        Ellipse ellipse2 = new Ellipse(maxWidth, halfMaxHeight);

        Point2d point1 = new Point2d(-9.0, 0.0);
        Point2d point2 = new Point2d(5.0, 0.0);

        ellipse1.translate(ellipse1.getCoords(), point1);
        ellipse2.translate(ellipse2.getCoords(), point2);

        return ellipse1.remove(ellipse2);
    }

    /** TODO
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {
        Rectangle rectangle1 = new Rectangle(halfStripeThickness, maxHeight);
        Rectangle rectangle2 = new Rectangle(stripeThickness, halfStripeThickness);
        Rectangle rectangle3 = new Rectangle(stripeThickness, halfStripeThickness);
        Rectangle rectangle4 = new Rectangle(stripeThickness, halfStripeThickness);

        Point2d point1 = new Point2d(15.0, 0.0);
        Point2d point2 = new Point2d(15.0, 73.0);
        Point2d point3 = new Point2d(15.0, -72.0);

        rectangle2.translate(rectangle2.getCoords(), point1);
        rectangle3.translate(rectangle3.getCoords(), point2);
        rectangle4.translate(rectangle4.getCoords(), point3);


        return ((rectangle1.add(rectangle2)).add(rectangle3)).add(rectangle4);
    }

    /** TODO
     * Create the letter H graphically
     * @return BaseShape containing the letter H
     */
    public static BaseShape create_H() {
        Rectangle rectangle1 = new Rectangle(stripeThickness, maxHeight);
        Rectangle rectangle2 = new Rectangle(stripeThickness, maxHeight);
        Rectangle rectangle3 = new Rectangle(stripeThickness, stripeThickness);

        Point2d point1 = new Point2d(-20.0, 0.0);
        Point2d point2 = new Point2d(20.0, 0.0);
        Point2d point3 = new Point2d(0.0, 0.0);

        rectangle1.translate(rectangle1.getCoords(), point1);
        rectangle2.translate(rectangle2.getCoords(), point2);
        rectangle3.translate(rectangle3.getCoords(), point3);

        return rectangle1.add(rectangle2).add(rectangle3);
    }

    /** TODO
     * Create the letter N graphically
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {
        Rectangle rectangle1 = new Rectangle(halfStripeThickness, maxHeight);
        Rectangle rectangle2 = new Rectangle(halfStripeThickness, maxHeight);
        Rectangle rectangle3 = new Rectangle(halfStripeThickness, maxHeight);


        double angle = Math.toRadians(-9);
        Point2d point1 = new Point2d(-12.0, 0.0);
        Point2d point2 = new Point2d(12.0, 0.0);

        rectangle1.translate(rectangle1.getCoords(), point1);
        rectangle2.translate(rectangle2.getCoords(), point2);
        rectangle3.rotate(rectangle3.getCoords(), angle);

        return rectangle1.add(rectangle2).add(rectangle3);
    }

    /** TODO
     * Create the letter O graphically
     * @return BaseShape containing the letter O
     */
    public static BaseShape create_O() {
        Ellipse ellipse1 = new Ellipse(maxWidth, maxHeight);
        Ellipse ellipse2 = new Ellipse(halfMaxWidth, halfMaxHeight);

        return ellipse1.remove(ellipse2);
    }

}
