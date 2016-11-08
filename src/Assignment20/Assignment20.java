package Assignment20;

import java.util.Scanner;

//Sean Kelker
//11/8/16
//Per 2

public class Assignment20 {
    public static double sum = 0;
    public static double currentValue;
    public static double aprox;

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.println("How many values would you like");
	int loopLength = input.nextInt();

	System.out.println("What do you want increment by");
	int increment = input.nextInt();

	System.out.println("i\tm(i)");
	System.out.println("_____________");

	for (int i = 1; i < loopLength * increment; i++) {
	    if (i % increment == 0 || i == 1) {
		System.out.println(i + "\t" + function(i));

	    } else {
		function(i);
	    }

	}
    }

    public static double function(int i) {
	double numerator = Math.pow(-1, i + 1);
	double denominator = (2 * i) - 1;

	currentValue = (numerator / denominator);
	sum += currentValue;
	aprox = sum * 4;

	return aprox;
    }
}
///$$$$$$$$ /$$$$$$$  /$$   /$$ /$$      /$$ /$$$$$$$         /$$$$$$  /$$   /$$   /$$    /$$$$$$ 
//|__  $$__/| $$__  $$| $$  | $$| $$$    /$$$| $$__  $$       /$$__  $$| $$  /$$/ /$$$$   /$$__  $$
//  | $$   | $$  \ $$| $$  | $$| $$$$  /$$$$| $$  \ $$      |__/  \ $$| $$ /$$/ |_  $$  | $$  \__/
//  | $$   | $$$$$$$/| $$  | $$| $$ $$/$$ $$| $$$$$$$/        /$$$$$$/| $$$$$/    | $$  | $$$$$$$ 
//  | $$   | $$__  $$| $$  | $$| $$  $$$| $$| $$____/        /$$____/ | $$  $$    | $$  | $$__  $$
//  | $$   | $$  \ $$| $$  | $$| $$\  $ | $$| $$            | $$      | $$\  $$   | $$  | $$  \ $$
//  | $$   | $$  | $$|  $$$$$$/| $$ \/  | $$| $$            | $$$$$$$$| $$ \  $$ /$$$$$$|  $$$$$$/
//  |__/   |__/  |__/ \______/ |__/     |__/|__/            |________/|__/  \__/|______/ \______/ 
//                                                                                                
//                                                                                                
//                                                                                                
//```:+syyhhhhhhhhhhhhhhdddhhyyyyyhhhhhhhhhyyhhyyyysoo/+//-.```````....```
//``:yhhyhhhhhddddhhhhyyyyhhhhhyyyyyyyyyyhhyyyyyyyyysooo++/:.`````````````
//`````shhhhddddddddddhhhhyyyyyyyyyyyyyyyyysyyyyyyyyyyyssoooo+/-.````````````
//```.shhhhhddddddddhhhhhhyyyyyysssyssysyysssssyyyyyyyyyssssoo+:.````````````
//`ydddddddddddhhhhhhyyyysssssoooossssssssssssssssyyysysssso/-`````````````
//`ydddmmdddddhhhhhyysssooooo+++++ooooossssyssssssyyyyyyyyys+:.`````````````
///mdmdddddddhhhyysssoo++++//////+++++ooossyyyyyssyyyyyyyhyyo:.```````````` 
//-hdmdmdddhhhyyysso++/////:::///////++++oossyyyyyyyyyyyyyyyy+-`````````     
//ydmmmddhyyysssoo+//::::::::::::://////+++ooossssssssoooosyy+:````````      
//dmmddhhysoo++++///:::::---::-:::://///////++++++++o+++++sss+:```````       
//dddddhyso+/+++++//:::::::::::::::///////////////++++++++oso+/.`````````````
//dmmddhyso+oo+++///:::---:::::/::://///////////////+///+osso++.`````````````
//dmmmdhysssoo+//////:::://///:::////+///+///++++++++++++oyyo/+-`````````````
//yhhddhyssoo+++////////+oossssssoooo+//+o+osssssssooo+++oyyo///.````````````
//yhyyyyssoo+++++++///+oossyyyhyyyhys+//+syhhhhhhyso+++++oyy+/+/.`````....```
//sysssssso+++++++++ossssyyyssysssyso+///shyyhddddhyso+oooyy+++:.............
//ssoosysooo++++++++++////////++++ooo+::/osoooo++ooosysoooss+oo/-.....-------
//o++oyysooooo++//:///////+++++++++++/::/+oooo+o++++++++oosooso:-------------
//++++oo+osoooo++/::/://:::::://+++++/::/+++o++//////++++oo++o/--------------
//++++++ooossooo++///:/::::::://++o++/::/++o++///////++++ooo+/:--------------
//o+oo+osoossosooo++///::://///+syso//////oyo+///////++++oooo/---------------
//+o++++ooooooooooo+++///////+osyoo+/:////+syo+////+++ooooso+:---------------
//+ysso++oooooooooo++++////++osyysyhsoooossshyo++++++ooo++o+/-----------:::-:
//syhdhssyssoooooo++++++++++oo++osyyyyhyyhhyssso+++++ooo+++/-..--------------
//yyhdmssyssooooooo++++++++++////+++++ooooooooooo++++oo+++/-.......----------
//sysoyooossssssooo++++++++///////////+++++++++oo+++++o++-............-------
//sy+//++ooyyyysooo+++///++/++++++++++++o+oooo++o+++++++/..............------
//+s+/:o++oyyyyysooo++////+osssssoossssssssssso++///+++o:................----
//-/+ydh+oosyyyysoooo++//+++//++++++////++++++o+///+++o+................-----
//-/dNN/./ooyyyyyssooo++++++++ooossyyyyyyssoooo++++++oo-...............------
//sNMNd.`./ossyyyysssoo+++//++++++++++++ooooooo++ooooo-...............-------
//NNNNh.```:ossyyyyyssssoo+////++++/////++++++++oooss:................-------
//NNMNd.````-+osyyyhhyyyyyso+++++oo+++++++++++osssss:...................-----
//NNMNN:``````:osyyyhhhhhhyyysoooooooooooooossyhhy+-.......................--
//NNNNNy```````.:osyyyhhhhhhhhyyyyyyyyyyhhhyhhhdd:..........................-
//NNMMNm:`````````-+ssyyyyyhhhhhhhhhhdddhhhhhyoMMms:.........................
//NNMMMNh.``````````.:ossssyyhyyhhhhhhhyyyyyo--NMMNNds/-.....................
//NNMMMNNo.````````````.:+ossyyyyyyyyyyyys+-..-NMMMMNMMNdyo:-................