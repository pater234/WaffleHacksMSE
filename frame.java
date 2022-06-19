import javax.swing.*;
import java.awt.*;

public class frame extends JFrame {
    public frame()
    {
        super("Neural Listener");
        
        this.setBackground(new Color(128, 0, 0));
        panel pane = new panel();
        add(pane);
        
        setSize(350, 520);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}