import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.TimerTask;
import java.util.Timer;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Drawing Arcs");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Ball Balls = new Ball();





        frame.add(Balls);

        frame.setSize(300, 400);
        frame.setVisible(true);
//        frame.setBackground(Color.white);
        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Thread thread = new Thread(Balls, "New Thread");



                thread.start();



            }
        });



    }

}
