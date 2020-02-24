package GUI;


import javax.swing.*;

public class pizzarun {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("My Components");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new PizzaPanel());
        frame.pack();
        frame.setVisible(true);
    }
}
