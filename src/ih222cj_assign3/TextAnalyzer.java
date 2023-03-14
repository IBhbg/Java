package ih222cj_assign3;

import java.util.ArrayList;

public class TextAnalyzer {

	private String writing;
	private char inget = 32,wara;
	public int[] list;
	private int StorBokstav = 0, siffraEtt,digCount=0,  rakna =0, raknaTva =0,raknaTre =0, antalWhitesp;
	
	
	
	public TextAnalyzer(String str){
		writing = str;
		
/*******************************************************************************************/
	}
	
     public int charCount(){
          ArrayList<Character> ch = new ArrayList<Character>(); 
    	  for(int i=0; i<=writing.length()-1;i++){
        	    char getch= writing.charAt(i);
        	    if(getch >= 32 && getch<= 127){
		          ch.add(getch);
        	    }
        	 			    	 
        	    
        	// rakna++;
          }
          int siz =ch.size();
		
		return siz;
     }
/*********************************************************************************************/    
	
    public int upperCaseCount(){
    	
   	 int längdTva = writing.length();
   	                        
   	         while(raknaTva < längdTva){
   	        	 
		        char sBokstav = writing.charAt(raknaTva);
		          if(sBokstav >= 65 && sBokstav <= 90)
			         StorBokstav++;
			          raknaTva++;
		 
   	                    }
   	      
   	         siffraEtt = StorBokstav;
		 return siffraEtt;

    }
  /*********************************************************************************************/  
    
    public int whitespaceCount(){
    	
    	int längdTre = writing.length();
    	while (raknaTre < längdTre){
    		char whitespace = writing.charAt(raknaTre);
    		if(whitespace == 32)
    			antalWhitesp++;
    		    
    		raknaTre++;
    		
    	}
    	
    	return antalWhitesp;
    	
    }
/*************************************************************************************************/
    
public int digitCount(){
	
	 int längdTva = writing.length();
        
        while(rakna < längdTva){
       	 
        char siffra = writing.charAt(rakna);
          if(siffra >= 48 && siffra<= 57)
	         digCount++;
	          rakna++;
 
                   }
     
      //  siffraEtt = StorBokstav;

	return digCount;
    }

public boolean containsChar(char c) {
 boolean statment =false; 
for(int j=0; j<writing.length();j++){
	if(c==writing.charAt(j)){
		statment=true;
	}
}

return statment;
}

public boolean containsString(String string) {
	/*
	ArrayList<Character> textSub = new ArrayList<Character>();
	ArrayList<Character> Text = new ArrayList<Character>();
	
	for(int g=0; g<string.length();g++){
		textSub.get(string.charAt(g));
	}
	for(int d=0; d<writing.length();d++){
		Text.get(string.charAt(d));
		
	}
	
	for(int z=0; z<writing.length();z++){
		if
	}
	*/
	boolean stt = false;
	if(writing.contains(string)){
		stt =true;
	}
	
	
	
	
	return stt;
}
}

