package Project1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GameWindow {

    public static JFrame f = new JFrame("NimGame");
    public static JButton startB = new JButton("Start");
    public static int total = 0;

    public static void drawGameWindow() throws MalformedURLException {

	URL url = new URL("http://i.imgur.com/CNam9Nq.gif");
	Icon icon = new ImageIcon(url);
	JLabel label = new JLabel(icon);

	JFrame f = new JFrame("Animation");

	f.getContentPane().add(label);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setLocationRelativeTo(null);
	f.setVisible(true);

	f.add(startB);
	startB.setBounds(85, 70, 300, 20);

	f.getContentPane().add(label);
	f.pack();
	f.setLocationRelativeTo(null);
	startB.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		
		
		f.dispose();
		total++;
		System.out.println(total);
		try {
		    drawGameWindow();
		} catch (MalformedURLException e1) {
		    e1.printStackTrace();
		}
		
	    }
	});

    }

}
