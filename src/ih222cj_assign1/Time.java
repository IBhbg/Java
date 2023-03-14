package ih222cj_assign1;
import java.util.*;
public class Time {
	
		public static void main(String[]args){
			
			
			Scanner input = new Scanner(System.in);
			
			  int sek,antaletTimmar,restSek, restMin;
			  final int konstant1 = 60, konstant2 = 60;
			  
			  
			  
			  System.out.print("Ange antalet sekunder: ");
			  sek = input.nextInt();
              restSek = (sek % konstant1);
              restMin = ((sek /konstant1)% konstant2);
             antaletTimmar = ((sek /konstant1)/ konstant2);
	         
	        
			  
 System.out.println("This corresponds to "+antaletTimmar+" Hours");
 System.out.print(" and "+restMin+ " Min "+ "and "+restSek+" Sek");

			  
			  
			  
			
			
		}

	}
