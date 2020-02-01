import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class HotelServer {

    public static final int PORT = 1181;
    Hotel h = new Hotel();
    ServerSocket server;

    public static void main(String[] args) {
        (new HotelServer()).runServer();
    }

    public void runServer() {
        try {
            server = new ServerSocket(PORT);
            System.out.println("Waiting for client to connect . . . ");
            while (true) {
                Socket s = server.accept();
                System.out.println("Client connected.");
                Thread t = new Thread(new Customer(s));
                t.start();
            }
        } catch (IOException e) {
        }
    }

    public class Customer implements Runnable {
        private final Socket s;
        private String user;

        public Customer(Socket s) {
            this.s = s;
        }

        public void run() {
            try (Socket s2 = s) {

                DataInputStream in = new DataInputStream(s.getInputStream());
                DataOutputStream out = new DataOutputStream(s.getOutputStream());
                out.writeUTF("Thank you for Connecting to the Hotel Server");
                out.flush();

                if (in.readUTF().equalsIgnoreCase("USER")) {
                    this.user = in.readUTF();
                    System.out.println("User connecting: " + this.user);
                    out.writeUTF("hello " + user);
                    out.flush();
                    boolean done = false;
                while (!done) {
                    String text = in.readUTF();
                    done = text.equalsIgnoreCase("quit");
                    test(text, in, out);

                    out.flush();
                }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        public void test(String cmd, DataInputStream in, DataOutputStream out) throws IOException {




                if (this.user != null) {
                    System.out.println("user: "+cmd);
                    switch (cmd.toUpperCase()) {
                        case "USER":
                            this.user=in.readUTF();
                            System.out.println("User connecting: " + this.user);
                            out.writeUTF("hello " + user);
                            out.flush();

                        break;
                        case "RESERVE":
                            int first = in.readInt();
                            int last = in.readInt();
                            if (h.requestReservation(user, first, last)) {
                                out.writeUTF("Reservation made: " + user + " from " +
                                        first + " through " + last);
                                out.flush();
                            } else {
                                out.writeUTF("Reservation unsuccessful: " + user + " from " + first + " through " + last);
                                out.flush();
                            }
                            break;
                        case "CANCEL":
                            if (h.cancelReservation(user)) {
                                out.writeUTF("Reservations successfully canceled for " + user);
                                out.flush();
                            } else {
                                out.writeUTF("Reservations not canceled for " + user + "--> no current reservation.");
                                out.flush();
                            }
                            break;

                        case "AVAIL":
                            out.writeUTF(h.toString());
                            out.flush();
                            break;
                        case "QUIT":
                            out.writeUTF("connection closing ");
                            out.flush();
                            s.close();

                            break;

                        default:
                            out.writeUTF("Invalid command: Closing Connection"+cmd);
                            out.flush();
                            s.close();

                            break;
                    }
                }else {
                    out.writeUTF("Please identify yourself by USER [name]");
                }

            }

        }
    }



