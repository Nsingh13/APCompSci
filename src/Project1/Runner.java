package Project1;

import java.net.MalformedURLException;

public class Runner {
    public static String name1;
    public static String name2;
    public static StartWindow start = new StartWindow();
    public static int total = 0;
    public static double player = 0;
    public static String Winner;

    public static void main(String[] args) throws MalformedURLException {

	start.drawStartWindow();

    }

    public static void getNames() {
	name1 = start.getNameOne();
	name2 = start.getNameTwo();

    }

    public static void game()  {
	player++;
	System.out.println(total);
	if (total >= 21) {
	    
	    if ((int) player / 2 == player / 2) {
		Winner = name1;
		System.out.println(name1 + " Wins");
	    } else {
		Winner = name2;
	    }
	    try {
		WinWindow.drawGameWindow();
	    } catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
	    GameWindow.f.dispose();

	}

    }

}
