package ih222cj_assign2;

import java.util.Scanner;

public class CountA {
	public static void main(String[]args){
		
		Scanner scan = new Scanner (System.in);
		
		int count = 0, a = 0, A = 0;
		
		System.out.print("Matta in en texterad: ");
		String tal = scan.nextLine();
					
		int längd = tal.length();
          
		for (int i = 1; längd >= i; i++){
		 
			    while (count != i)
			                          {
                      
			    	    char ch = tal.charAt(count);
				
		            if (ch == 'A')
		             A++;
		            
		          if (ch == 'a')
			         a++;
			          
		          count++;
		      	
						               }
						
						}
					System.out.println("Antalet a: " + a);
					System.out.println("Antalet A: " + A);
					
					
					
					
					
					
					
				}
			}



