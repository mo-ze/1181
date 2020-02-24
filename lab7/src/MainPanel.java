import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * main panel the panel on the frame
 * @author mohammad
 */
public class MainPanel extends JPanel {

    private JLabel ans1, ans2, status;
    private JTextField tb1, tb2, tb3;
    private JLabel first, second;
    private JButton compute;

    /**
     * create the main panel
     */

    public MainPanel() {
        setLayout(new GridLayout(2, 1));
        TitledBorder thisBorder = BorderFactory.createTitledBorder
                ("Quadratic Equation Root solver");
        thisBorder.setTitleJustification(TitledBorder.CENTER);
        setBorder(thisBorder);

//        central panel
        JPanel cp = new JPanel();

        Border b = BorderFactory.createLineBorder(Color.black, 1);
        Border n = BorderFactory.createMatteBorder(0, 1, 1, 1, Color.BLACK);

        JLabel label1 = new JLabel("Answer1 :");
        JLabel label2 = new JLabel("Answer2 :");
        JLabel label3 = new JLabel("Status :");


        ans1 = new JLabel();
        ans2 = new JLabel();
        status = new JLabel();
        ans1.setBorder(b);
        ans2.setBorder(n);
        status.setBorder(n);
        ans1.setText("--");
        ans2.setText("--");
        status.setText("Waiting for Values ");

        cp.setLayout(new GridLayout(3, 2));
        TitledBorder CBorder = BorderFactory.createTitledBorder("results");
        CBorder.setTitleJustification(TitledBorder.CENTER);
        cp.setBorder(CBorder);
        cp.add(label1);
        cp.add(ans1);
        cp.add(label2);
        cp.add(ans2);
        cp.add(label3);
        cp.add(status);

        add(cp);


//        bottom panel
        JPanel bp = new JPanel();

        first = new JLabel("X^2  +");
        second = new JLabel("X  +");
        compute = new JButton("compute");
        tb1 = new JTextField("", 3);
        tb2 = new JTextField("", 3);
        tb3 = new JTextField("", 3);
        TitledBorder bottomBorder = BorderFactory.createTitledBorder("Enter Coefficients");
        bottomBorder.setTitleJustification(TitledBorder.CENTER);
        bp.setBorder(bottomBorder);
        bp.add(tb1);
        bp.add(first);
        bp.add(tb2);
        bp.add(second);
        bp.add(tb3);
        bp.add(compute);
        add(bp);

        setPreferredSize(new Dimension(400, 200));
        compute.addActionListener(new Domath());
        tb3.addActionListener(new Domath());
    }

    /**
     * action Listener for the compute button and the last textbox
     * @author mohammad
     */
    private class Domath implements ActionListener {
        /**
         * action Performed method
         * @param e event
         */
        public void actionPerformed(ActionEvent e) {
            status.setText("waiting For Value");
            ans1.setText("--");
            ans2.setText("--");
            try {
                double a = Double.parseDouble(tb1.getText());
                double b = Double.parseDouble(tb2.getText());
                double c = Double.parseDouble(tb3.getText());
//            todo  set the initial values as 0?

                System.out.println(tb3.getText());
                double[] res = QuardaticMath.solve(a, b, c);
                if (a == 0) {
//                non-zero value must be selected
                    status.setText("non-zero value must be selected");
                } else if (res.length == 2) {
//                double root
                    ans1.setText(res[0] + "");
                    ans2.setText(res[1] + "");
                    status.setText("double roots");

                } else if (res.length == 1) {
//                single root
                    ans1.setText(res[0] + "");
                    status.setText("single root");
                } else {
                    status.setText("no real roots");


                }
            } catch (Exception Ex) {
//                nonnumeric value
                status.setText("non-numeric value");

            }
        }

    }
}