package Assignment05;

import java.math.BigDecimal;

public class Assignmnet5Challenge {
	public static void main(String[] args) {
		
	double num = 232792560; 
	boolean x = false;
	while(x==false){
		for(int i=1; i<=20; i++){
			
			
			if(num%i>0){
				num++;
				i = 1;
				
			}
		
	}
		x= true;
		BigDecimal sol = new BigDecimal(num);
		System.out.println(sol);
	}
	
	
	
}
}
