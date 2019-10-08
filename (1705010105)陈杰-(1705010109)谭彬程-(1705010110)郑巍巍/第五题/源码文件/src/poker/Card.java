package poker;

public class Card {
	private String suit;//花色
	private int rank;//点数
     public Card(String suit, String rank) {
         super();
         this.suit = suit;
 
         if(rank.equals("J")) {
             this.rank = 11;
         } else if(rank.equals("Q")) {
             this.rank = 12;
         } else if(rank.equals("K")) {
             this.rank = 13;
         } else if(rank.equals("A")) {
             this.rank = 14;
         } else {
             this.rank = Integer.parseInt(rank);
         }
     }
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
}
