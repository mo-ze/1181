import org.junit.jupiter.api.Test;

import static jdk.nashorn.internal.objects.Global.Infinity;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * A class for testing the methods of the Calculator class behave
 * as expected.
 * See: http://junit.sourceforge.net/javadoc/org/junit/Assert.html
 * For more JUnit Assertion Statements
 *
 * @author Mohammad Zafar
 */
public class TestCalculator {

    double[] a = new double[]{-2, -5, -7, 0, 4};
    double[] b = new double[]{-2, -5, -7, 1, 5, 24};
    double[] c = new double[]{-2};
    double[] d = new double[]{4.4, -2.07, -9.08, 10.45, 1.30, 7};
    double[] e = null;
    double[] f = {};

    @Test
    public void testAdd() {
        assertEquals(15, Calculator.add(10, 5));
        assertEquals(16, Calculator.add(37, -21));
        assertEquals(-110, Calculator.add(-105, -5));
        assertEquals(-37, Calculator.add(-37.5, 0.5));
    }

    @Test
    void testMultiply() {
        assertEquals(-25, Calculator.multiply(5, -5));
        assertEquals(25, Calculator.multiply(-5, -5));
        assertEquals(1, Calculator.multiply(0.5, 2));
        assertEquals(0, Calculator.multiply(5, 0));
        assertEquals(0, Calculator.multiply(0, 5));
        assertEquals(144, Calculator.multiply(12, 12));

    }

    @Test
    void testSubtract() {
        assertEquals(-5, Calculator.subtract(-5, 0));
        assertEquals(5, Calculator.subtract(0, -5));
        assertEquals(5, Calculator.subtract(10, 5));
        assertEquals(-5, Calculator.subtract(-10, -5));
        assertEquals(-15, Calculator.subtract(-10, 5));
    }

    @Test
    void testDivide() {
        assertEquals(Infinity, Calculator.divide(5, 0));
        assertEquals(1, Calculator.divide(5, 5));
        assertEquals(1, Calculator.divide(5, 5));
        assertEquals(4, Calculator.divide(12, 3));
        assertEquals(0.16666666666, Calculator.divide(-0.5, -3), 0.001);
    }

    @Test
    public void testRemainder() {
        try {
            Calculator.remainder(5, 0);
            fail("Expected an ArithmeticException ");
        } catch (ArithmeticException e) {
            assertEquals
                    ("/ by zero", e.getMessage());
        }
        assertEquals(0, Calculator.remainder(5, 5));
        assertEquals(1, Calculator.remainder(5, 2));
        assertEquals(1, Calculator.remainder(-5, -2));
        assertEquals(0, Calculator.remainder(12, 3));
        assertEquals(0, Calculator.remainder(-0, -3));
        assertEquals(1, Calculator.remainder(-5, 2));
        assertEquals(1, Calculator.remainder(5, -2));
        assertEquals(3, Calculator.remainder(3, 5));
    }

    @Test
    void testAverage() {


        assertEquals(-2, Calculator.average(a));
        assertEquals(2.6666666, Calculator.average(b), 0.0001);
        assertEquals(-2, Calculator.average(c));
        assertEquals(2, Calculator.average(d));
        assertEquals(0, Calculator.average(e));
        assertEquals(0, Calculator.average(f));

    }

    @Test
    void testStandardDeviation() {
        assertEquals(3.847077, Calculator.standardDeviation(a), 0.0001);
        assertEquals(10.306417, Calculator.standardDeviation(b), 0.0001);
        assertEquals(0, Calculator.standardDeviation(c), 0.0001);
        assertEquals(6.350640, Calculator.standardDeviation(d), 0.0001);

        assertEquals(0, Calculator.standardDeviation(e));
        assertEquals(0, Calculator.standardDeviation(f));


    }

    @Test
    void testMedian() {
        assertEquals(-2, Calculator.median(a));
        assertEquals(-0.5, Calculator.median(b));
        assertEquals(-2, Calculator.median(c));
        assertEquals(2.85, Calculator.median(d));


        assertEquals(0, Calculator.median(e));


//        f is empty array

        assertEquals(0, Calculator.median(f));


    }

    @Test
    void testMax() {
        assertEquals(4, Calculator.max(a));
        assertEquals(24, Calculator.max(b));
        assertEquals(-2, Calculator.max(c));
        assertEquals(10.45, Calculator.max(d));

        assertEquals(0, Calculator.max(e));


        assertEquals(0, Calculator.max(f));


    }

    @Test
    void testMin() {
        assertEquals(-7, Calculator.min(a));
        assertEquals(-7, Calculator.min(b));
        assertEquals(-2, Calculator.min(c));
        assertEquals(-9.08, Calculator.min(d));

        assertEquals(0, Calculator.min(e));

        assertEquals(0, Calculator.min(f));


    }
}

