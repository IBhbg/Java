package ih222cj_assign3;


public class FractionMain {

	public static void main(String[] args) {
		Fraction fr = new Fraction(33,10);
		String ne = fr.add(1,0);
		System.out.println(ne);
		System.out.println();
		String ne1 = fr.subtract(2, 9);
		System.out.println(ne1);
		System.out.println(); 
		String ne2= fr.divide(10,1);
		System.out.println(ne2);
		System.out.println();
		System.out.println(fr.multiply(2,0));
		System.out.println(fr.toString());
		if(fr.isEqualTo(3, 10))
		System.out.println("they are equal");
		
		
		
		

	}

}
