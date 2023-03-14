package ih222cj_assign4;


import java.util.*;
import java.io.*;
public class RacknaTecken {

	
	public static void main(String[] args) throws IOException{
		
		Scanner input = new Scanner(new File("text.txt"));
		int storBokstav = 0, litenBokstav = 0, whiteSpace = 0, OvrigaTecken = 0;
		  
      
		    

		while(input.hasNext()){
			
			String frad = input.nextLine();
		   int antaletChar = frad.length();

		   for(int i = 0; i < antaletChar; i++){
			   
		       char bokstav = frad.charAt(i);
		      
		       if(bokstav >= 65 && bokstav <= 90){
			   storBokstav++;
		       }
		       if (bokstav >= 97 && bokstav <= 122){
		    	   litenBokstav++;
		       }
		   
		         if(bokstav ==32 || bokstav == 0|| bokstav >= 7 && bokstav <=10 ||bokstav > 11 && bokstav <14 || bokstav == 27 || bokstav == 127) {
		        	 whiteSpace++;
		         }
		         
		         
		         if(bokstav >32 && bokstav < 65 || bokstav > 90 && bokstav < 97 || bokstav > 122 && bokstav < 127){
		        	 OvrigaTecken++;
		         
		         
		         }
		          
		}
		
		}
		
	System.out.println("Antal Stora bokstäver: " + storBokstav);
	System.out.println("Antalet små bokstäver: " + litenBokstav);
	System.out.println("Antalet \" Whitespace\": " + whiteSpace);
	System.out.println("Antal övriga tecken: " + OvrigaTecken);
	
}
}



