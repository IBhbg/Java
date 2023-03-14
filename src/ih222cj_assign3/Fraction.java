package ih222cj_assign3;
/*
* tälare == numerator
* nämnare == dominator
*  T/N där T (täljaren) och N (nämnaren)
*/
public class Fraction {
	public int T=0, N=0;

	public Fraction(int t, int n) {
		T=t;
		N=n;
		
	}
	public int getNumerator(){
		
		return T;
	}
	
	public int getDenominator(){
		
		return N;
	}
	public boolean isNegative(){
		boolean stat = false;
		if(T<=0 || N<=0){
			stat=true;
		}
		return stat;
	}
	public String add(int tn, int nn){
		String str;
		if(nn==0){
			str = "Nämnare får int var anoll";
		}
		else{
		int teljare = (T*nn)+(tn*N);
		int nemnare = (N*nn);
		/*
		 * T/N
		 * tn/nn
		 * nyBrak = T/N + tn/nn
		 *  = (T*nn)/(N*nn) + (tn*N)/(nn*N)
		 *  =  [(T*nn)+(tn*N)]/[(N*nn)]
		 *  
		 */
		String telj = Integer.toString(teljare);
		String nem = Integer.toString(nemnare);
       
		str = telj +"/"+ nem ;
		}
		return str;
	}
	
	public String subtract(int tn, int nn){
		String str;
		if(nn==0){
			str = "Nämnare får int var anoll";
		}
		else{
	int teljare = (T*nn)-(tn*N);
	int nemnare = (N*nn);
	
	/*
		 * T/N
		 * tn/nn
		 * nyBrak = T/N - tn/nn
		 *  = (T*nn)/(N*nn) - (tn*N)/(nn*N)
		 *  =  [(T*nn)-(tn*N)]/[(N*nn)]
		 *  
		 */
	String telj = Integer.toString(teljare);
	String nem = Integer.toString(nemnare);
	 str = telj +"/"+ nem;
		}
		return str;
	}
	
	public String divide(int tn, int nn){
		String str;
		if(nn==0){
			str = "Nämnare får int var anoll";
		}
		else{
	int teljare = (T*nn);
	int nemnare = (N*tn);
	
      	/*
		 * T/N
		 * tn/nn
		 * nyBrak = (T/N) / (tn/nn)
		 *  =   T/N * nn/tn
		 *  =  T*nn/N*tn
		 *  
		 */
	String telj = Integer.toString(teljare);
	String nem = Integer.toString(nemnare);
	 str = telj +"/"+ nem;
		}
		return str;
	}
	public String multiply(int tn, int nn){
		String str;
		if(nn==0){
			str = "Nämnare får int var anoll";
		}
		else{
	int teljare = (T*tn);
	int nemnare = (N*nn);
	
      	/*
		 * T/N
		 * tn/nn
		 * nyBrak = (T/N) * (tn/nn)
		 *  =   T/N * nn/tn
		 *  =  T*tn/N*nn
		 *  
		 */
	String telj = Integer.toString(teljare);
	String nem = Integer.toString(nemnare);
	 str = telj +"/"+ nem;
		}
		return str;
		
		
		
		
	}
	
	public boolean isEqualTo(int tn, int nn){
		boolean stat=false;
		if(tn==T & nn==N){
			stat=true;
		}
		
		return stat;
	}
	
	public String toString(){
		int teljare = (T);
		int nemnare = (N);
		String str;
		String telj = Integer.toString(teljare);
		String nem = Integer.toString(nemnare);
		 str = telj +"/"+ nem;
			
			return str;
			
	}
	
	

}

