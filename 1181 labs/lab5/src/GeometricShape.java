/**
 * this abstract class makes a layout for GeometricShape
 * @author mohammad
 */

public abstract class GeometricShape implements Comparable<GeometricShape>, ASCIIDrawable {

    private boolean isfilled;

    /**
     * Strandard constructor
     * @param isfilled whether the shape is filled
     */
    public GeometricShape(boolean isfilled) {
        this.isfilled = isfilled;
    }

    /**
     * default constructor
     */
    public GeometricShape() {

    }

    /**
     *
     * abstract method for getting area tobe implemented
     */
    abstract double getarea();
    /**
     *
     * abstract method for getting Perimeter tobe implemented
     */
    abstract double getPerimeter();

    /**
     *
     * geting isfilled property
     */
    public boolean getIsfilled() {
        return this.isfilled;
    }
    /**
     *
     * setting isfilled property
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
}
