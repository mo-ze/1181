import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;
import java.util.Random;

/**
clicking component
no addons
@author: Mohammad Z 
 */
public class Clicker extends JPanel {


    private int radius=50;
    private Timer t;
    private int x=0-radius;
    private int y;
    private int height=500;
    private int width=500;
    private int misses=0;
    private int hits=0;
    private int movingspeed=10;
    private int mousex;
    private int mousey;

/**
construtor for the component 
 */
    public Clicker(){
       setPreferredSize(new Dimension(width, height));
       addMouseListener(new Clicklis());

       setBackground(Color.black);
       int max=height-radius;
       int min=0;
       y= (int)(Math.random() * ((max - min) + 1)) + min;
       t=new Timer(160,new TimerLis());

       t.setInitialDelay(5000);
       t.start();
        addKeyListener(new Keylis());
        addMouseMotionListener(new Mousemotion());
        setFocusable(true);

    }
/**
Keylistner listens for 1-5 and then sizes the circle Accordingly
1 is small, 5 is biggest
 */
    private class Keylis implements KeyListener{
        @Override
        public void keyTyped(KeyEvent e) {}

        @Override
        public void keyPressed(KeyEvent e) {
            int key=e.getKeyCode();

            switch (key){
                case(KeyEvent.VK_1):
                    radius=10;

                    break;
                case(KeyEvent.VK_2):
                    radius=20;
                    break;
                case(KeyEvent.VK_3):
                    radius=30;
                    break;
                case(KeyEvent.VK_4):
                    radius=40;
                    break;
                case(KeyEvent.VK_5):
                    radius=50 ;
                    break;
            }
        repaint();
        }
        @Override
        public void keyReleased(KeyEvent e) {}
    }
/** mouse listnener class when the mouse hits the circle, the circle disappears 
 */
    private class Clicklis implements MouseListener{
        @Override
        public void mouseClicked(MouseEvent e) { }
        @Override
        public void mousePressed(MouseEvent e) {

            if(e.getX()>x
                    && e.getX() < x+radius
                    && e.getY() > y
                    && e.getY() < y+radius){


                hits++;
                movingspeed+=2;

                reset();
            }
            repaint();
        }
        @Override
        public void mouseReleased(MouseEvent e) {}
        @Override
        public void mouseEntered(MouseEvent e) {}
        @Override
        public void mouseExited(MouseEvent e) {}
    }
/** Mousemotion class prints X on screen on mouse move 
 */
    private class Mousemotion implements  MouseMotionListener{
        @Override
        public void mouseDragged(MouseEvent e) { }

        @Override
        public void mouseMoved(MouseEvent e) {
            mousex=e.getX();
            mousey=e.getY();
            repaint();
        }
    }
/** timer class moves the circle per second as defined by the timer    
 */
    private class TimerLis implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {

            x+=movingspeed;


            if(x>width){
                reset();
                misses++;

            }
            repaint();

        }
    }
/**
paints the component to screen with the circle and everything 
 */
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        Graphics2D g2= (Graphics2D) g;
        g2.setColor(Color.white);
        Ellipse2D.Double circle= new Ellipse2D.Double( x, y,this.radius,this.radius);

        g2.setColor(Color.gray);
        g2.fill(circle);

        g2.setColor(Color.white);
        g2.setFont( new Font("Comic Sans MS", Font.PLAIN, 25));
        g2.drawString("hits: "+hits+" misses: "+ misses,25,40);
        g2.setColor(Color.red);
        g2.setFont( new Font("Comic Sans MS", Font.BOLD, 20));
        g2.drawString("X",mousex-5,mousey+5);
        repaint();

    }

/**
reset method brings the circle back to 0-radius and generates a random InitialDelay
*/
    public void reset(){

        x=0-radius;

        y=(int) (Math.random() * ((height-radius ) + 1));

        Random r = new Random();
        int result = r.nextInt(10000-500) + 500;

        t.setInitialDelay(result);

        t.restart();

    }




}
