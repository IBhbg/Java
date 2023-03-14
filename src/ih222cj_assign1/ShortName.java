package ih222cj_assign1;
import java.util.*;
public class ShortName {
	



			public static void main(String[]args){
				
				Scanner input = new Scanner(System.in);
				
				String fˆrnamn, efternamn;
				
				System.out.print("first namn: ");
				fˆrnamn = input.nextLine();
				char FirstaChar = fˆrnamn.charAt(0);
				System.out.print("Last name: ");
				efternamn = input.nextLine();
				
				 System.out.println("Short name: " +FirstaChar +"."+ " "+ efternamn.substring(0,4));
				
				
				
			}

		}