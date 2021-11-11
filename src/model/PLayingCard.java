package model;

public class PLayingCard {
	
	Rank rank;
	Suit suit;
	boolean faceUp;
	
	public PLayingCard (Rank r , Suit s) {
		rank = r;
		suit = s;
		faceUp = false;
	}
	
	public boolean isFaceUp() {
		return faceUp;
	}

	public void setFaceUp(boolean faceUp) {
		this.faceUp = faceUp;
	}

	public Rank getRank() {
		return rank;
	}
	
	public Suit getSuit() {
		return suit;
	}

}
