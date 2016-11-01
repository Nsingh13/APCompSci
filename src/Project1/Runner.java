package Project1;

import java.net.MalformedURLException;

public class Runner {
    public static String name1;
    public static String name2;
    public static StartWindow start = new StartWindow();
    public static void main(String[] args) throws MalformedURLException {
	
	
	start.drawStartWindow();
	
	
	

    }
    public static void getNames() {
	name1=start.getNameOne();
	name2=start.getNameTwo();
	
	
	
	
    }

}
