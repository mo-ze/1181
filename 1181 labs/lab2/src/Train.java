import java.util.Arrays;

public class Train {

    private String name = "";
    private int nolocomotive = 0;
    private int[] cars = new int[]{};

    /**
     * contructor method that is used to build a train.
     *
     * @param name         name of the train
     * @param nolocomotive the number of locomotive the train has.
     */

    public Train(String name, int nolocomotive) {
        this.name = name;
        this.nolocomotive = nolocomotive;

    }

    // getters

    /**
     * returns the name of the the train
     *
     * @return the name of this train
     */
    public String getName() {

        return this.name;
    }

    /**
     * change the name of train
     *
     * @return void
     */
    public void setName(String name) {

        this.name = name;
    }

//    setters

    /**
     * get the number of locomotive a train can have
     *
     * @return number of locomotive
     */

    public int getNolocomotive() {

        return nolocomotive;
    }

    /**
     * change the number of locomotives
     *
     * @return void
     */
    public void setNoLocomotive(int nolocomotive) {

        this.nolocomotive = nolocomotive;
    }

    /**
     * get the cars array
     *
     * @return cars array
     */
    public int[] getCars() {

        if (this.cars == null) {
            return null;
        } else {
            return Arrays.copyOf(this.cars, this.cars.length);
        }
    }

    /**
     * convert the cars to string.
     *
     * @return string of cars
     */
    //The getCars() method is being used here So if this is working correctly
    //i know getCars() is also working
    public String getCarsAsString() {

        return Arrays.toString(getCars());
    }


    /**
     * getting the numbers of cars
     *
     * @return Number of Cars
     */
    public int getNumberofCars() {

        return this.cars.length;
    }

    /**
     * sums up the car's weight
     *
     * @return sum
     */

    public int getTotalWeightOfCars() {
        int sum = 0;
        for (int n : this.cars) {
            sum += n;
        }
        return sum;
    }

    /**
     * to string method converts object to  a string!!
     *
     * @return object as a string!!
     */
    public String toString() {
        String result =
                "Name:" + this.name + "\n" +
                        "Locomotive" + this.nolocomotive + "\n" +
                        "Cars" + this.getCarsAsString();
        return result;

    }

    /**
     * maximum possible speed for the train
     * if the max speed is less than 0 returns -1
     *
     * @return max speed
     */
    public int maxSpeed() {
        if (this.getCars() == null) {
            return this.nolocomotive * 50;
        } else {
            int result = this.nolocomotive * 50 - getTotalWeightOfCars();
            if (result > 0) {
                return result;
            } else return -1;
        }
    }

    /**
     * remove all cars
     *
     * @return void
     */
    public void removeAllCars() {

        this.cars = new int[]{};
    }

    /**
     * add cars in the trains
     *
     * @param weights (cars)
     */
    public void addCars(int... weights) {
        if (weights != null) {


            int[] temp = new int[this.cars.length + weights.length];
            if (this.cars.length != 0) {
                for (int i = 0; i < this.cars.length; i++) {
                    temp[i] = this.cars[i];
                }
            }
            for (int i = 0; i < weights.length; i++) {
                temp[i + this.cars.length] = weights[i];
            }
            this.cars = temp;
            temp = null;
        }
    }

    /**
     * merges 2 train
     *
     * @param t1 train will lose all its cars and locomotive at the end.
     *           add the current train will get all the properties of t1
     */
    public void mergeTrains(Train t1) {

        this.nolocomotive += t1.nolocomotive;
        this.addCars(t1.getCars());
        t1.setNoLocomotive(0);
        t1.removeAllCars();
    }


}
