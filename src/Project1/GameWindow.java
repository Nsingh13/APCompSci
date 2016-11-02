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

public class GameWindow {

    public static JFrame f = new JFrame("NimGame");
    public static Random rand = new Random();
    public static int total = 0;
    public static int x = 0;
    public static int y = 0;
    public static int z = 0;
    

    public static void drawGameWindow() throws MalformedURLException {
	if(Runner.total < 21){
	String text = "Total:"+Runner.total;
	JButton buttonOne = new JButton("Add 1");
	JButton buttonTwo = new JButton("Add 2");
	JButton buttonThree = new JButton("Add 3");
	JLabel Label = new JLabel(text);
	URL url = new URL(randomURL());
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
	f.add(buttonOne);
	buttonOne.setBounds(x, y + 20, z, 20);
	f.add(buttonTwo);
	buttonTwo.setBounds(x, y + 50, z, 20);
	f.add(buttonThree);
	buttonThree.setBounds(x, y + 80, z, 20);

	f.getContentPane().add(label);
	f.pack();

	f.setLocationRelativeTo(null);
	buttonOne.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {

		f.dispose();
		Runner.total++;
		Runner.game();
		try {
		    drawGameWindow();
		} catch (MalformedURLException e1) {
		    e1.printStackTrace();
		}

	    }
	});

	buttonTwo.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {

		f.dispose();
		Runner.total += 2;
		Runner.game();
		try {
		    drawGameWindow();
		} catch (MalformedURLException e1) {
		    e1.printStackTrace();
		}

	    }
	});
	buttonThree.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {

		f.dispose();
		Runner.total += 3;
		Runner.game();
		try {
		    drawGameWindow();
		} catch (MalformedURLException e1) {
		    e1.printStackTrace();
		}

	    }
	});
	}
    }

    public static String randomURL() {
	int num = rand.nextInt(13);
	if (num == 0) {
	    x = 100;
	    y = 50;
	    z = 285;
	    return "http://i.imgur.com/CNam9Nq.gif";
	}
	if (num == 1) {
	    x = 215;
	    y = 50;
	    z = 285;
	    return "http://i.imgur.com/AosN9Nn.gif";
	}
	if (num == 2) {
	    x = 100;
	    y = 50;
	    z = 285;
	    return "http://i.imgur.com/ifWvZKC.gif";
	}
	if (num == 3) {
	    x = 100;
	    y = 50;
	    z = 285;
	    return "http://i.imgur.com/ifWvZKC.gif";
	}
	if (num == 4) {
	    x = 95;
	    y = 50;
	    z = 285;
	    return "http://i.imgur.com/LZ8ENcn.gif";
	}
	if (num == 5) {
	    x = 120;
	    y = 50;
	    z = 285;
	    return "http://i.imgur.com/IpFc80P.gif";
	}
	if (num == 6) {
	    x = 120;
	    y = 50;
	    z = 285;
	    return "http://i.imgur.com/SHvDvqi.gif";
	}
	if (num == 7) {
	    x = 145;
	    y = 50;
	    z = 285;
	    return "http://i.imgur.com/rs1hDWx.gif";
	}
	if (num == 8) {
	    x = 45;
	    y = 50;
	    z = 285;
	    return "http://i.imgur.com/fmGuhKy.gif";
	}
	if (num == 9) {
	    x = 50;
	    y = 50;
	    z = 100;
	    return "http://i.imgur.com/dkljNfp.gif";
	}
	if (num == 10) {
	    x = 100;
	    y = 50;
	    z = 285;
	    return "http://i.imgur.com/G5B6hMd.gif";
	}
	if (num == 11) {
	    x = 25;
	    y = 30;
	    z = 245;
	    return "http://i.imgur.com/OyJ0iqh.gif";
	}
	if (num == 12) {
	    x = 100;
	    y = 50;
	    z = 285;
	    return "http://i.imgur.com/QyW9Y79.gif";
	}
	return null;

    }

}
