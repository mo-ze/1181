import java.util.Comparator;
/**
 * simple Shape comparator that implements Comparator
 * @author mohammad
 */
public class ShapeComparator implements Comparator<GeometricShape> {
    /**
     * compares the object by parameter
     * @param g1 Geometric object
     * @param that Geometric object
     * @return  1 if this greater than that; 0 if equal; -1 otherwise
     */
    public int compare(GeometricShape that, GeometricShape g1) {

        if (g1.getPerimeter() > that.getPerimeter()) {
            return 1;
        } else if (g1.getPerimeter() == that.getPerimeter()) {
            return 0;
        } else {
            return -1;
        }

    }
}
