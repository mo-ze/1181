/**
 * square class to make square
 *
 */
public class Square extends Rectangle {
    /**
     * Constructor
     * @param side lenght of one side
     * @param isfilled
     */
    public Square(double side, boolean isfilled) {
        super(side, side, isfilled);
    }
    /*
    * change the side
    * @param len lenght of a side
     */


    public void setSide(double len) {
        this.setHeight(len);
        this.setWidth(len);
    }

    /*
     *  convert all to String
     * @return the string
     */
    @Override
    public String toString() {
        return "Square{ side: " + this.getWidth() + "}";
    }


}
