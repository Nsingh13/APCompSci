package Project1;

import java.awt.Font;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FailWindow {
    
   

    public static void drawFailWindow() throws MalformedURLException {
	
	JLabel Label = new JLabel("Invalid Input!");
	

	JFrame f = new JFrame("Animation");
	;
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setLocationRelativeTo(null);
	f.setVisible(true);
	Label.setFont(new Font("Impact",5,30));
	f.add(Label);
	
	Label.setBounds(100,120, 4000, 100);

	
	f.setSize(420, 300);
	f.setLocationRelativeTo(null);
    }
}


