package Project1;

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

public class GameWindow {

    public static JFrame f = new JFrame("NimGame");
    public static Random rand = new Random();
    public static int total = 0;
    public static int x = 0;
    public static int y = 0;
    public static int z = 0;

    public static void drawGameWindow() throws MalformedURLException {
	JButton startB = new JButton("Start");
	URL url = new URL(randomURL());
	Icon icon = new ImageIcon(url);
	JLabel label = new JLabel(icon);

	JFrame f = new JFrame("Animation");

	f.getContentPane().add(label);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setLocationRelativeTo(null);
	f.setVisible(true);

	f.add(startB);

	startB.setBounds(x, y, 285, 20);

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

    public static String randomURL() {
	int num = 8;
		//rand.nextInt(13);
	if (num == 0) {
	    x = 100;
	    y = 50;
	    z = 100;
	    return "http://i.imgur.com/CNam9Nq.gif";
	}
	if (num == 1) {
	    x = 215;
	    y = 50;
	    z = 100;
	    return "http://i.imgur.com/AosN9Nn.gif";
	}
	if (num == 2) {
	    x = 100;
	    y = 50;
	    z = 100;
	    return "http://i.imgur.com/ifWvZKC.gif";
	}
	if (num == 3) {
	    x = 100;
	    y = 50;
	    z = 100;
	    return "http://i.imgur.com/ifWvZKC.gif";
	}
	if (num == 4) {
	    x = 95;
	    y = 50;
	    z = 100;
	    return "http://i.imgur.com/LZ8ENcn.gif";
	}
	if (num == 5) {
	    x = 120;
	    y = 50;
	    z = 100;
	    return "http://i.imgur.com/IpFc80P.gif";
	}
	if (num == 6) {
	    x = 120;   
	    y = 50;
	    z = 100;
	    return "http://i.imgur.com/SHvDvqi.gif";
	}
	if (num == 7) {
	    x = 145;
	    y = 50;
	    z = 100;
	    return "http://i.imgur.com/rs1hDWx.gif";
	}
	if (num == 8) {
	    x = 45;
	    y = 50;
	    z = 100;
	    return "http://i.imgur.com/fmGuhKy.gif";
	}
	if (num == 9) {
	    x = 45;
	    y = 50;
	    z = 100;
	    return "http://i.imgur.com/dkljNfp.gif";
	}
	if (num == 10) {
	    return "http://i.imgur.com/G5B6hMd.gif";
	}
	if (num == 11) {
	    return "http://i.imgur.com/k1UIF9z.gif";
	}
	if (num == 12) {
	    return "http://i.imgur.com/OyJ0iqh.gif";
	}
	return null;

    }

}
