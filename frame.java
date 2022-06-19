import javax.swing.*;
import java.awt.*;

public class frame extends JFrame {
    public frame()
    {
        super("Neural Listener");

        panel pane = new panel();
        
        add(createImage("computer.png", 100, 100, 200, 200));
        
        add(pane);
        
        setSize(350, 475);
        setResizable(false);
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
