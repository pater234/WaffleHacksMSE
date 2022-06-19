import java.awt.Image;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import com.jsyn.JSyn;
import com.jsyn.Synthesizer;
import com.jsyn.unitgen.LineOut;
import com.jsyn.unitgen.SineOscillator;
import java.util.Random;

public class panel extends JPanel implements ActionListener{
    public panel()
    {
        super();
        ImageIcon cozy = new ImageIcon("Cozy_Room_Photoshop.PNG");
        Image orig = cozy.getImage();
        Image newImg = orig.getScaledInstance(330,430,java.awt.Image.SCALE_SMOOTH);
        cozy = new ImageIcon(newImg);
        JLabel image = new JLabel("", cozy, SwingConstants.CENTER);
        add(image);

        JButton btn = new JButton("Play Sound");
        btn.setBounds(0,0,1000,1000);
        add(btn);
        btn.addActionListener(this);
    }

    public static void playSound() {
        Synthesizer synth = JSyn.createSynthesizer();
        try {
            Random rand = new Random();
            int pitch1 = rand.nextInt(1500);
            int pitch2 = rand.nextInt(1500);
            int freq1 = rand.nextInt(25);
            int freq2 = rand.nextInt(25);
            synth.start();
            SineOscillator sineOsc1 = new SineOscillator(pitch1, freq1);
            SineOscillator sineOsc2 = new SineOscillator(pitch2, freq2);
            LineOut lineOut= new LineOut();
            synth.add(lineOut);
            synth.add(sineOsc1);
            synth.add(sineOsc2);
            sineOsc1.output.connect(0, lineOut.input, 0);
            sineOsc2.output.connect(0, lineOut.input, 1);
            lineOut.start();
            sineOsc1.start();
            sleep(500);
            sineOsc2.start();
            sleep(500);
            sineOsc1.stop();
            sleep(500);
            sineOsc2.stop();
            lineOut.stop();
        } finally {
            synth.stop();
        }
    }
    private static void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    public void actionPerformed(ActionEvent e)
    {
        // jsyn sound = new jsyn();

        System.out.println("sound started");
        playSound();
        System.out.println("sound ended");
    }
}
