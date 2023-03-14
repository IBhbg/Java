package ih222cj_assign3;


public class MultiDisplayMain {
public static void main(String[]args){
		
		MultiDisplay md = new MultiDisplay();
		
		md.setDisplaymassage("Hello World!");
		md.setDisplayCount(3);
		md.display("Goodbye cruel world !", 2);
		System.out.println("Current Message: "+ md.getDisplayMessage());
		
		
	}

}

