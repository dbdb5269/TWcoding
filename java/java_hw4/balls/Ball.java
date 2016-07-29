
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.*;
import java.util.Timer;


/**
 * Created by dubo on 16/6/15.
 */
public class Ball extends JPanel implements Runnable {
    Color color;
    int x,y;
    int num;
    Timer timer=new Timer();
    public Ball(int x,int y,int num,Color color){
        this.x=x;
        this.y=y;
        this.num=num;
        this.color=color;

    }

    public void run(){
        this.timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override

            public void run() {

                if (num <= 24) {
                    x = x + 10;

                    repaint();
                }
                if (num >= 25 && num <= 49) {
                    x = x - 10;

                    repaint();
                }

                num = num + 1;
                if (num== 50) {
                    num = 0;
                }
                System.out.println(x);
            }

        }, 0, 50);
    }






}

