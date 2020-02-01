import javax.swing.*;

public class Displaylab6 {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(1000,1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("lab6");
        Lab6Component l6c=new Lab6Component();
        frame.add(l6c);
        frame.setVisible(true);
    }
}
