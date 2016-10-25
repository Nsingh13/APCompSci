package SetGame;

public class Cards {
	public static int [][] cards = new int[120][120];
	public static int cardNum;
	
	public static final int quantity = 0;
		public static final int one = 0;
		public static final int two = 1;
		public static final int three = 2;
	
		
	public static final int shape = 1;
		public static final int oval = 0;
		public static final int diamond = 1;
		public static final int squiggle = 2;
		
	public static final int color = 2;
		public static final int green = 0;
		public static final int purple = 1;
		public static final int red = 2;
		
	public static final int texture = 3;
		public static final int hallow = 0;
		public static final int striped = 1;
		public static final int solid = 2;
		
	public static void populate(){
		
		System.out.println("pop2");
		if (Window.rb1.isSelected())
		  {
			cards[cardNum][quantity] = one;
		  }
		else if (Window.rb2.isSelected())
		  {
			cards[cardNum][quantity] = two;
		  }
		else{
			cards[cardNum][quantity] = three;
		}
		
		
		
		if (Window.rb4.isSelected())
		  {
			cards[cardNum][shape] = oval;
		  }
		else if (Window.rb5.isSelected())
		  {
			cards[cardNum][shape] = diamond;
		  }
		else{
			cards[cardNum][shape] = squiggle;
		}
		
		
		
		if (Window.rb7.isSelected())
		  {
			cards[cardNum][color] = green;
		  }
		else if (Window.rb8.isSelected())
		  {
			cards[cardNum][color] = purple;
		  }
		else{
			cards[cardNum][color] = red;
		}
		
		
		
		if (Window.rb10.isSelected())
		  {
			cards[cardNum][texture] = hallow;
		  }
		else if (Window.rb11.isSelected())
		  {
			cards[cardNum][texture] = striped;
		  }
		else{
			cards[cardNum][texture] = solid;
		}
			
		
		
		
		if(cardNum == 4){
			Solver.setSolver();
		}
		else{
		reset();
		}
		}
	
	
	public static void reset(){
		System.out.println("reset");
		
		cardNum++;

		
		Window.rb1.setSelected(false);
		Window.rb2.setSelected(false);
		Window.rb3.setSelected(false);
		Window.rb4.setSelected(false);
		Window.rb5.setSelected(false);
		Window.rb6.setSelected(false);
		Window.rb7.setSelected(false);
		Window.rb8.setSelected(false);
		Window.rb9.setSelected(false);
		Window.rb10.setSelected(false);
		Window.rb11.setSelected(false);
		Window.rb12.setSelected(false);
	
		
		
		Window.drawcFrame();
	}
	
	

}
