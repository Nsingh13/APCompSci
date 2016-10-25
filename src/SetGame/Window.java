package SetGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.TimeUnit;


public class Window
{
	public static JFrame frame = new JFrame("Set Solver");
	public static JFrame cFrame = new JFrame("Enter Card ");
	public static JButton startB = new JButton("Start");
	
	public static JRadioButton rb1 = new JRadioButton("One");
	public static JRadioButton rb2 = new JRadioButton("Two");
	public static JRadioButton rb3 = new JRadioButton("Three");
	public static JRadioButton rb4 = new JRadioButton("Oval");
	public static JRadioButton rb5 = new JRadioButton("Diamond");
	public static JRadioButton rb6 = new JRadioButton("Squiggle");
	public static JRadioButton rb7 = new JRadioButton("Green");
	public static JRadioButton rb8 = new JRadioButton("Purple");
	public static JRadioButton rb9 = new JRadioButton("Red");
	public static JRadioButton rb10 = new JRadioButton("Hallow");
	public static JRadioButton rb11 = new JRadioButton("Striped");
	public static JRadioButton rb12 = new JRadioButton("Solid");
	public static JRadioButton bug = new JRadioButton();
	
	static Cards c = new Cards();
	 
	
	
	
	public void drawFrame(){
		 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200, 200);
		frame.setVisible(true);



		frame.add(startB);
		startB.setBounds(50, 50, 100, 20);
		

		startB.addActionListener(
		 new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
			    	drawcFrame();
			     
			    }
			  }
			);
		
		
		
			
			
		}
	public static void drawcFrame(){
		
		cFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cFrame.setSize(650, 700);
		cFrame.setVisible(true);
		
		JButton finishB = new JButton("Finish");
		
		JLabel jl1 = new JLabel("Quantity");
		JLabel jl2 = new JLabel("Shape");
		JLabel jl3 = new JLabel("Color");
		JLabel jl4 = new JLabel("Texture");
		
		
		cFrame.add(jl1);
		jl1.setBounds(10, 10, 110, 15);
		
	
		//Quantity
				cFrame.add(rb1);
				rb1.setBounds(10, 40, 100, 20);
				cFrame.add(rb2);
				rb2.setBounds(10, 70, 100, 20);
				cFrame.add(rb3);
				rb3.setBounds(10, 100, 100, 20);
		
		
		//Shape
				cFrame.add(jl2);
				jl2.setBounds(110, 10, 110, 15);
				
				cFrame.add(rb4);
				rb4.setBounds(110, 40, 100, 20);
				cFrame.add(rb5);
				rb5.setBounds(110, 70, 100, 20);
				cFrame.add(rb6);
				rb6.setBounds(110, 100, 100, 20);
				
		//Color
				cFrame.add(jl3);
				jl3.setBounds(210, 10, 110, 15);
				
				cFrame.add(rb7);
				rb7.setBounds(210, 40, 100, 20);
				cFrame.add(rb8);
				rb8.setBounds(210, 70, 100, 20);
				cFrame.add(rb9);
				rb9.setBounds(210, 100, 100, 20);
				
		//Texture
				cFrame.add(jl4);
				jl4.setBounds(310, 10, 110, 15);
				
				cFrame.add(rb10);
				rb10.setBounds(310, 40, 100, 20);
				cFrame.add(rb11);
				rb11.setBounds(310, 70, 100, 20);
				cFrame.add(rb12);
				rb12.setBounds(310, 100, 100, 20);
		
		

		cFrame.add(finishB);
		finishB.setBounds(310, 130, 100, 20);
		
		
		finishB.addActionListener(
		 new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
			    
			    	
			    	
			    	Cards.populate();
		
			    	
			     
			    }
			  }
			);
		
		cFrame.add(bug);
		bug.setVisible(false);
		
		
		
	}
	
	
 }


	
	
    

	

	


