import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by dubo on 16/5/17.
 */
public class ButtonFrame extends JFrame implements KeyListener {
    private  JButton plainJButton_null;
    private  JButton plainJButton;
    private  JButton plainJButton_1=new JButton("1 ");
    private  JButton plainJButton_2;
    private  JButton plainJButton_3;
    private  JButton plainJButton_4;
    private  JButton plainJButton_5;
    private  JButton plainJButton_6;
    private  JButton plainJButton_7;
    private  JButton plainJButton_8;
    private  JButton plainJButton_9;
    private  JButton plainJButton_0;
    private  JButton plainJButton_jian;
    private  JButton plainJButton_jia;
    private  JButton plainJButton_delete;
    private  JButton plainJButton_tab;
    private  JButton plainJButton_q;
    private  JButton plainJButton_w;
    private  JButton plainJButton_e;
    private  JButton plainJButton_r;
    private  JButton plainJButton_t;
    private  JButton plainJButton_y;
    private  JButton plainJButton_u;
    private  JButton plainJButton_i;
    private  JButton plainJButton_o;
    private  JButton plainJButton_p;
    private  JButton plainJButton_youkuo;
    private  JButton plainJButton_zuokuo;
    private  JButton plainJButton_fanxiegang;
    private  JButton plainJButton_cap;
    private  JButton plainJButton_a;
    private  JButton plainJButton_s;
    private  JButton plainJButton_d;
    private  JButton plainJButton_f;
    private  JButton plainJButton_g;
    private  JButton plainJButton_h;
    private  JButton plainJButton_j;
    private  JButton plainJButton_k;
    private  JButton plainJButton_l;
    private  JButton plainJButton_fenhao;
    private  JButton plainJButton_yinghao;
    private  JButton plainJButton_enter;
    private  JButton plainJButton_leftshift;
    private  JButton plainJButton_z;
    private  JButton plainJButton_x;
    private  JButton plainJButton_c;
    private  JButton plainJButton_v;
    private  JButton plainJButton_b;
    private  JButton plainJButton_n;
    private  JButton plainJButton_m;
    private  JButton plainJButton_douhao;
    private  JButton plainJButton_juhao;
    private  JButton plainJButton_xiegang;
    
    private  JButton plainJButton_kongge;
    private  JButton plainJButton_shang;
    private  JButton plainJButton_xia;
    private  JButton plainJButton_zuo;
    private  JButton plainJButton_you;
    
    private JTextField textarea;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label_TPYE;
    private JLabel error;
    private JLabel label4;
    private final String text = "TA can you give me hundred points";
    public ButtonFrame(){
        super("Typing Application");
        textarea=new JTextField();
        textarea.setPreferredSize(new Dimension(710,200));
        
        label1=new JLabel("Type some text using your keyboard. The keys you press will be highlighred and text will be displayed.");
        label2=new JLabel("Note:Clicking the buttons with your mouse wil not perform any action");
        label_TPYE=new JLabel("You show input :TA can you give me hundred points");
        error=new JLabel("0 error");
        label3=new JLabel("  ");
        label4=new JLabel("  ");
        //label3.setVisible(false);
        plainJButton_null=new JButton("");
        plainJButton=new JButton("~");
        
        textarea.addKeyListener(this);
        
        plainJButton_2=new JButton("2");
        plainJButton_3=new JButton("3");
        plainJButton_4=new JButton("4");
        plainJButton_5=new JButton("5");
        plainJButton_6=new JButton("6");
        plainJButton_7=new JButton("7");
        plainJButton_8=new JButton("8");
        plainJButton_9=new JButton("9");
        plainJButton_0=new JButton("0");
        plainJButton_jian=new JButton("-");
        plainJButton_jia=new JButton("+");
        plainJButton_delete=new JButton("Backspace");
        
        plainJButton_tab=new JButton("tab");
        plainJButton_q=new JButton("q ");
        plainJButton_w=new JButton("w ");
        plainJButton_e=new JButton("e");
        plainJButton_r=new JButton("r");
        plainJButton_t=new JButton("t");
        plainJButton_y=new JButton("y");
        plainJButton_u=new JButton("u");
        plainJButton_i=new JButton("i");
        plainJButton_o=new JButton("o");
        plainJButton_p=new JButton("p");
        plainJButton_youkuo=new JButton("[");
        plainJButton_zuokuo=new JButton("]");
        plainJButton_fanxiegang=new JButton("\\");
        plainJButton_cap=new JButton("caps");
        plainJButton_a=new JButton("a");
        plainJButton_s=new JButton("s");
        plainJButton_d=new JButton("d");
        plainJButton_f=new JButton("f");
        plainJButton_g=new JButton("g");
        plainJButton_h=new JButton("h");
        plainJButton_j=new JButton("j");
        plainJButton_k=new JButton("k");
        plainJButton_l=new JButton("l");
        plainJButton_fenhao=new JButton(";");
        plainJButton_yinghao=new JButton("'");
        plainJButton_enter=new JButton("enter");
        plainJButton_leftshift=new JButton("shift");
        plainJButton_z=new JButton("z");
        plainJButton_x=new JButton("x");
        plainJButton_c=new JButton("c");
        plainJButton_v=new JButton("v");
        plainJButton_b=new JButton("b");
        plainJButton_n=new JButton("n");
        plainJButton_m=new JButton("m");
        plainJButton_douhao=new JButton(",");
        plainJButton_juhao=new JButton(".");
        plainJButton_xiegang=new JButton("/");
        
        plainJButton_kongge=new JButton("");
        plainJButton_shang=new JButton("^");
        plainJButton_xia=new JButton("v");
        plainJButton_zuo=new JButton("<");
        plainJButton_you=new JButton(">");
        
        
        plainJButton.setPreferredSize(new Dimension(46,39));
        label1.setPreferredSize(new Dimension(600,20));
        label2.setPreferredSize(new Dimension(600,20));
        label_TPYE.setPreferredSize(new Dimension(600,20));
        error.setPreferredSize(new Dimension(600,20));
        label3.setPreferredSize(new Dimension(200,39));
        label4.setPreferredSize(new Dimension(80,39));
        plainJButton_1.setPreferredSize(new Dimension(46,39));
        plainJButton_2.setPreferredSize(new Dimension(46,39));
        plainJButton_3.setPreferredSize(new Dimension(46,39));
        plainJButton_4.setPreferredSize(new Dimension(46,39));
        plainJButton_5.setPreferredSize(new Dimension(46,39));
        plainJButton_6.setPreferredSize(new Dimension(46,39));
        plainJButton_7.setPreferredSize(new Dimension(46,39));
        plainJButton_8.setPreferredSize(new Dimension(46,39));
        plainJButton_9.setPreferredSize(new Dimension(46,39));
        plainJButton_0.setPreferredSize(new Dimension(46,39));
        plainJButton_jian.setPreferredSize(new Dimension(46,39));
        plainJButton_jia.setPreferredSize(new Dimension(46,39));
        plainJButton_delete.setPreferredSize(new Dimension(80,39));
        plainJButton_tab.setPreferredSize(new Dimension(60,39));
        plainJButton_q.setPreferredSize(new Dimension(46,39));
        plainJButton_w.setPreferredSize(new Dimension(46,39));
        plainJButton_e.setPreferredSize(new Dimension(46,39));
        plainJButton_r.setPreferredSize(new Dimension(46,39));
        plainJButton_t.setPreferredSize(new Dimension(46,39));
        plainJButton_y.setPreferredSize(new Dimension(46,39));
        plainJButton_u.setPreferredSize(new Dimension(46,39));
        plainJButton_i.setPreferredSize(new Dimension(46,39));
        plainJButton_o.setPreferredSize(new Dimension(46,39));
        plainJButton_p.setPreferredSize(new Dimension(46,39));
        plainJButton_zuokuo.setPreferredSize(new Dimension(46,39));
        plainJButton_youkuo.setPreferredSize(new Dimension(46,39));
        plainJButton_fanxiegang.setPreferredSize(new Dimension(46,39));
        plainJButton_cap.setPreferredSize(new Dimension(80,39));
        plainJButton_a.setPreferredSize(new Dimension(46,39));
        plainJButton_s.setPreferredSize(new Dimension(46,39));
        plainJButton_d.setPreferredSize(new Dimension(46,39));
        plainJButton_f.setPreferredSize(new Dimension(46,39));
        plainJButton_g.setPreferredSize(new Dimension(46,39));
        plainJButton_h.setPreferredSize(new Dimension(46,39));
        plainJButton_j.setPreferredSize(new Dimension(46,39));
        plainJButton_k.setPreferredSize(new Dimension(46,39));
        plainJButton_l.setPreferredSize(new Dimension(46,39));
        plainJButton_fenhao.setPreferredSize(new Dimension(46,39));
        plainJButton_yinghao.setPreferredSize(new Dimension(46,39));
        plainJButton_enter.setPreferredSize(new Dimension(100,39));
        plainJButton_leftshift.setPreferredSize(new Dimension(80,39));
        plainJButton_z.setPreferredSize(new Dimension(46,39));
        plainJButton_x.setPreferredSize(new Dimension(46,39));
        plainJButton_c.setPreferredSize(new Dimension(46,39));
        plainJButton_v.setPreferredSize(new Dimension(46,39));
        plainJButton_b.setPreferredSize(new Dimension(46,39));
        plainJButton_n.setPreferredSize(new Dimension(46,39));
        plainJButton_m.setPreferredSize(new Dimension(46,39));
        plainJButton_douhao.setPreferredSize(new Dimension(46,39));
        plainJButton_juhao.setPreferredSize(new Dimension(46,39));
        plainJButton_xiegang.setPreferredSize(new Dimension(46,39));
        plainJButton_shang.setPreferredSize(new Dimension(46,39));
        plainJButton_xia.setPreferredSize(new Dimension(46,39));
        plainJButton_zuo.setPreferredSize(new Dimension(46,39));
        plainJButton_you.setPreferredSize(new Dimension(46,39));
        plainJButton_kongge.setPreferredSize(new Dimension(230,39));
        plainJButton.setBackground(Color.WHITE);
        // plainJButton.setOpaque(true);
        plainJButton_1.setBackground(Color.WHITE);
        plainJButton_2.setBackground(Color.WHITE);
        plainJButton_3.setBackground(Color.WHITE);
        plainJButton_4.setBackground(Color.WHITE);
        plainJButton_5.setBackground(Color.WHITE);
        plainJButton_6.setBackground(Color.WHITE);
        plainJButton_7.setBackground(Color.WHITE);
        plainJButton_8.setBackground(Color.WHITE);
        plainJButton_9.setBackground(Color.WHITE);
        plainJButton_0.setBackground(Color.WHITE);
        plainJButton_jian.setBackground(Color.WHITE);
        plainJButton_jia.setBackground(Color.WHITE);
        plainJButton_delete.setBackground(Color.WHITE);
        plainJButton_tab.setBackground(Color.WHITE);
        plainJButton_q.setBackground(Color.WHITE);
        plainJButton_w.setBackground(Color.WHITE);
        plainJButton_e.setBackground(Color.WHITE);
        plainJButton_r.setBackground(Color.WHITE);
        plainJButton_t.setBackground(Color.WHITE);
        plainJButton_y.setBackground(Color.WHITE);
        plainJButton_u.setBackground(Color.WHITE);
        plainJButton_i.setBackground(Color.WHITE);
        plainJButton_o.setBackground(Color.WHITE);
        plainJButton_p.setBackground(Color.WHITE);
        plainJButton_youkuo.setBackground(Color.WHITE);
        plainJButton_zuokuo.setBackground(Color.WHITE);
        plainJButton_fanxiegang.setBackground(Color.WHITE);
        plainJButton_cap.setBackground(Color.WHITE);
        plainJButton_a.setBackground(Color.WHITE);
        plainJButton_s.setBackground(Color.WHITE);
        plainJButton_d.setBackground(Color.WHITE);
        plainJButton_f.setBackground(Color.WHITE);
        plainJButton_g.setBackground(Color.WHITE);
        plainJButton_h.setBackground(Color.WHITE);
        plainJButton_j.setBackground(Color.WHITE);
        plainJButton_k.setBackground(Color.WHITE);
        plainJButton_l.setBackground(Color.WHITE);
        plainJButton_fenhao.setBackground(Color.WHITE);
        plainJButton_yinghao.setBackground(Color.WHITE);
        plainJButton_enter.setBackground(Color.WHITE);
        plainJButton_leftshift.setBackground(Color.WHITE);
        plainJButton_z.setBackground(Color.WHITE);
        plainJButton_x.setBackground(Color.WHITE);
        plainJButton_c.setBackground(Color.WHITE);
        plainJButton_v.setBackground(Color.WHITE);
        plainJButton_b.setBackground(Color.WHITE);
        plainJButton_n.setBackground(Color.WHITE);
        plainJButton_m.setBackground(Color.WHITE);
        plainJButton_douhao.setBackground(Color.WHITE);
        plainJButton_juhao.setBackground(Color.WHITE);
        plainJButton_xiegang.setBackground(Color.WHITE);
        
        plainJButton_kongge.setBackground(Color.WHITE);
        plainJButton_shang.setBackground(Color.WHITE);
        plainJButton_xia.setBackground(Color.WHITE);
        plainJButton_zuo.setBackground(Color.WHITE);
        plainJButton_you.setBackground(Color.WHITE);
        
        
        
        
        setLayout(new FlowLayout(FlowLayout.LEFT));
        //FlowLayout.LEFT
        add(label1);
        add(label2);
        add(label_TPYE);
        add(error);
        add(textarea);
        
        add(plainJButton);
        add(plainJButton_1);
        add(plainJButton_2);
        add(plainJButton_3);
        add(plainJButton_4);
        add(plainJButton_5);
        add(plainJButton_6);
        add(plainJButton_7);
        add(plainJButton_8);
        add(plainJButton_9);
        add(plainJButton_0);
        add(plainJButton_jian);
        add(plainJButton_jia);
        add(plainJButton_delete);
        add(plainJButton_tab);
        add(plainJButton_q);
        add(plainJButton_w);
        add(plainJButton_e);
        add(plainJButton_r);
        add(plainJButton_t);
        add(plainJButton_y);
        add(plainJButton_u);
        add(plainJButton_i);
        add(plainJButton_o);
        add(plainJButton_p);
        add(plainJButton_zuokuo);
        add(plainJButton_youkuo);
        add(plainJButton_fanxiegang);
        add(plainJButton_cap);
        add(plainJButton_a);
        add(plainJButton_s);
        add(plainJButton_d);
        add(plainJButton_f);
        add(plainJButton_g);
        add(plainJButton_h);
        add(plainJButton_j);
        add(plainJButton_k);
        add(plainJButton_l);
        add(plainJButton_fenhao);
        add(plainJButton_douhao);
        add(plainJButton_yinghao);
        add(plainJButton_enter);
        add(plainJButton_leftshift);
        add(plainJButton_z);
        add(plainJButton_x);
        add(plainJButton_c);
        add(plainJButton_v);
        add(plainJButton_b);
        add(plainJButton_n);
        add(plainJButton_m);
        add(plainJButton_douhao);
        add(plainJButton_juhao);
        add(plainJButton_xiegang);
        add(plainJButton_shang);
        add(label3);
        add(plainJButton_kongge);
        add(label4);
        add(plainJButton_zuo);
        add(plainJButton_xia);
        add(plainJButton_you);
        
        
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
        
        if(e.getKeyCode()==192){
            plainJButton.setBackground(new Color(250, 70, 70));
            
        }
        if(e.getKeyCode()==49){
            plainJButton_1.setBackground(new Color(250, 70, 70));
            
        }
        
        if(e.getKeyCode()==50){
            plainJButton_2.setBackground(new Color(250, 70, 70));
            
        }
        if(e.getKeyCode()==51){
            plainJButton_3.setBackground(new Color(250, 70, 70));
            
        }
        if(e.getKeyCode()==52){
            plainJButton_4.setBackground(new Color(250, 70, 70));
            
        }
        if(e.getKeyCode()==53){
            plainJButton_5.setBackground(new Color(250, 70, 70));
            
        }
        if(e.getKeyCode()==54){
            plainJButton_6.setBackground(new Color(250, 70, 70));
            
        }
        if(e.getKeyCode()==55){
            plainJButton_7.setBackground(new Color(250, 70, 70));
            
        }
        if(e.getKeyCode()==56){
            plainJButton_8.setBackground(new Color(250, 70, 70));
            
        }
        if(e.getKeyCode()==57){
            plainJButton_9.setBackground(new Color(250, 70, 70));
            
        }
        if(e.getKeyCode()==48){
            plainJButton_0.setBackground(new Color(250, 70, 70));
            
        }
        if(e.getKeyCode()==45){
            plainJButton_jian.setBackground(new Color(250, 70, 70));
            
        }
        if(e.getKeyCode()==61){
            plainJButton_jia.setBackground(new Color(250, 70, 70));
            
        }if(e.getKeyCode()==8){
            plainJButton_delete.setBackground(new Color(250, 70, 70));
            
        }if(e.getKeyCode()==9){
            plainJButton_tab.setBackground(new Color(250, 70, 70));
            
        }
        if(e.getKeyCode()==81){
            plainJButton_q.setBackground(new Color(250, 70, 70));
            
        }
        if(e.getKeyCode()==87){
            plainJButton_w.setBackground(new Color(250, 70, 70));
            
        }
        if(e.getKeyCode()==69){
            plainJButton_e.setBackground(new Color(250, 70, 70));
            
        }
        if(e.getKeyCode()==82){
            plainJButton_r.setBackground(new Color(250, 70, 70));
            
        }
        if(e.getKeyCode()==84){
            plainJButton_t.setBackground(new Color(250, 70, 70));
            
        }
        if(e.getKeyCode()==89){
            plainJButton_y.setBackground(new Color(250, 70, 70));
            
        }
        if(e.getKeyCode()==85){
            plainJButton_u.setBackground(new Color(250, 70, 70));
            
        }
        if(e.getKeyCode()==73){
            plainJButton_i.setBackground(new Color(250, 70, 70));
            
        }
        if(e.getKeyCode()==79){
            plainJButton_o.setBackground(new Color(250, 70, 70));
            
        }
        if(e.getKeyCode()==80){
            plainJButton_p.setBackground(new Color(250, 70, 70));
            
        }
        if(e.getKeyCode()==91){
            plainJButton_zuokuo.setBackground(new Color(250, 70, 70));
            
        }
        if(e.getKeyCode()==93){
            plainJButton_youkuo.setBackground(new Color(250, 70, 70));
            
        }
        if(e.getKeyCode()==92){
            plainJButton_fanxiegang.setBackground(new Color(250, 70, 70));
            
        }
        if(e.getKeyCode()==20){
            plainJButton_cap.setBackground(new Color(250, 70, 70));
            
        }
        if(e.getKeyCode()==65){
            plainJButton_a.setBackground(new Color(250, 70, 70));
            
        }
        if(e.getKeyCode()==83){
            plainJButton_s.setBackground(new Color(250, 70, 70));
            
        }
        if(e.getKeyCode()==68){
            plainJButton_d.setBackground(new Color(250, 70, 70));
            
        }
        if(e.getKeyCode()==70){
            plainJButton_f.setBackground(new Color(250, 70, 70));
            
        }
        if(e.getKeyCode()==71){
            plainJButton_g.setBackground(new Color(250, 70, 70));
            
        }
        if(e.getKeyCode()==72){
            plainJButton_h.setBackground(new Color(250, 70, 70));
            
        }
        if(e.getKeyCode()==74){
            plainJButton_j.setBackground(new Color(250, 70, 70));
            
        }
        if(e.getKeyCode()==75){
            plainJButton_k.setBackground(new Color(250, 70, 70));
            
        }
        if(e.getKeyCode()==76){
            plainJButton_l.setBackground(new Color(250, 70, 70));
            
        }
        if(e.getKeyCode()==59){
            plainJButton_fenhao.setBackground(new Color(250, 70, 70));
            
        }
        if(e.getKeyCode()==222){
            plainJButton_yinghao.setBackground(new Color(250, 70, 70));
            
        }
        if(e.getKeyCode()==10){
            plainJButton_enter.setBackground(new Color(250, 70, 70));
            
        }
        if(e.getKeyCode()==16){
            plainJButton_leftshift.setBackground(new Color(250, 70, 70));
            
        }if(e.getKeyCode()==90){
            plainJButton_z.setBackground(new Color(250, 70, 70));
            
        }
        if(e.getKeyCode()==88){
            plainJButton_x.setBackground(new Color(250, 70, 70));
            
        }
        if(e.getKeyCode()==67){
            plainJButton_c.setBackground(new Color(250, 70, 70));
            
        }
        if(e.getKeyCode()==86){
            plainJButton_v.setBackground(new Color(250, 70, 70));
            
        }
        if(e.getKeyCode()==66){
            plainJButton_b.setBackground(new Color(250, 70, 70));
            
        }
        if(e.getKeyCode()==78){
            plainJButton_n.setBackground(new Color(250, 70, 70));
            
        }
        if(e.getKeyCode()==77){
            plainJButton_m.setBackground(new Color(250, 70, 70));
            
        }
        if(e.getKeyCode()==44){
            plainJButton_douhao.setBackground(new Color(250, 70, 70));
            
        }
        if(e.getKeyCode()==46){
            plainJButton_juhao.setBackground(new Color(250, 70, 70));
            
        }
        if(e.getKeyCode()==47){
            plainJButton_xiegang.setBackground(new Color(250, 70, 70));
            
        }
        if(e.getKeyCode()==38){
            plainJButton_shang.setBackground(new Color(250, 70, 70));
            
        }
        if(e.getKeyCode()==32){
            plainJButton_kongge.setBackground(new Color(250, 70, 70));
            
        }
        if(e.getKeyCode()==37){
            plainJButton_zuo.setBackground(new Color(250, 70, 70));
            
        }
        if(e.getKeyCode()==40){
            plainJButton_xia.setBackground(new Color(250, 70, 70));
            
        }
        if(e.getKeyCode()==39){
            plainJButton_you.setBackground(new Color(250, 70, 70));
            
        }
        
    }
    public void keyReleased(KeyEvent e) {
        plainJButton.setBackground(Color.WHITE);
        plainJButton_1.setBackground(Color.WHITE);
        plainJButton_2.setBackground(Color.WHITE);
        plainJButton_3.setBackground(Color.WHITE);
        plainJButton_4.setBackground(Color.WHITE);
        plainJButton_5.setBackground(Color.WHITE);
        plainJButton_6.setBackground(Color.WHITE);
        plainJButton_7.setBackground(Color.WHITE);
        plainJButton_8.setBackground(Color.WHITE);
        plainJButton_9.setBackground(Color.WHITE);
        plainJButton_0.setBackground(Color.WHITE);
        plainJButton_jian.setBackground(Color.WHITE);
        plainJButton_jia.setBackground(Color.WHITE);
        plainJButton_delete.setBackground(Color.WHITE);
        plainJButton_tab.setBackground(Color.WHITE);
        plainJButton_q.setBackground(Color.WHITE);
        plainJButton_w.setBackground(Color.WHITE);
        plainJButton_e.setBackground(Color.WHITE);
        plainJButton_r.setBackground(Color.WHITE);
        plainJButton_t.setBackground(Color.WHITE);
        plainJButton_y.setBackground(Color.WHITE);
        plainJButton_u.setBackground(Color.WHITE);
        plainJButton_i.setBackground(Color.WHITE);
        plainJButton_o.setBackground(Color.WHITE);
        plainJButton_p.setBackground(Color.WHITE);
        plainJButton_youkuo.setBackground(Color.WHITE);
        plainJButton_zuokuo.setBackground(Color.WHITE);
        plainJButton_fanxiegang.setBackground(Color.WHITE);
        plainJButton_cap.setBackground(Color.WHITE);
        plainJButton_a.setBackground(Color.WHITE);
        plainJButton_s.setBackground(Color.WHITE);
        plainJButton_d.setBackground(Color.WHITE);
        plainJButton_f.setBackground(Color.WHITE);
        plainJButton_g.setBackground(Color.WHITE);
        plainJButton_h.setBackground(Color.WHITE);
        plainJButton_j.setBackground(Color.WHITE);
        plainJButton_k.setBackground(Color.WHITE);
        plainJButton_l.setBackground(Color.WHITE);
        plainJButton_fenhao.setBackground(Color.WHITE);
        plainJButton_yinghao.setBackground(Color.WHITE);
        plainJButton_enter.setBackground(Color.WHITE);
        plainJButton_leftshift.setBackground(Color.WHITE);
        plainJButton_z.setBackground(Color.WHITE);
        plainJButton_x.setBackground(Color.WHITE);
        plainJButton_c.setBackground(Color.WHITE);
        plainJButton_v.setBackground(Color.WHITE);
        plainJButton_b.setBackground(Color.WHITE);
        plainJButton_n.setBackground(Color.WHITE);
        plainJButton_m.setBackground(Color.WHITE);
        plainJButton_douhao.setBackground(Color.WHITE);
        plainJButton_juhao.setBackground(Color.WHITE);
        plainJButton_xiegang.setBackground(Color.WHITE);
        
        plainJButton_kongge.setBackground(Color.WHITE);
        plainJButton_shang.setBackground(Color.WHITE);
        plainJButton_xia.setBackground(Color.WHITE);
        plainJButton_zuo.setBackground(Color.WHITE);
        plainJButton_you.setBackground(Color.WHITE);
        error.setText(recoder());
        
        
    }
    public void keyTyped(KeyEvent e) {
    }
    public String recoder()
    {
        String now = textarea.getText();
        int total = 0;
        int[] num = new int[256];
        for(int i = 0 ; i < 256; i++) num[i] = 0;
        for(int i = 0; i < now.length() && i < text.length(); i++)
        {
            if(now.charAt(i) != text.charAt(i))
            {
                total++;
                num[text.charAt(i)]++;
            }
        }
        String err =total + " errors ";
        for(int i = 0; i < 256; i++)
        {
            if(num[i] != 0)
            {
                err += " " + num[i] + " " + (char)i;
            }
        }
        return err;
    }
}
