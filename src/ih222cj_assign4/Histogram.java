package ih222cj_assign4;

import java.util.*;
import java.io.*;
public class Histogram{
	static File le;
		public static void main(String [] args) {
			ArrayList<Integer> list =new ArrayList<Integer>();
			int others=0;
			int firstRange=0,secondRange=0,thirdRange=0,forthRange=0,fifthRange=0, tenthRange = 0, sixthRange=0, siventhRange=0, attaRange=0, ninthRange=0;
			//StringBuilder text = new StringBuilder ();
	try {// Las text fran l
	le = new File("SkapaFil.txt");
	Scanner scan = new Scanner(le );
	while (scan.hasNext()) {
	String str = scan.next();
	String [] qr = str.split(",");
	for(String s : qr){
		
		
		int i = Integer.parseInt(s);
		if(i<101 & i>1){
			list.add(i);
		}
		else{
			others++;
		}
		
		
	}
	
	
	
	
	
	
	}
	} catch (IOException e){
	e. printStackTrace (); // Felutskift och exekveringsavslut
	}
	System.out.println("Läser heltal från filen: " + le);
	System.out.println("Antal i intervallet [1,100]: " + list.size());
	System.out.println("Övriga: " + others);
	for(int i=0; i< list.size()-1; i++){
		//System.out.println(list.get(i));
		if(list.get(i)>=1 & list.get(i)<=10){
			firstRange++;
		}
		if(list.get(i)>=11 & list.get(i)<=20){
			secondRange++;
		}
		if(list.get(i)>=21 &list.get(i)<=30){
			thirdRange++;
		}
		if(list.get(i)>=31 &list.get(i)<=40){
			forthRange++;
		}
		if(list.get(i)>=41 &list.get(i)<=50){
			fifthRange++;
		}
		if(list.get(i)>=51 &list.get(i)<=60){
			sixthRange++;
		}
		if(list.get(i)>=61 &list.get(i)<=70){
			siventhRange++;
		}
		if(list.get(i)>=71 &list.get(i)<=80){
			attaRange++;
		}
		if(list.get(i)>=81 &list.get(i)<=90){
			ninthRange++;
		}
		if(list.get(i)>=91 &list.get(i)<=100){
			tenthRange++;
		}
		
	}
	
	System.out.print("1-10| ");
	for(int i=0; i<firstRange;i++){
		System.out.print("*");
	}
	System.out.println();
	
	System.out.print("11-20| ");
	for(int i=0; i<secondRange;i++){
		System.out.print("*");
	}
	
	System.out.println();
	System.out.print("21-30| ");
	for(int i=0; i<thirdRange;i++){
		System.out.print("*");
	}
	System.out.println();	
	System.out.print("31-40| ");
	for(int i=0; i<forthRange;i++){
		System.out.print("*");
	}
	System.out.println();
	System.out.print("41-50| ");
	for(int i=0; i<fifthRange;i++){
		System.out.print("*");
	}
	System.out.println();
	System.out.print("51-60| ");
	for(int i=0; i<sixthRange;i++){
		System.out.print("*");
	}
	System.out.println();
	
	System.out.print("61-70| ");
	for(int i=0; i<siventhRange;i++){
		System.out.print("*");
	}
	System.out.println();
	System.out.print("71-80| ");
	for(int i=0; i<attaRange;i++){
		System.out.print("*");
	}
	System.out.println();
	System.out.print("81-90| ");
	for(int i=0; i<ninthRange;i++){
		System.out.print("*");
	}
	System.out.println();
	System.out.print("91-100| ");
	for(int i=0; i<tenthRange;i++){
		System.out.print("*");
	}
	System.out.println();

}
}
