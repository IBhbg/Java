package ih222cj_assign1;

import java.util.Scanner;
import java.text.DecimalFormat;
public class BMI {
	
  public static void main(String []args){
	  
	  
	  Scanner in = new Scanner (System.in);
	  
	  float a, b;
	  float BMI;
	  
	  System.out.print("Ange din lÄngd i meter: ");
	  a = in.nextFloat();
	  
	  
	  System.out.print("Ange din vikt i Kilogram: ");
	  b = in.nextFloat();
	  
	  
	  BMI = b/(a*a);
			  
	  DecimalFormat fmt = new DecimalFormat("0");
	  
	 System.out.print("Ditt BMI Är: " + fmt.format(BMI));		  
		  
	  
	  
	  }
	

}