package ih222cj_assign2;

import java.util.Random;
import java.util.Scanner;

public class HighLow {
	
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		
		int slut = 0, count = 1;
		int ettTal = generator.nextInt(100)+1;
			
		
			
		 while (slut <= 8){
		   slut++;
		   count++;
		   System.out.print("Gisning " + slut+":");
            int gissa1 = input.nextInt();
 
        	   
           if ( gissa1 == ettTal)
				 System.out.println("R‰tt svar efter bara "+ slut+ " gissningar- StrÂlande");
	               
            if (gissa1 < ettTal) {
		 
		              System.out.println("LedtrÂd: hˆgre");
	 
	                      }
	       
	        if(gissa1 > ettTal)
	              System.out.println("LedtrÂd: l‰gre");
	        
	         if (count == 10)
	        	 System.out.print("Gissning " + count + ": ");
		          }
		 
		    
		
		 
		 int gissa2 = input.nextInt();
	        if( count == 10 ){
	        	if( gissa2 == ettTal)
	        		System.out.println("R‰tt svar pÂ sista fˆrsˆket");
	        	if(gissa2 != ettTal)
	        		System.out.println("Du misslyckades pÂ alla fˆrsˆk");
            
            
	                 }

                        }	
		
}
