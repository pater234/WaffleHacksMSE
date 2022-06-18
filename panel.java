import java.awt.Image;
import javax.swing.*;

public class panel extends JPanel{
    public panel()
    {
        super();
        ImageIcon cozy = new ImageIcon("Cozy_Room.png");
        Image orig = cozy.getImage();
        Image newImg = orig.getScaledInstance(330,430,java.awt.Image.SCALE_SMOOTH);
        cozy = new ImageIcon(newImg);
        JLabel image = new JLabel("", cozy, SwingConstants.CENTER);
        add(image);
    }
}
