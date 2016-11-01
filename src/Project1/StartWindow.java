package Project1;

import java.awt.Dimension;
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

public class StartWindow {

    public static JFrame f = new JFrame("NimGame");
    public static JButton startB = new JButton("Start");
    public static JTextField playerOneName = new JTextField("Enter Name of Player #1");
    public static JTextField playerTwoName = new JTextField("Enter Name of Player #2");
    public static GameWindow draw = new GameWindow();

    public static void drawStartWindow() throws MalformedURLException {

	URL url = new URL("http://i.imgur.com/rR9t3dX.gif");
	Icon icon = new ImageIcon(url);
	JLabel label = new JLabel(icon);

	JFrame f = new JFrame("Animation");

	f.getContentPane().add(label);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setLocationRelativeTo(null);
	f.setVisible(true);

	f.add(startB);
	startB.setBounds(85, 70, 300, 20);
	f.add(playerOneName);
	playerOneName.setBounds(85, 5, 300, 20);
	f.add(playerTwoName);
	playerTwoName.setBounds(85, 30, 300, 20);
	f.getContentPane().add(label);
	f.pack();
	  f.setLocationRelativeTo(null);
	startB.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		Runner.getNames();

		try {
		    runGame();
		    f.setVisible(false);
		    f.dispose();
		} catch (MalformedURLException e1) {
		    // TODO Auto-generated catch block
		    e1.printStackTrace();
		}
	    }
	});

    }

    public static String getNameOne() {
	String name;
	name = playerOneName.getText();
	return name;

    }

    public static String getNameTwo() {
	String name;
	name = playerTwoName.getText();
	return name;

    }

    public static void runGame() throws MalformedURLException {
	GameWindow.drawGameWindow();
    }
}
