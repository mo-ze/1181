import javax.swing.*;
/**
 * frame class
 * @author mohammad
 */
public class EquationSolverFrame {
    /**
     * main method
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("My Components");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        frame.add(new MainPanel());
        frame.pack();
        frame.setVisible(true);


    }

}
