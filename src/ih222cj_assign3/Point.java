package ih222cj_assign3;


public class Point {

	private int b,h;
	private static int x;
	private static int y;
	private int nx;
	private int ny;
	int move;

	public Point(){
		x=0;
		y=0;
	}
	
	public Point(int b, int h) {
		//super();
		this.b = b;
		this.h = h;
		
	}

//************************************************************************************	
	/*public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + b;
		result = prime * result + h;
		return result;
	}
	*/

	public boolean IsEqualTo(Point obj) {
		return h==obj.h & b==obj.b ;
			
		/*if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (b != other.b)
			return false;
		if (h != other.h)
			return false;
		return true;
		*/
	}
//*****************************************************************************************
	public void move(int xk, int yk){
		
		nx=xk;
		ny=yk;
		if(nx < 0|| ny < 0){
		 b = nx + b;
		  h = ny + h;
		}
	}
/*****************************************************************************************/
		public void moveToXY(int xr, int yr){
		
			b =xr;
			h =yr;
			
			
		}
/**
 * @param p2 
 * @return ****************************************************************************************/
	public double distanceTo(Point tw){
	  
	    return Math.sqrt( (tw.b-x)*(tw.b-x) + (tw.h-y)*(tw.h-y)) ;

	
	}
		
//******************************************************************************************
		public String toString(){
			
			String dog1 ="("+b+","+ h+")";
			return dog1;
					
		}
	
	
}

