package Assignment03;
/*
 * Sean Kelker
 * assignment 3 part 1
 * 8/25/16
 * 
 * 
 * 
 * 
 * 
 */
public class Assignment3Part1 {
	public static int year1 = 1900;
	public static int year2 = 2049;
	public static int currentYear = year1;
	public static int day = 1;
	public static int dayOfWeek = 2;
	public static int totalDays = (year2-year1)*365;
	public static int solutions = 0;
	public static int month = 1; 
	public static void main(String[] args){
		
		
		for(int i=0; i<totalDays; i++){
			
			if(month==1)
				January();
			if(month==2)
				February();
			if(month==3)
				March();
			if(month==4)
				April();
			if(month==5)
				May();
			if(month==6)
				June();
			if(month==7)
				July();
			if(month==8)
				August();
			if(month==9)
				September();
			if(month==10)
				October();
			if(month==11)
				November();
			if(month==12)
				December();
			if(dayOfWeek == 8)
				dayOfWeek = 1;
			
			//System.out.println(dayOfWeek);
			//System.out.println(day+ " " +dayOfWeek);
			if(dayOfWeek == 7 && day ==1){
				solutions++;
			
			}
			dayOfWeek++;
			day++;
		
		}
		System.out.println(solutions);
		
	}
	public static void January(){
		if(day == 32){
			day = 1;
			month++;
		}
		
	}
	public static void February(){
		 boolean leap;
		 if(currentYear%4 == 0)
			 leap = true;
		 else{
			 leap = false;
		 }
		
		if(day ==29 && leap == false){
			day = 1;
			month++;
		}
		if(day ==30 && leap == true){
			day = 1;
			month++;
			totalDays++;
		}
	}
	public static void March(){
		if(day == 32){
			day = 1;
			month++;
		}
	}
	public static void April(){
		if(day ==32){
			day = 1;
			month++;
		}
	}
	public static void May(){
		if(day ==32){
			day = 1;
			month++;
		}
	}
	public static void June(){
		if(day ==32){
			day = 1;
			month++;
		}
	}
	public static void July(){
		if(day ==32){
			day = 1;
			month++;
		}
	}
	public static void August(){
		if(day ==32){
			day = 1;
			month++;
		}
	}
	public static void September(){
		if(day == 31){
			day = 1;
			month++;
		}
	}
	public static void October(){
		if(day ==32){
			day = 1;
			month++;
		}
	}
	public static void November(){
		if(day ==31){
			day = 1;
			month++;
		}
	}
	public static void December(){
		if(day ==32){
			day = 1;
			month=1;
			currentYear++;
			
		}
	}

}
