package ih222cj_assign3;
public class PlayCardMain {
	static Deck deck;
	public static void main(String[] args){
		deck = new Deck();
		System.out.println(deck.size());
		System.out.println(deck.shuffle());
		for(int i = 0; i< 10; i++){
			System.out.println(deck.dealCard());
		}
		System.out.println(deck.size());
		System.out.println(deck.shuffle());
	}
}

