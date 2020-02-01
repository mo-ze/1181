package timersandGUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;

public class ExamPanel extends JPanel {
    private int current;
    private Timer t;
    public ExamPanel() {
        current = 0;


        setBackground(Color.darkGray);
        setPreferredSize(new Dimension(100,300));

         t = new Timer(1000,new TimerListener());
        t.start();

    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        Ellipse2D.Double[] circles = new Ellipse2D.Double[3];
        circles[0] = new Ellipse2D.Double(0,0,100,100);
        circles[1] = new Ellipse2D.Double(0,100,100,100);
        circles[2] = new Ellipse2D.Double(0,200,100,100);
        g2.setColor(Color.black);
        for(Ellipse2D.Double c: circles) {
            g2.draw(c);
        }
        Color[] colors = {Color.red, Color.yellow, Color.green};
        g2.setColor(colors[current]);
        g2.fill(circles[current]);
    }
    private class TimerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            current = (current + 1) % 3;
            repaint();
        }
    }
}