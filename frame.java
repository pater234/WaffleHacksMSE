import javax.swing.*;

public class frame extends JFrame {
    public frame()
    {
        super("Unknown");
        setSize(350, 475);
        panel pane = new panel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(pane);
        setVisible(true);
    }
}
