package ih222cj_assign1;

import java.util.Scanner;

public class Citat {

	public static void main(String[]args){
		

		Scanner input = new Scanner(System.in);
		
		String r = " Skriv in en rad text: ";
		String b;
		
		System.out.print(r);
		b = input.nextLine();
		
		System.out.print("\" " + b + " \"");
		
	}
}
