package timersandGUI;

import javax.swing.JFrame;

public class Frame {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("My Components");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new ExamPanel());
        frame.pack();
        frame.setVisible(true);

    }

}

