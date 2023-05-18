package practice.mock.mockito.example1;

public class Member {
	private int id;
	private String name;
	private PointCard pointCard;
	
	public Member(int id, String name) {
		this.id = id;
		this.name = name;
		this.pointCard = new PointCard(id, name,1000);
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public PointCard getPointCard() {
		return pointCard;
	}
}
