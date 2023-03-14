package ih222cj_assign3;

import java.util.Scanner;

public class Pnr {
	
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("Matta in dit personnummer: ");
			String str = input.nextLine();
			
			System.out.println("Första del:");
			String FirPart = getFirstPart(str);
			System.out.println(FirPart);
			
			System.out.println();
			System.out.println("Andra del:");
			String andraPart = getSecondPart(str);
			System.out.println(andraPart);
		/**/
		/**/	
			if(isFemaleNumber(str)){
				System.out.println("personnumret är för en kvinna");
			}
			
			if(isMaleNumber(str)){
				System.out.println("personnumret är för en man");
			}
	    
			/**/
			System.out.println("Jämföra två Personnummer???");
				System.out.println("matta in Firsta pesonnr: ");
				String firstString = input.nextLine();
				System.out.println("matta in andra pesonnr: ");
				String andraString = input.nextLine();
			
			
			if(areEqual(firstString,andraString)){
			
			System.out.println("Both are equal!!");
			}
			else{
				System.out.println("They are not equal!");
			}
			
			
			}

		public static boolean areEqual(String m, String n){
			boolean status =true;
			int counter=0;
			char [] chm = new char[11];
			char [] chn = new char[11];

			while(counter<1){
			for(int i=0; i<11;i++){
				chm[i]= m.charAt(i);
				chn[i]= n.charAt(i);
				if(chm[i]==chn[i]){
					status=true;
				}
				else{
					status=false;
				     }
			               }
				counter++;
			}
			return status;
			
		}
		
		
		public static boolean isMaleNumber(String isMale){
			char chm= isMale.charAt(9);
			int me = Character.getNumericValue(chm);
			boolean state=false;
				if(me%2!=0){
					state=true;
				}
			
			
			
			
			return state;
		
		}
		
		
		
		public static boolean isFemaleNumber(String isFemale){
			char ch= isFemale.charAt(9);
			int ne = Character.getNumericValue(ch);
			boolean stat=false;
				if(ne%2==0){
					stat=true;
				}
			
			
			
			
			return stat;
			
		}
			

		
		
		public static String getSecondPart(String ar2){
		int counter=0;
			char [] chAray2 = new char[4];
				while(counter <1){
					chAray2[0]= ar2.charAt(7);
					chAray2[1]= ar2.charAt(8);
					chAray2[2]= ar2.charAt(9);
					chAray2[3]= ar2.charAt(10);
						
					   
					counter++;
				}
				String andra = new String(chAray2);
				
				
				return andra;
			}

		
		
		public static String getFirstPart(String ar){
		char [] chAray = new char[6];
			for(int i=0; i<6;i++){
				chAray[i]= ar.charAt(i);
				
			}
			String firt = new String(chAray);
			
			
			return firt;
		}

	}




