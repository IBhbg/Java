package ih222cj_assign1;

import java.text.DecimalFormat;
import java.util.*;
public class Convert {

	public static void main(String[] args) {
		// C = (F-32)*5/9
		DecimalFormat df = new DecimalFormat("#,##0.0");
		Scanner input = new Scanner(System.in);
		double C, F;
		System.out.print("temperature in Fahrenheit: ");
		F = input.nextDouble();
		
		C = (F-32)*5/9;
		
	  System.out.print("Correspond to : "+df.format(C)+ " Celsius");
		
		

	}

}

