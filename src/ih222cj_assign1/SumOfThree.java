package ih222cj_assign1;

import java.util.*;
public class SumOfThree {

		public static void main(String[]args){
			 

			Scanner scan = new Scanner (System.in);
			
			char FirtsNummer, AndraNummer, TredjeNumer  ;
			
			System.out.print("Matta in ett nummer: ");
			String tal = scan.nextLine();
			
			char first = tal.charAt(0);
			char andra = tal.charAt(1);
			char tredje = tal.charAt(2);
			int firstaSiffra = Character.getNumericValue(first);
			int andraSiffra = Character.getNumericValue(andra);
			int tredjeSiffra = Character.getNumericValue(tredje);
			
				int summa = firstaSiffra + andraSiffra + tredjeSiffra ;
				
				System.out.println("Summa: "+ summa);
		}
}
				
	          
			