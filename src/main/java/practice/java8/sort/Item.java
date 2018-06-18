package main.java.practice.java8.sort;


public class Item {
	private String name;
	private Integer price;
	private Float reviewAve;
	private Integer reviewNum;

	public Item(String name, Integer price, Float reviewAve, Integer reviewNum) {
		this.name = name;
		this.price = price;
		this.reviewAve = reviewAve;
		this.reviewNum = reviewNum;
	}
	
	public String getName() {
		return name;
	}
	
	public Integer getPrice() {
		return price;
	}
	
	public Float getReviewAve() {
		return reviewAve;
	}
	
	public Integer getReviewNum() {
		return reviewNum;
	}
}
