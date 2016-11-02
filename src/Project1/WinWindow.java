package Project1;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class WinWindow {

    public static JFrame f = new JFrame("NimGame");
    public static Random rand = new Random();
    public static int total = 0;
    public static int x = 0;
    public static int y = 0;
    public static int z = 0;
    

    public static void drawGameWindow() throws MalformedURLException {
	String text = Runner.Winner;
	JButton buttonOne = new JButton("Add 1");
	JButton buttonTwo = new JButton("Add 2");
	JButton buttonThree = new JButton("Add 3");
	JLabel Label = new JLabel(text);
	URL url = new URL("http://i.imgur.com/GMSZrwX.gif");
	Icon icon = new ImageIcon(url);
	JLabel label = new JLabel(icon);

	JFrame f = new JFrame("Animation");

	f.getContentPane().add(label);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setLocationRelativeTo(null);
	f.setVisible(true);
	Label.setFont(new Font("Impact",5,30));
	f.add(Label);
	Label.setBounds(x, y-20, z, 30);
	

	f.getContentPane().add(label);
	f.pack();

	f.setLocationRelativeTo(null);
    }
}
