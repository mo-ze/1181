import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 {

    private JButton button1;
    private JPanel jPanel;
    private JTextField txt;
    private JRadioButton inputbox;
    private JRadioButton confirm;
    private JRadioButton messageDialog;

    public form1() {

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String msg=txt.getText();
    if (inputbox.isSelected())
                JOptionPane.showInputDialog(null  , msg);
    else if (confirm.isSelected())
        JOptionPane.showConfirmDialog(null  , msg);
    else   JOptionPane.showMessageDialog(null  , msg);
            }
        });
    }

    public static void main(String[] args) {
        JFrame jFrame=new JFrame("form1");
        jFrame.setContentPane(new form1().jPanel);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);
    }
}
