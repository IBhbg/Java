package ih222cj_assign4.DrunkenWalker;

import java.util.Scanner;

public class DrunkenWalk {
	static Scanner scanner;
	public static void main(String[] args){
		scanner = new Scanner(System.in);
		System.out.println("Storlek");
		int storlek = scanner.nextInt();
		System.out.println("Max steg");

		int maxSteg = scanner.nextInt();
		System.out.println("Antal av promenat");

		int antalAvPromenat = scanner.nextInt();
		for(int i = 0; i< antalAvPromenat; i++){
			RandomWalk walk = new RandomWalk(storlek, maxSteg);
			walk.walk();
		}
		double procent = (double)antalAvPromenat/(double)RandomWalk.fell;
		System.out.println("Av " + antalAvPromenat+" onyktra personer, föll "+ RandomWalk.fell+" ("+procent+"%) i vattnet.");
		
	}
}

