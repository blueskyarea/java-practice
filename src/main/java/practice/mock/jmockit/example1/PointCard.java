package main.java.practice.mock.jmockit.example1;

public class PointCard {
	private int cardNumber;
	private String memberName;
	private long point;
	
	public PointCard(int cardNumber, String memberName, long point) {
		this.cardNumber = cardNumber;
		this.memberName = memberName;
		this.point = point;
	}
	
	public int getCardNumber() {
		return cardNumber;
	}
	
	public String getMemberName() {
		return memberName;
	}
	
	public long getPoint() {
		return point;
	}
}
