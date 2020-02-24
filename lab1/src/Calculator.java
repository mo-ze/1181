import java.util.Arrays;

/**
 * A simple class that contains many common methods used for performing
 * various computations. These methods may or may not be correct. We
 * should add a test class to check the validity of these methods.
 *
 * @author Mohammad Zafar
 */
public class Calculator {
    /**
     * calculate the remainder of a/ b
     *
     * @param a the numerator
     * @param b the denominator
     * @return the value of the remainder.
     * the remainder cannot be negative so we will take the absolute value of negative remainder
     */
    public static int remainder(int a, int b) {
        int r = a % b;
        return Math.abs(r);
    }

    /**
     * adds two number
     *
     * @param a the first number
     * @param b the second number
     * @return the Sum
     */
    public static double add(double a, double b) {
        return a + b;
    }

    /**
     * muliply two numbers
     *
     * @param a the first number
     * @param b the second number
     * @return the answer of multiplication
     */
    public static double multiply(double a, double b) {
        return a * b;
    }

    /**
     * subtract one number (b) from another number (a)
     *
     * @param a the first number
     * @param b the second number
     * @return the answer of subtraction
     */

    public static double subtract(double a, double b) {
        return a - b;
    }

    /**
     * devide b by a
     *
     * @param a the numerator
     * @param b the denominator
     * @return the value of the answer
     */
    public static double divide(double a, double b) {
        return a / b;
    }


    /**
     * average from a list of numbers
     * if values is empty or null  then it will return 0
     *
     * @param values list of numbers
     * @return the average of the list
     */
    public static double average(double... values) {
        if (values == null) {
            return 0;
        } else if (values.length == 0) {
            return 0;
        } else {
            double sum = 0;
            for (double n : values) {
                sum += n;
            }
            return sum / values.length;
        }
    }

    /**
     * Calculates the standard deviation of the list of numbers
     * if values is empty or null  then it will return 0
     *
     * @param values list of numbers
     * @return standard deviation
     */
    public static double standardDeviation(double... values) {
        if (values == null) {
            return 0;
        } else if (values.length == 0) {
            return 0;
        } else {

            double average = average(values);
            double meanSquaredDiff = 0;
            for (double n : values) {
                meanSquaredDiff += Math.pow((n - average), 2);
            }

            return Math.sqrt(meanSquaredDiff / (values.length));

        }
    }


    /**
     * calculate arithmetic median
     * if values is empty or null  then it will return 0
     *
     * @param values list of number
     * @return median
     */

    // calculate arithmetic median the median of a finite list of numbers can be found
    // by arranging all the numbers from smallest to greatest.
    // If there is an odd number of numbers, the middle one is
    // picked. If there is an even number of observations, then
    // there is no single middle value; the median is then usually
    // defined to be the mean of the two middle values
    public static double median(double... values) {
        if (values == null) {
            return 0;
        } else if (values.length == 0) {
            return 0;
        } else {
            Arrays.sort(values);
            if (values.length % 2 != 0) {
                return values[values.length / 2];
            } else {
                double p = values[values.length / 2];
                double m = values[(values.length / 2) - 1];
                return (p + m) / 2;
            }
        }
    }

    /**
     * find the maximum value of the list
     * if values is empty or null  then it will return 0
     *
     * @param values list of number
     * @return the maximum
     */
    public static double max(double... values) {
        double max = 0;
        if (values == null) {
            return 0;
        } else if (values.length == 0) {
            return 0;
        } else {
            max = values[0];
            for (int i = 1; i < values.length; i++) {
                if (values[i] > max)
                    max = values[i];
            }
        }
        return max;
    }


    /**
     * find the minimum in the list
     * if values is empty or null  then it will return 0
     *
     * @param values list of number
     * @return the minimum
     */

    public static double min(double... values) {
        double min = 0;
        if (values == null) {
            return 0;
        } else if (values.length == 0) {
            return 0;
        } else {

            min = values[0];
            for (int i = 1; i < values.length; i++) {
                if (values[i] < min)
                    min = values[i];
            }
        }
        return min;
    }

}
