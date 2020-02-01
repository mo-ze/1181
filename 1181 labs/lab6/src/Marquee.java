import java.awt.*;
import java.awt.geom.Ellipse2D;

/**
 * marquee class that is text inside a shape
 * @author mohammad
 */

public class Marquee implements ASCIIDrawable {
    private String text;
    private double x;
    private double y;
    private Color color;

    /**
     * Create a Marquee
     * @param text
     *
     */

    public Marquee(String text,double x,double y,Color color) {
        this.text = text;
        this.x=x;
        this.y=y;
        this.color=color;

    }

    /**
     * Create a Marquee
     * @param text
     */
    public Marquee(String text) {
        this.text = text;
        x=0;
        y=0;
        color=Color.black;
    }
    /**
     * gets X
     * @return X
     */
    public double getX() {
        return x;
    }
    /**
     * marquee set X
     * @param x
     */
    public void setX(double x) {
        this.x = x;
    }
    /**
     * gets Y
     * @return Y
     */
    public double getY() {
        return y;
    }
    /**
     * marquee set Y
     * @param y
     */
    public void setY(double y) {
        this.y = y;
    }
    /**
     * gets color
     * @return color
     */
    public Color getColor() {
        return color;
    }
    /**
     * marquee set color
     * @param color
     */
    public void setColor(Color color) {
        this.color = color;
    }
    /**
     * gets text
     * @return text
     */
    public String getText() {
        return text;
    }
    /**
     * marquee set text
     * @param text
     */
    public void setText(String text) {
        this.text = text;
    }
    /**
     * Marquee toString
     * @return
     */

    @Override
    public String toString() {
        return "Marquee{" +
                "text= " + text  +
                ", x= " + x +
                ", y= " + y +
                ", color= " + color +
                "}";
    }
    /**
     * draws marquee by converting it to a string and returning it.
     * @return Marquee
     */

    @Override
    public String drawAsACII() {

        double W = this.text.length() + 4;
        double H = 5;
        String rect = "";
        for (int Hash = 0; Hash < W; Hash++) {
            rect += "#";
        }
        rect += "\n";

        for (int line = 0; line < H - 2; line++) {
            rect += "#";
            if (line == 1) {
                rect += " " + this.text + " ";
            } else {
                for (int space = 0; space < W - 2; space++) {
                    rect += " "; //
                }
            }

            rect += "#\n";
        }

        for (int star = 0; star < W; star++) {
            rect += "#"; //lastline
        }
        rect += "\n";
        return rect;

    }

    /**
     * Draw method that draws on canvas.
     * @param g2
     */
    public void draw(Graphics2D g2){
        g2.setFont(new Font("TimesRoman", Font.BOLD, 19));
        double W = g2.getFontMetrics().stringWidth(text)+20;
        double H =100;
        Color red=color.RED;
        Color yellow=color.YELLOW;

        Rectangle r1 = new Rectangle(W,H,false,red,x,y);
        g2.setStroke(new BasicStroke(10));
        g2.setColor(red);


        r1.draw(g2);
        g2.setColor(Color.black);
        g2.drawString(text,(int) x+10, (int) y+ (int) H/2);
        int diam =10;
        int cx= (int) (x-5);
        int cy=(int) (y-5);

        //        top
        for (int i = 0; i <W-15 ; i=i+20) {
            Ellipse2D.Double Circle = new Ellipse2D.Double(cx+i, cy, diam, diam);
            g2.setColor(Color.YELLOW);
            g2.fill( Circle );
//            stop if i=width-40


        }
        //down
        for (int i = 0; i < W-15; i=i+20) {
            Ellipse2D.Double Circle = new Ellipse2D.Double(cx+i, cy+H, diam, diam);
            g2.setColor(yellow);
            g2.fill( Circle );
        }
        //left
        for (int i = 0; i < H-15; i=i+20) {
            Ellipse2D.Double Circle = new Ellipse2D.Double(cx, cy+i, diam, diam);
            g2.setColor(yellow);
            g2.fill( Circle );

        }
        //        right
        for (int i = 0; i < H-15; i=i+20) {
            Ellipse2D.Double Circle = new Ellipse2D.Double(cx+W, cy+i, diam, diam);
            g2.setColor(yellow);
            g2.fill( Circle );
        }

        Ellipse2D.Double Circle = new Ellipse2D.Double(cx+W, cy+H, diam, diam);
        g2.fill(Circle);
    }





}
