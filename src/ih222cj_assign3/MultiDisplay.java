package ih222cj_assign3;


public class MultiDisplay {
	private int displayCount;
	 private String str, skriv ;
	 
		public MultiDisplay()
		          {		       
			  
		          }	
		
	/**************************************************************************/	
		
		public void setDisplaymassage(String värde)
		{
			str = värde;
			
		}
		
	/**************************************************************************/
		public String setDisplayCount(int varde){
			       displayCount = varde;
		         for(int count = 1; count <= displayCount; count++ ){
					System.out.println(str);
				     }
			
			return str;
			
		}
		

	/**************************************************************************/
		public String display(String text, int num){
				
			for(int rakna =1; rakna <= num; rakna++){
				
				System.out.println(text);
				
			}
			     skriv = text;
				return text;
		
				

		}
	/**************************************************************************/	
		public String getDisplayMessage()
		{
			
		return skriv;
		}
	/**
	 * @return ************************************************************************/
		
		public  String toString(){
			String resultat = Integer.toString(displayCount);
			String tr = "";
			return tr;
			
			
		}


	}


