import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
/**
frame class builts the frame for clicker class
@author: Mohammad Z
 */
public class frame {
    public static void main(String[] args) {

            JFrame frame = new JFrame();
            frame.setTitle("clicking game");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            frame.add(new Clicker());
            frame.pack();
            frame.setVisible(true);
        frame.setCursor(frame.getToolkit().createCustomCursor(
                new BufferedImage(3, 3, BufferedImage.TYPE_INT_ARGB), new Point(0, 0), null));


        }
}

