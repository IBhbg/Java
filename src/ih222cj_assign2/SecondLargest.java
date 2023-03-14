package ih222cj_assign2;

import java.util.*;
public class SecondLargest {
	
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		
		int nStorst = 0, Storst = 0;
		int numbers;
		
		
     System.out.println("Provide 10 integers:  ");		
     
	  for(int index = 0; index < 10; index++ ){
		
		    numbers = input.nextInt();
		    
		    	if(Storst < numbers){
		    		nStorst = Storst;
		    	   Storst = numbers;
			
                 	}
	  
	           if(nStorst < numbers && Storst != numbers)
	        	   nStorst = numbers;
	  }
	  
	         System.out.println("The second largest is : " + nStorst);
	}
}
