package sec03;

public class Card {

	private String cardName;
	
	public Card() {
		this("����");
	}
	
	
	public Card(String cardName) {
		this.cardName = cardName;
	}
	
	public void getCardName() {
		System.out.printf("ī���� %s�Դϴ�.\n", this.cardName);
	}
	
	public static void main(String[] args) {
		Card card1 = new Card();
		Card card2 = new Card("�Ｚ");
		
		card1.getCardName();
		card2.getCardName();
	}

}
