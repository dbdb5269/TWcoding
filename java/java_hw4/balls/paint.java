import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by dubo on 16/6/17.
 */
public class paint extends JPanel implements Runnable{
    Timer timer=new Timer();
    ArrayList<Ball> Boucingballs = new ArrayList<Ball>();
    paint(ArrayList<Ball> ball)
    {
        this.Boucingballs = ball;
    }
    @Override
    public void paint(Graphics g)
    {
        super.paint(g);

        for(int i = 0; i < Boucingballs.size(); i++)
        {
            g.setColor(Boucingballs.get(i).color);
            g.fillOval(Boucingballs.get(i).x, Boucingballs.get(i).y, 30, 30);
        }
    }
    public void run(){
        this.timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override

            public void run() {
                    repaint();

            }
        }, 0, 60);
    }
}
