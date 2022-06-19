import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.event.MouseInputListener;

import java.awt.*;
import java.awt.event.MouseEvent;

public class frame extends JFrame {
    public frame()
    {
        super("Neural Listener");
        
        this.setBackground(new Color(128, 0, 0));
        panel pane = new panel();
        
        
        
        
        /*headphones.addMouseListener (new MouseAdapter()) {
            public void mousePressed(MouseEvent me) { 
                System.out.println(me); 
            } 
        }*/
        
        add(createImage("computer.png", 100, 210, 200, 200));
        
        add(pane);
        
        setSize(350, 520);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private JLabel createImage(String fileName, int x, int y, int w, int h) {
        JLabel label = new JLabel();
        label.setIcon(new ImageIcon(fileName));
        label.setBounds(x, y, w, h);
        return label;
    }    
}
