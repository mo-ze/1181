import java.awt.*;

/**
 * this abstract class makes a layout for GeometricShape
 * @author mohammad
 */

public abstract class GeometricShape implements Comparable<GeometricShape>, ASCIIDrawable {

    private double x;
    private double y;
    private Color color;
    private boolean isfilled;

    /**
     * lab 6 constructor
     * @param isfilled whether the shape is filled
     * @param color color
     * @param x x coordinate
     * @param y y coordinate
     */
    public GeometricShape(boolean isfilled,Color color,double x, double y) {
        this.x=x;
        this.y=y;
        this.color=color;
        this.isfilled = isfilled;
    }

    /**
     * Strandard constructor
     * @param isfilled whether the shape is filled
     */
    public GeometricShape(boolean isfilled) {
        this.isfilled = isfilled;
        this.color= Color.black;
        this.y=0;
        this.x=0;
    }

    /**
     * default constructor
     */
    public GeometricShape() {
        this.isfilled=false;
        this.color= Color.black;
        this.y=0;
        this.x=0;
    }

    /**
     * geting X coordinate
     */
    public double getX() {
        return x;
    }

    /**
     * setting x coordinate
     * @param x
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * geting y coordinate
     */
    public double getY() {
        return y;
    }

    /**
     * setting y-coordinate
     * @param y  y-coordinate
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * geting color property
     */
    public Color getColor() {
        return color;
    }

    /**
     * setting color property
     * @param color color property
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * geting isfilled property
     */
    public boolean getIsfilled() {
        return this.isfilled;
    }

    /**
     * setting isfilled property
     * @param b true for filled false otherwise
     */
    public void setIsfilled(boolean b) {
        this.isfilled = b;
    }

    /**
     * compareTo method compare the area
     * @param that the other shape
     * @return 1 if this greater than  that; 0 if equal; -1 otherwise
     */
    public int compareTo(GeometricShape that) {
        if (this.getarea() > that.getarea()) {
            return 1;
        } else if (this.getarea() == that.getarea()) {
            return 0;
        } else {
            return -1;
        }
    }

    /**
         * abstract method for getting area tobe implemented
     */
    abstract double getarea();
    /**
     * abstract method for getting Perimeter tobe implemented
     */
    abstract double getPerimeter();

}
