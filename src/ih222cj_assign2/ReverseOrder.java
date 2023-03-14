package ih222cj_assign2;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReverseOrder {
	public static void main(String[]args){
		ArrayList<Integer> gradeList = new ArrayList<Integer>(); 
			Scanner keyboard =new Scanner(System.in);
			System.out.println("Enter positive integers. End by giving a negative integer.");
			int counter =1;
			System.out.print("Integer "+counter+": ");
			
			double input = keyboard.nextInt();
			  
			while(input>= 0){
				counter++;
				System.out.print("Integer "+counter+": ");
				gradeList.add((int) input);
				input = keyboard.nextInt();
				
				
			}
		
		//int i=0;
		//int
			Collections.reverse(gradeList);
			System.out.println("Number of positive integers: " + counter);
			System.out.print("In reverse order: ");
			for(int i =0; i< gradeList.size();i++){
	        	
	        	
	        	System.out.print(gradeList.get(i) +"," + " ");
	        	
	        	
	        }
	}

}



