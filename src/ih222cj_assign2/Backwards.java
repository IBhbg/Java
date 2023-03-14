package ih222cj_assign2;

import java.util.*;

public class Backwards{

	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Matta in en texterad: ");
			String tex = input.nextLine();
			
		    int längd = tex.length();
            int räkna =0;

            for (int i = 1; längd >= i; i++){
            	
            	while(räkna != i){
            		
            		char bokstav = tex.charAt(längd-i);
            		räkna ++;
            		
            		System.out.print(bokstav);
            		
            	          }
            	    }
            }
	}
            				
            		