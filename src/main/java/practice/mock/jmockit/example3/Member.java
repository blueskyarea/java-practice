package main.java.practice.mock.jmockit.example3;

public class Member {
	private PointCard pointCard;
	
	public Member() {
		this.pointCard = new PointCard();
	}

	public String getMemberNameAndPoint() {
		return pointCard.getMemberName() + "_" + pointCard.getPoint();
	}
}
