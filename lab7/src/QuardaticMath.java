public class QuardaticMath {

    /**
     * quardatic equation solver
     * in ax^2+bx+c
     * @param a a
     * @param b b
     * @param c c
     * @return the answer if no answer returns empty array
     */

    public static double[] solve(Double a, Double b, Double c) {
        double x1, x2, x3, y, z;
        y = Math.pow(b, 2) - 4 * a * c;
        z = Math.sqrt(y);
        x1 = myround(((-b + z) / (2 * a)), 2);
        x2 = myround(((-b - z) / (2 * a)), 2);
        x3 = myround(((-b) / (2 * a)), 2);

        if (z > 0) {
            return new double[]{x1, x2};
        } else if (z == 0) {
            return new double[]{x3};
        } else {
            return new double[]{};
        }
    }

    /**
     * rounds a double to dp
     * @param val double
     * @param dp the number of dp you need
     * @return the answer
     */
    public static double myround(double val, int dp) {
        double scale = Math.pow(10, dp);
        return Math.round(val * scale) / scale;
    }
}


