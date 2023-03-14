package ih222cj_assign2;

public class FrequencyTable {

	public static void main(String[] args) {
		int Ett=0, Tva=0 , Tre=0 , Fyra=0 , Fem=0 , Sex=0;
		int counter=0;
	
		int [] arr = {1,2,3,4,5,6};
	    int B=0;

	    //while(counter <=1000){
		   for (int i =1; i <=1000; i++){
			   for(int j=1; j<=6;j++){
			   
			   B = (int) (Math.random() * 6) + 1;
			    
			 
			   if(arr[0]==B){
			   
				   Ett++;}
			   
			   if(arr[1]==B){
				   Tva++;}
				   
			    if(arr[2]==B){
				         Tre++;
				      }
			    if(arr[3]==B){
			         Fyra++;
			      }
			    if(arr[4]==B){
			         Fem++;
			      }
			    if(arr[5]==B){
			        Sex++;
			      }
			  
			   
		   //int summa = Ett+Tva+Tre+Fyra+Fem+Sex;
		  // if(summa == 6000){
			//   i=6;
		   //}
		   }
		   //}
		   //counter++;
		   
		   
		   

			}
	    System.out.println("Frequencies when rolling a dice 6000 times.");
	    System.out.println("1: "+Ett+ "\n"+"2: "+ Tva+"\n"+"3: "+Tre);
	    System.out.print("4: "+Fyra+ "\n"+"5: "+ Fem+"\n"+"6: "+Sex);
	}

}
