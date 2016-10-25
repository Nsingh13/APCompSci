package Assignment07;

import java.util.Scanner;

public class ISBN {
	 public static void main(String[] args)
	    {
		 int tot = 0 ;
		 int d;
		
		 Scanner in = new Scanner(System.in);
		 System.out.print("Enter the first 9 digits of an ISBN as integer:");
		 String ISBN = in.nextLine();
		 int [] dig = new int[ISBN.length()];
		 
		 
		 for(int i=0; i<ISBN.length(); i++){
			 dig[i]=Integer.valueOf(ISBN.substring(i, i+1));
		 }

		 for(int i=0; i<ISBN.length(); i++){
			tot = tot+dig[i]*(i+1);
			 
		
			
			 
		 }
		 System.out.print("The ISBN-10 number is ");
		 for(int i=0; i<ISBN.length(); i++){
			 System.out.print(dig[i]);
			
		 }
		 if(tot%11==10){
			 System.out.print("X"); 
		 }
		 else{
		 System.out.print(tot%11);
		 }
	    }
	

}
