package Project0;

import java.util.Scanner;
/*  _________                       ____  __.     .__   __                 
 /   _____/ ____ _____    ____   |    |/ _|____ |  | |  | __ ___________ 
 \_____  \_/ __ \\__  \  /    \  |      <_/ __ \|  | |  |/ // __ \_  __ \
 /        \  ___/ / __ \|   |  \ |    |  \  ___/|  |_|    <\  ___/|  | \/
/_______  /\___  >____  /___|  / |____|__ \___  >____/__|_ \\___  >__|   
        \/     \/     \/     \/          \/   \/          \/    \/       
 * 	Organized code and managed continuity between code and paid respect to harambe 
 * 
 *      
     /""\    (\"   \|"  \  /" |  | "\     |"  |     /"     "| 
    /    \   |.\\   \    |(:  (__)  :)    ||  |    (: ______) 
   /' /\  \  |: \.   \\  | \/      \/     |:  |     \/    |   
  //  __'  \ |.  \    \. | //  __  \\      \  |___  // ___)_  
 /   /  \\  \|    \    \ |(:  (  )  :)    ( \_|:  \(:      "| 
(___/    \___)\___|\____\) \__|  |__/      \_______)\_______) 
     Wrote properties class and commented                     
 * 
 * ____  _     ____  _  ____  _____  _  ____  _        _____ ____  ____  ____  _  ____ 
/   _\/ \ /|/  __\/ \/ ___\/__ __\/ \/  _ \/ \  /|  /  __//  _ \/  __\/   _\/ \/  _ \
|  /  | |_|||  \/|| ||    \  / \  | || / \|| |\ ||  | |  _| / \||  \/||  /  | || / \|
|  \__| | |||    /| |\___ |  | |  | || |-||| | \||  | |_//| |-|||    /|  \_ | || |-||
\____/\_/ \|\_/\_\\_/\____/  \_/  \_/\_/ \|\_/  \|  \____\\_/ \|\_/\_\\____/\_/\_/ \|
                                                                                     
    Helped write properties
  
 * 
 * 
 *   o          o                 o       o       o                                                o         o                 o                           o  
 <|\        /|>               <|>     <|>     <|>                                              <|>       <|>               <|>                         <|> 
 / \\o    o// \               < >     < >     / >                                              < >       < >               < >                         / \ 
 \o/ v\  /v \o/     o__ __o/   |       |      \o__ __o      o__  __o    o              o        |         |     o__  __o    |      _\o____  o__  __o   \o/ 
  |   <\/>   |     /v     |    o__/_   o__/_   |     v\    /v      |>  <|>            <|>       o__/_ _\__o    /v      |>   o__/_      /   /v      |>   |  
 / \        / \   />     / \   |       |      / \     <\  />      //   < >            < >       |         |   />      //    |        o/   />      //   / \ 
 \o/        \o/   \      \o/   |       |      \o/     o/  \o    o/      \o    o/\o    o/       <o>       <o>  \o    o/      |       /v    \o    o/     \o/ 
  |          |     o      |    o       o       |     <|    v\  /v __o    v\  /v  v\  /v         |         |    v\  /v __o   o      />      v\  /v __o   |  
 / \        / \    <\__  / \   <\__    <\__   / \    / \    <\/> __/>     <\/>    <\/>         / \       / \    <\/> __/>   <\__   \>__o__  <\/> __/>  / \ 
                                                                                                                                        \                  
	Wrote the  solver class and runner                                                                                                                                                   
                                                                                                                                                           

 */
public class Runner 
{
	public static void main(String[] args) 
	{

		double girth, length, width, height, weight;
		boolean weightPass,sizePass;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the post office enter all the data about your package");
		System.out.println("Enter length: ");
		
		//This statement take in length and checks that the input is valid 
		if(input.hasNextDouble()){
			length = input.nextDouble();
			
		}
		else{
			System.out.println("Try Again");
			System.exit(0);
			length = input.nextDouble();
		}
		
		if(length<=0){
			System.out.println("Your package defies modern physics and we cant send it");
			System.exit(0);
		}
		
		
		
		System.out.println("Enter width: ");
		
		//This statement take in width and checks that the input is valid    
		

		if(input.hasNextDouble()){
			width = input.nextDouble();
			
		}
		else{
			System.out.println("Try Again");
			System.exit(0);
			width = input.nextDouble();
		}
		
		if(width<=0){
			System.out.println("Your package defies modern physics and we cand send it");
			System.exit(0);
		}
		

		
		System.out.println("Enter height: ");
		
		//This statement take in height and checks that the input is valid 
		
		if(input.hasNextDouble()){
			height = input.nextDouble();
			
		}
		else{
			System.out.println("Try Again");
			System.exit(0);
			height = input.nextDouble();
		}
		if(height<=0){
			System.out.println("Your package defies modern physics and we cand send it");
			System.exit(0);
		}
		
		
		System.out.println("Enter weight: ");
		
		//This statement take in weight and checks that the input is valid 
		
		
		if(input.hasNextDouble()){
			weight = input.nextDouble();
			
		}
		else{
			System.out.println("Try Again");
			System.exit(0);
			weight = input.nextDouble();
		}
		if(weight<=0){
			System.out.println("Your package defies modern physics and we cand send it");
			System.exit(0);
		}
		
		
		// This creates and object pkg which is the package and passes it to properties 
		Properties pkg = new Properties(length, width, height, weight);
		
		//This sets girth to the value calculated in properties
		girth = pkg.getGirth();
		
		//This pass which passes the properties of the package to the solver class
		Solver pass = new Solver(length, girth, weight);
		
		//This makes sure if the packages passes the criteria 
		weightPass = pass.weightPass();
		sizePass = pass.sizePass();
		
		
		//This say what to print if the package does not pass
		if(sizePass==false&&weightPass==false)
		{
			System.out.println("Your package is too big and overweight it needs to hit the gym");
		}
		
		
		else if(weightPass==false)
		{
			System.out.println("Your package is overweight it needs to hit the gym");
		}
		
		
		else if(sizePass==false)
		{
			System.out.println("Your package is too big Kek");
		}
		
		//This say what to print if the package  passes the test0\
		if(sizePass==true&&weightPass==true)
		{
			System.out.println("Your package is good enough to send");
		}
	}
}
