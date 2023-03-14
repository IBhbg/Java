package ih222cj_assign2;

import java.util.Scanner;


public class Triangle {
public static void main(String[]args){
	
		Scanner mattain = new Scanner(System.in);
		int value,Rest;
		
      
		System.out.print("Mata in ett positivt udda heltal: ");
		value = mattain.nextInt();
		Rest = value%2;
		
		if (Rest == 1& value>=0){
		
		
		 System.out.println("Rätvinkel triangel");
         for (int w = 1; w <= value; w++)
         {
        	 for(int j=0; j<=value-w;j++) {

           System.out.print(" ");
        	 }
        	 
         for (int s= 1; s <= w; s++)
        	 
        	 
   	         System.out.print("*");
              System.out.println();

	
              }
         																									
		
		
		
		System.out.println();
		System.out.println("Likbent triangel");
		  // Likbent triangel
         for (int num = 1; num <= value; num++){
			
			for (int innum = 1; innum <= value-num; innum++)
				
                  System.out.print(" ");		
                  
               if ((2*num)-1 <= value)      
			
			 for (int innum = 1; innum <= ((2 * num)-1); innum++)
            	 
          	   System.out.print("*");
                 System.out.println();
		               
		      }
             
		}
		
		else 
			System.out.println("inte positiv udda helltal!");
		
            }

       }


		
		
		
		
		
		
		
		
		
		
		
		


	
	
	
	
	
	

