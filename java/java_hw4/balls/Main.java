import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

public  class Main {

    public static void main(String[] args) {
        ArrayList<Ball> Boucingballs = new ArrayList<Ball>();
        JFrame frame = new JFrame("dubo_balls");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Random random = new Random();
        paint paint = new paint(Boucingballs);
        frame.add(paint);
        Thread thread = new Thread(paint);
        thread.start();
        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(Boucingballs.size() > 20) return;
                Ball balls = new Ball(0,random.nextInt(350) % (350 - 30 + 1) + 30,0,Ballcolor());
                Boucingballs.add(balls);
                new Thread(balls).start();
                frame.add(balls);

                }

        });
        frame.setSize(300, 420);
        frame.setVisible(true);
    }
    public static Color Ballcolor(){
        int rgb=new Random().nextInt();
        return new Color(rgb);
    }
}
