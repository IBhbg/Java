package ih222cj_assign3;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	private ArrayList<Card> cardList ;

	public Deck() {
		cardList = new ArrayList<Card>();
		Card c;
		for (Rank rank : Rank.values()) {
			for (Suit suit : Suit.values()) {
				c = new Card(rank, suit);
				cardList.add(c);
			}
		}
	}

	public boolean shuffle() {
		if (cardList.size() == 52) {
			Collections.shuffle(cardList);
			return true;
		}
		return false;
	}

	public Card dealCard() {
		if (cardList.size() != 0) {
			Card c = cardList.get(cardList.size() - 1);
			cardList.remove(c);
			return c;
		}
		return null;

	}
	public int size(){
		return cardList.size();
	}
}
