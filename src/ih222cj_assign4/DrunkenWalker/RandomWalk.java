package ih222cj_assign4.DrunkenWalker;


import java.util.Random;

public class RandomWalk {
	private int x = 0;
	private int y = 0;
	private int tagnaSteg  = 0;
	private int maxSteg;
	private int storlek;
	static int fell;
	public RandomWalk(int storlek, int maxSteg){
		this.storlek = storlek;
		this.maxSteg = maxSteg;
	}
	public String toString(){
		return x+"/"+y + " " + tagnaSteg + " steps taken.";
	}
	public void takeStep(){
		Random random = new Random();
		int riktning = random.nextInt(4);
		if(riktning == 1){
			x++;
		}else if(riktning ==0){
			x--;
		}else if(riktning == 2){
			y++;
		}else{
			y--;
		}		
		tagnaSteg++;
	}
	public boolean moreSteps(){
		if(tagnaSteg < maxSteg){
			return true;
		}
		return false;
	}
	public boolean inBounds(){
		if(x > storlek || y  > storlek || x < -storlek || y < -storlek){
			return false;
		}
		return true;
	}
	public void walk(){
		while(inBounds() && moreSteps()){
			takeStep();
		}
		System.out.println(this);
		if(!this.inBounds()){
			fell++;
		}
	}
}

