package practice.mock.mockito.example3;

public class Member {
	private PointCard pointCard;
	
	public Member() {
		this.pointCard = new PointCard();
	}

	public String getMemberNameAndPoint() {
		return pointCard.getMemberName() + "_" + pointCard.getPoint();
	}
}
