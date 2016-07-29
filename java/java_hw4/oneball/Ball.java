
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.*;
import java.util.Timer;


/**
 * Created by dubo on 16/6/15.
 */
public class Ball extends JPanel implements Runnable {
    int x=0;

    int y[]={150,200};

    int i=1;
    int c=1;
    Timer timer=new Timer();
    public Ball(){

    }
    public void paint(Graphics g){

        g.setColor(Color.red);

        g.fillOval(x, y[0], 30, 30);

    }



    public void run(){



            this.timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override

                public void run() {

                    if (i <= 27) {
                        x = x + 10;

                        repaint();
                    }
                    if (i >= 28 && i <= 55) {
                        x = x - 10;

                        repaint();
                    }

                    i = i + 1;
                    if (i == 56) {
                        i = 0;
                    }
                }
            }, 0, 60);

}






}

