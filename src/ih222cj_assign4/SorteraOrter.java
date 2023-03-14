package ih222cj_assign4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class SorteraOrter {
	static Scanner scanner;
	static ArrayList<Orter> ortList;
	public static void main(String[] args) {
		File f = new File("textfil.txt");
		String line;
		String[] arr;
		ortList = new ArrayList<Orter>();
		try {
			scanner = new Scanner(f);
			while(scanner.hasNextLine()){
				line = scanner.nextLine();
				arr = line.split(" ");
				Orter ort = new Orter(arr[1], Integer.parseInt(arr[0]));
				ortList.add(ort);
			}
			Collections.sort(ortList);
			for(Orter ort: ortList){
				System.out.println(ort);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

