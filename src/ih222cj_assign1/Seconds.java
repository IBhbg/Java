package ih222cj_assign1;

import java.util.*;
public class Seconds{
	
	public static void main(String[]args){
		
		
		Scanner input = new Scanner(System.in);
		
		  int sek, min, tim, antaletSek;
		  final int konstant1 = 60, konstant2 = 60;
		  
		  System.out.print("Ange antalet timmar: ");
		  tim = input.nextInt();
		  
		  System.out.print("Ange antalet minuter: ");
		  min = input.nextInt();
		  
		
		  System.out.print("Ange antalet sekunder: ");
		  sek = input.nextInt();


 antaletSek = (tim * konstant1* konstant2) + (min*konstant1) + sek;
		  
		  
		  System.out.println(tim + " och " + min+ " och "+ sek+ " är totalt = " + antaletSek + " sekunder");
		  
		 
		  
		  
		  
		  
		  
		  
		  
		
		
	}

}
