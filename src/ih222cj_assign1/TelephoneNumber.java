package ih222cj_assign1;

import java.util.Random;
public class TelephoneNumber{

	public static void main(String[] args) {
	
		Random rand = new Random();
		System.out.print('0');
		int x1 = rand.nextInt(9);
		System.out.print(x1);
		int x2 = rand.nextInt(9);
		System.out.print(x2);
		int x3 = rand.nextInt(9);
		System.out.print(x3);
		System.out.print(" ");
		
		int z = rand.nextInt(9)+1;
		System.out.print(z);
		
		int Y1 = rand.nextInt(9);
		System.out.print(Y1);
		int Y2 = rand.nextInt(9);
		System.out.print(Y2);
		int Y3 = rand.nextInt(9);
		System.out.print(Y3);
		int Y4 = rand.nextInt(9);
		System.out.print(Y4);
		int Y5 = rand.nextInt(9);
		System.out.print(Y5);
	

	}

}
