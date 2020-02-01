import java.util.Arrays;

/**
 * class for testing
 */
public class FunwithShapes {

    // TODO: 10/8/19 exercise 7 : DO
    // TODO: 10/8/19 exercise 8 : DO 

    /**
     * main method
     * @param args
     */

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(10, 5, true);
        Rectangle s1 = new Square(4, true);
        Rectangle r2 = new Rectangle(5, 4, false);
        Rectangle s2 = new Square(7, false);
        Rectangle r3 = new Rectangle(5, 10, false);
        Square s3 = new Square(2, true);

        GeometricShape[] ar = new GeometricShape[]{r1, r2, r3, s1, s2, s3};
        Arrays.sort(ar);
        System.out.print("sorted by area: ");
        for (GeometricShape g : ar) {
            System.out.print(g.getarea() + " , ");
        }
        System.out.println(" ");
        GeometricShape[] r = Arrays.copyOf(ar, ar.length);

        ShapeComparator shapeComparator = new ShapeComparator();
        Arrays.sort(r, new ShapeComparator());

        System.out.print("sorted by perimeter: ");
        for (GeometricShape g : r) {
            System.out.print(g.getPerimeter() + " , ");

        }

        System.out.println("\n"+"\n"+"printing sort by area in ascending order");
        for (GeometricShape g :ar) {
            System.out.println(g.drawAsACII());
        }

        System.out.println("printing marquee \n\n");
       Marquee marq[]=new Marquee[] {
            new Marquee("the Marquee"),
            new Marquee("is here "),
            new Marquee("old joe's pizza place")
        };
        for (Marquee m:marq) {
            System.out.println(m.drawAsACII());
        }
        
    }


}



