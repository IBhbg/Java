package ih222cj_assign3;


public class PointMain {

	
	public static void main(String[] args) {
		
		Point p1 = new Point();
	    Point p2 = new Point(3,4);
				
				
		System.out.println(p1.toString());                      
		System.out.println(p2.toString());
				
  
	/*	Point p1 = new Point(2,3);
		Point p2 = new Point(2,3);
		*/
		if(p1.IsEqualTo(p2))
			 System.out.println("The tow Strings are equal.");
		
		double dist = p1.distanceTo(p2);
	   System.out.println("Point distance: " + dist);
		/**/
		p2.move(5,-2);                                           
		p1.moveToXY(8,2);
		
		
				System.out.println(p1);
				System.out.println(p2);
				
				
				if(p1.IsEqualTo(p2))
					System.out.println("The tow Strings are equal.");



	}

}

