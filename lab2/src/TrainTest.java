import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class TrainTest {

    @Test
    void TestConstructor_Getter_And_Setter() {
//    test constructor
        Train t1 = new Train("T1", 3);
//    test getters
        assertEquals("T1", t1.getName());
        assertEquals(3, t1.getNolocomotive());
//   test setters
        t1.setName("train1");
        t1.setNoLocomotive(5);
        assertEquals("train1", t1.getName());
        assertEquals(5, t1.getNolocomotive());


    }

    @Test
    void TestAddCars_and_GetCarsAsString() {
        Train t1 = new Train("T1", 2);
        t1.addCars(12, 12);
        t1.addCars(14, 15);
        assertEquals("[12, 12, 14, 15]", t1.getCarsAsString());
    }

    @Test
    void TestToString() {

        String result = "Name:" + "t1" + "\n" +
                "Locomotive" + 3 + "\n" +
                "Cars" + "[]";
        Train t1 = new Train("t1", 3);
        assertEquals(result, t1.toString());
    }

    @Test
    void TestMaxSpeed() {
        Train t1 = new Train("t1", 3);
        t1.addCars(20, 20, 10);
        assertEquals(100, t1.maxSpeed());


        Train t2 = new Train("t2", 0);
        t2.addCars(20, 20, 10);
        assertEquals(-1, t2.maxSpeed());

        Train t3 = new Train("t3", 2);
        t3.addCars(null);
        assertEquals(100, t3.maxSpeed());

    }

    @Test
    void TestNumberofcars() {
        Train t1 = new Train("t1", 3);
        t1.addCars();
        assertEquals(0, t1.getNumberofCars());

        Train t2 = new Train("t2", 3);
        t2.addCars(10);
        assertEquals(1, t2.getNumberofCars());


    }

    @Test
    void TestTotalWeightofCars() {
        Train t1 = new Train("t1", 3);
        t1.addCars();
        assertEquals(0, t1.getTotalWeightOfCars());

        Train t2 = new Train("t2", 3);
        t2.addCars(10);
        assertEquals(10, t2.getTotalWeightOfCars());

        Train t3 = new Train("t3", 3);
        t3.addCars(10, 10, 30);
        assertEquals(50, t3.getTotalWeightOfCars());


    }

    @Test
    void TestRemoveAllCars() {
        Train t2 = new Train("t2", 2);
        t2.addCars(20, 30, 20);
        t2.removeAllCars();

        assertEquals("[]", t2.getCarsAsString());


    }

    @Test
    void TestMerge() {

        Train t1 = new Train("t1", 2);
        t1.addCars(20, 30, 20);

        Train t2 = new Train("t2", 2);
        t2.addCars(15, 50, 10);


        t1.mergeTrains(t2);
        assertEquals(4, t1.getNolocomotive());
        assertEquals(0, t2.getNolocomotive());
        assertEquals("[]", t2.getCarsAsString());

        assertEquals("[20, 30, 20, 15, 50, 10]", t1.getCarsAsString());


    }


}