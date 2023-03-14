package ih222cj_assign2;
import java.util.*;
public class LargestK {
	
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int nStorst = 0, addPrev =0, sum;
		int number;
		
		
     System.out.print("Give any positive integer : ");		
     	    number = input.nextInt();
     	    int arr = 0;
     	    
     	    
	while(addPrev < number){
		

		    arr = arr+2;
		  nStorst = arr-2;
		  
		   addPrev = addPrev + arr;
		   
		  

	  
	}
		
		    
		    	System.out.println("The largest K such that 0+2+4+6+8+...+K < "+number+ " => K= "+nStorst);
		    
	  }
	 
		
	
	 }

	
	


