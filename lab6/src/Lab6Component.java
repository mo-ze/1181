import javax.swing.*;
import java.awt.*;

public class Lab6Component extends JComponent {

    public void paintComponent (Graphics g){
        Graphics2D g2 = (Graphics2D) g;

        Marquee m1=new Marquee("the old marquee is gone",100,200,Color.red);
        Marquee m2=new Marquee("somethingsomethingsomethingsomethingsomethingsomething", 450,200,Color.blue);
        Marquee m3=new Marquee("n", 350,200,Color.blue);

        Rectangle r1= new Rectangle(400,90,true,Color.blue,0,0);
        Rectangle r2= new Rectangle(150,50,true,Color.pink,520,0);
        Rectangle r3=new Rectangle(50,150,true,Color.CYAN,450,0);
        Rectangle r4=new Rectangle(280 , 100,true,Color.orange,700,0);

        Square s1=new Square(50,true,Color.RED,0,313);
        Square s2=new Square(100,true,Color.MAGENTA,100,313);
        Square s3=new Square(150,true,Color.BLACK, 300,313);

        s1.draw(g2);
        s2.draw(g2);
        s3.draw(g2);
        r1.draw(g2);

        r2.draw(g2);
        r3.draw(g2);
        r4.draw(g2);

        m1.draw(g2);
        m2.draw(g2);
        m3.draw(g2);



    }
}
