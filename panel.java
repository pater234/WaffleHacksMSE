import java.awt.Image;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class panel extends JPanel implements ActionListener {
    public panel()
    {
        super();
        ImageIcon cozy = new ImageIcon("Cozy_Room_Photoshop.PNG");
        Image orig = cozy.getImage();
        Image newImg = orig.getScaledInstance(330,430,java.awt.Image.SCALE_SMOOTH);
        cozy = new ImageIcon(newImg);
        JLabel image = new JLabel("", cozy, SwingConstants.CENTER);
        add(image);

        JButton headphones = new JButton();
        headphones.setBounds(190, 140, 100, 90);
        headphones.setOpaque(false);
        headphones.setContentAreaFilled(false);
        headphones.setBorderPainted(false);
        //headphones.addActionListener((event) -> )
        add(headphones);
    }

    public void actionPerformed(ActionEvent e) {
        jsyn sound = new jsyn();
    }
}
