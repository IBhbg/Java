package ih222cj_assign1;
import java.lang.Math;
import java.text.DecimalFormat;
import java.util.*;
public class Distance {

	public static void main(String[] args) {
		//distance = Sqrt( (x1-x2)^2 + (y1-y2)^2 )
		
		Scanner input = new Scanner(System.in) ;
		double x1, y1, x2=0, y2=0, Distance;
		System.out.print("coordinates X (x,y): ");
		x1 = input.nextDouble();
		System.out.print("coordinates Y (x,y): ");
		y1 = input.nextDouble();
		
		
		double dist = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
		DecimalFormat dtime = new DecimalFormat("0.000"); 


	
		        System.out.println(dtime.format(dist));

		
		
		//Distance
		//System.out.print("Distance: "+ dist.substring(.)); //Distance);
		
       		

		
	}

}
