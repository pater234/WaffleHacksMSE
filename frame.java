import javax.swing.*;
import java.awt.*;

public class frame extends JFrame {
    public frame()
    {
        super("Neural Listener");
        
        panel pane = new panel();
        add(pane);
        
        setSize(350, 475);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}