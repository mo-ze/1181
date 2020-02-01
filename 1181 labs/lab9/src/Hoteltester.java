public class Hoteltester {
    public static void main(String[] args) {
         Hotel p =new Hotel();


        Thread n1=new Thread(new PeriodicCustomer(p,"Alice"));

        Thread n2=new Thread(new PeriodicCustomer(p,"Ian"));

        Thread n3=new Thread(new PeriodicCustomer(p,"Bob"));
        n1.start();
        n2.start();
        n3.start();
        try {
            Thread.sleep(5000);
            n1.interrupt();
            n2.interrupt();
            n3.interrupt();
            n1.join();
            n2.join();
            n3.join();
        } catch (InterruptedException e) {

        }
//      System.out.println ( "n1"+n1.isAlive()+ "n2"+n2.isAlive()+"n3"+ n3.isAlive());
    }


}
