/**
 * simple rectangle class
 * @author mohammad
 */

public class Rectangle extends GeometricShape {
    private double width;
    private double height;

    /**
     * rectangle constructor
     * @param width
     * @param height
     * @param isfilled  if it filled or not
     */
    public Rectangle(double width, double height, boolean isfilled) {
        super(isfilled);
        this.width = Math.abs(width);
        this.height = Math.abs(height);

    }

    /**
     * getWidth
     * @return Width of the current rect
     */

    public double getWidth() {
        return this.width;
    }

    /**
     * setting width
     * @param width
     */
    public void setWidth(double width) {
        this.width = width;
    }
    /**
     * getting height
     */

    public double getHeight() {
        return this.height;
    }
    /**
     * setting height
     * @param height
     */

    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * converts the rect to a String and return it
     * @return String
     */
    @Override
    public String toString() {
        return "Rectangle{" + "width=" + this.width + ", height=" + this.height
                + "}";
    }

    /**
     * getting area by math formula
     */
    @Override
    public double getarea() {
        return this.height * this.width;
    }

    /**
     * getting perimeter by math formula
     */
    @Override
    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }

    /**
     * draws Rectangle by converting it to a string and returning it.
     * @return drawn object
     */
    public String drawAsACII() {
        double W = this.width;
        double H = this.height;
        String rect = "";
        for (int Hash = 0; Hash < W; Hash++) {
            rect += "#";
        }
        rect += "\n";
        if (!super.getIsfilled()) {
            for (int line = 0; line < H - 2; line++) {
                rect += "#";
                for (int space = 0; space < W - 2; space++) {
                    rect += " "; //
                }
                rect += "#\n";
            }
        } else {
            for (int line = 0; line < H - 2; line++) {
                rect += "#";
                for (int space = 0; space < W - 2; space++) {
                    rect += "#"; //
                }
                rect += "#\n";
            }
        }


        for (int star = 0; star < W; star++) {
            rect += "#"; //lastline
        }
        rect += "\n";
        return rect;
    }


}
