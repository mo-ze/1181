import java.io.*;
import java.net.ConnectException;
import java.net.Socket;
import java.util.Scanner;

public class Client5 {
    public static void main(String[] args) {

        final int PORT = HotelServer.PORT;
        Scanner scanner=new Scanner(System.in);
        try (Socket s = new Socket("localhost", PORT)) {
            InputStream instream = s.getInputStream();
            OutputStream outstream = s.getOutputStream() ;

            DataInputStream in = new DataInputStream(instream);
            DataOutputStream out = new DataOutputStream(outstream);

            String response = in.readUTF() ; //thank you for Connecting to the Hotel Server
            System.out.println("Receiving: " + response);
            out.writeUTF("USER".toUpperCase());
            System.out.println("Please enter your name");

            String name0=scanner.nextLine();
            out.writeUTF(name0);
            String res1 = in.readUTF() ; //hello[name]
            System.out.println("Receiving: " + res1);



            String menu="menu: \n 1. user\n 2. reserve\n 3. cancel\n 4. avail \n 5. quit";


            int n=0;

           while(n<=5) {

               System.out.println(menu);
               System.out.println("enter a number");
                n=scanner.nextInt();
               scanner.nextLine();
               String s1 = numtoStr(n).toUpperCase(); //USER
               out.writeUTF(s1);

               switch (n) {
                   case 1://user
                   System.out.println("Enter Your Name Please");
                   String name = scanner.nextLine().toLowerCase();
                   out.writeUTF(name);
                   String res = in.readUTF() + "";
                   System.out.println("\nReceiving: " + res);
                   out.flush(); //user
                       break;
                   case 2: // reserve
                       System.out.println("from");
                       int from=scanner.nextInt();
                       out.writeInt(from);
                       scanner.nextLine();
                       System.out.println("to");
                       int to =scanner.nextInt();
                       out.writeInt(to);
                       res = in.readUTF() + "";
                       System.out.println("\nReceiving: " + res);
                       out.flush();
                       break;
                   case 3: //cancel
                   case 4: //avail
                       res = in.readUTF() + "";
                       System.out.println("\nReceiving: " + res);
                       out.flush();
                       break;
                   case 5:
                       res = in.readUTF() + "";
                       System.out.println("\nReceiving: " + res);
                       out.flush(); //user
                       n++;
                       break;
               }
           }
        }
         catch (IOException e) {

            e.printStackTrace();
        }
        }

    public static String numtoStr(int number){
        switch (number){
            case 1:

                return "user".toUpperCase();
            case 2:
                return "reserve".toUpperCase();
            case 3:
                return "cancel".toUpperCase();
            case 4:
                return "avail".toUpperCase();
            case 5:
                return "quit".toUpperCase();

        }


return  "";





}}
