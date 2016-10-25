package SetGame;

public class Solver {

    public static void setSolver() {
	System.out.println("started");
	boolean run = false;
	int sets = 0;
	int a = 0;
	int b = 1;
	int c = 2;
	while (run == false) {

	    boolean quantity = false;
	    boolean shape = false;
	    boolean color = false;
	    boolean texture = false;

	    while (run == false) {
		if (c >= 12) {
		    b++;
		    c = b + 1;
		}

		if (b >= 12) {
		    a++;
		    b = a + 1;
		}
		if (a == 12) {
		    run = true;
		}

		
		if (c == b) {
		    c++;
		}
		if (a == b) {
		    b++;
		}
		
		
		c++;
		
		if (Cards.cards[a][Cards.quantity] == Cards.cards[c][Cards.quantity]){
		 if( Cards.cards[b][Cards.quantity] == Cards.cards[c][Cards.quantity]) {
		 quantity = true;
		 System.out.println(Cards.cards[a][Cards.quantity]);
		 System.out.println(Cards.cards[b][Cards.quantity]);
		 System.out.println(Cards.cards[c][Cards.quantity]);
		 }
		}
		
		if (quantity == true) {
//			 System.out.println("set");
//			 System.out.println(a + " " + Cards.cards[a][Cards.quantity] +
//			 " " + Cards.cards[a][Cards.shape]
//			 + " " + Cards.cards[a][Cards.color] + " " +
//			 Cards.cards[a][Cards.texture]);
//			 
//			 System.out.println(b + " " + Cards.cards[b][Cards.quantity] +
//			 " " + Cards.cards[b][Cards.shape]
//			 + " " + Cards.cards[b][Cards.color] + " " +
//			 Cards.cards[b][Cards.texture]);
//			 
//			 System.out.println(c + " " + Cards.cards[c][Cards.quantity] +
//			 " " + Cards.cards[c][Cards.shape]
//			 + " " + Cards.cards[c][Cards.color] + " " +
//			 Cards.cards[c][Cards.texture]);
//			
//			 System.out.println("quantity " + quantity);
//			 System.out.println("shape" + shape);
//			 System.out.println("color" + color);
//			 System.out.println("texture" + texture);
			 }
		// }
		//
		// else if (Cards.cards[a][Cards.quantity] !=
		// Cards.cards[b][Cards.quantity]) {
		// if (Cards.cards[b][Cards.quantity] !=
		// Cards.cards[c][Cards.quantity]) {
		// if (Cards.cards[a][Cards.quantity] !=
		// Cards.cards[c][Cards.quantity]) {
		//
		// quantity = true;
		// }
		// }
		//
		// }
		// else{
		// quantity = false;
		// }
		//
		// /*
		// * if(Cards.cards[a][Cards.shape]==Cards.cards[b][Cards.shape]
		// * &&
		// Cards.cards[b][Cards.shape]==Cards.cards[c][Cards.shape]){
		// * shape =true;
		// *
		// * }
		// *
		// *
		// *
		// if(Cards.cards[a][Cards.shape]!=Cards.cards[b][Cards.shape]){
		// *
		// if(Cards.cards[b][Cards.shape]!=Cards.cards[c][Cards.shape]){
		// * if(
		// * Cards.cards[a][Cards.shape]!=Cards.cards[c][Cards.shape]){
		// *
		// * shape =true; } }
		// *
		// * }
		// *
		// *
		// *
		// * if(Cards.cards[a][Cards.color]==Cards.cards[b][Cards.color]
		// * &&
		// Cards.cards[b][Cards.color]==Cards.cards[c][Cards.color]){
		// * color =true;
		// *
		// * }
		// *
		// *
		// *
		// if(Cards.cards[a][Cards.color]!=Cards.cards[b][Cards.color]){
		// *
		// if(Cards.cards[b][Cards.color]!=Cards.cards[c][Cards.color]){
		// * if(
		// * Cards.cards[a][Cards.color]!=Cards.cards[c][Cards.color]){
		// *
		// * color =true; } }
		// *
		// * }
		// *
		// *
		// *
		// * if(Cards.cards[a][Cards.texture]==Cards.cards[b][Cards.
		// * texture] &&
		// *
		// Cards.cards[b][Cards.texture]==Cards.cards[c][Cards.texture])
		// * { texture =true;
		// *
		// * }
		// *
		// * if(Cards.cards[a][Cards.texture]!=Cards.cards[b][Cards.
		// * texture]){
		// * if(Cards.cards[b][Cards.texture]!=Cards.cards[c][Cards.
		// * texture]){ if(
		// *
		// Cards.cards[a][Cards.texture]!=Cards.cards[c][Cards.texture])
		// * {
		// *
		// * texture =true; } }
		// *
		// * }
		// *
		// */
		//
		// if (quantity == true /*&& shape == true && color == true &&
		// texture == true*/) {
		// System.out.println("set");
		// System.out.println(a + " " + Cards.cards[a][Cards.quantity] +
		// " " + Cards.cards[a][Cards.shape]
		// + " " + Cards.cards[a][Cards.color] + " " +
		// Cards.cards[a][Cards.texture]);
		// System.out.println(b + " " + Cards.cards[b][Cards.quantity] +
		// " " + Cards.cards[b][Cards.shape]
		// + " " + Cards.cards[b][Cards.color] + " " +
		// Cards.cards[b][Cards.texture]);
		// System.out.println(c + " " + Cards.cards[c][Cards.quantity] +
		// " " + Cards.cards[c][Cards.shape]
		// + " " + Cards.cards[c][Cards.color] + " " +
		// Cards.cards[c][Cards.texture]);
		//
		// System.out.println("quantity " + quantity);
		// System.out.println("shape" + shape);
		// System.out.println("color" + color);
		// System.out.println("texture" + texture);
		// }
		//
		
		
	    }

	}
    }
}
