package Project1;

import java.net.MalformedURLException;

//Sean Kelker: Worked on the fame and GUI and manage meme placement 
//Matthew Morrazon : Worked on he Runner and write the code for the game
//Per 2
//11/4/16

public class Runner {
    public static String name1;
    public static String name2;
    public static StartWindow start = new StartWindow();
    public static int total = 0;
    public static int num = 21;
    public static double player = 0;
    public static String Winner;

    public static void main(String[] args) throws MalformedURLException {

	start.drawStartWindow();

    }

    // This function determines the names of the player and determines the
    // parameters for the game
    // Pre: None
    // Post: None
    public static void getNames() {
	name1 = start.getNameOne();
	name2 = start.getNameTwo();
	if (Integer.parseInt(start.getNum()) <= 0) {
	    num = 21;
	} else {
	    num = Integer.parseInt(start.getNum());
	}

    }

    // This program looks at the values of the number and determines the winner
    // Pre: None
    // Post: None
    public static void game() {
	player++;
	System.out.println(total);
	if (total >= num) {

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
