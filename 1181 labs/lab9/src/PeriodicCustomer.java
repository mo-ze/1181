import java.util.Random;

public class PeriodicCustomer implements Runnable {
    private  String name;
    private  Hotel p ;

    PeriodicCustomer(Hotel hotel,String name){
        this.p=hotel;
        this.name=name;
    }

    @Override
    public void run() {
        try{
        while(true) {
            Random r = new Random();

            boolean b = r.nextBoolean();
            int first = r.nextInt((30 - 1) + 1) + 1;
            int last = r.nextInt((31 - first) + 1) + first;

            Thread.sleep(500);
            if (b) {
                if (p.requestReservation(name, first, last)) {
                    System.out.println("Reservation made: " + name + " from " + first + " through " + last);
                } else {
                    System.out.println("Reservation not made for " + name);
                }
            } else {
                if (p.cancelReservation(name)) {
                    System.out.println("Reservation canceled for " + name);
                } else {
                    System.out.println("Reservation not found for " + name);
                }
            }}} catch(InterruptedException e){
            System.out.println(name+" is shutting down");
//                break;

            }
        }

    }

