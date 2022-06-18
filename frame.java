import javax.swing.*;
import java.awt.*;

public class frame extends JFrame {
    public frame()
    {
        super("Unknown");
        
        getContentPane().setBackground(new Color(181, 101, 29));
        
        setSize(350, 475);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
