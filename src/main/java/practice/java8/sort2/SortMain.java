package main.java.practice.java8.sort2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortMain {

	public static void main(String[] args) {
		new SortMain().start();
	}
	
	private void start() {
		Member ryu = new Member("ryu", 170);
		Member ken = new Member("ken", 180);
		Member guile = new Member("guile", 175);
		Member chunLi = new Member("chun-Li", 165);
		
		List<Member> members = new ArrayList<Member>(){
			{
				add(ryu);
				add(ken);
				add(guile);
				add(chunLi);
			}
		};
		//members.stream().sorted((member1, member2) -> member2.height - member1.height).forEach(m -> {
		//	System.out.println("name: " + m.name + " height: " + m.height);
		//});
		
		List<Member> members2 = members.stream().sorted((member1, member2) -> member2.height - member1.height).collect(Collectors.toList());
		
		members2.forEach(m -> System.out.println("name: " + m.name + " height: " + m.height));
		
		members2.get(0).name = "honda";
		System.out.println("-----");
		members2.stream().sorted((member1, member2) -> member2.height - member1.height).forEach(m -> {
			System.out.println("name: " + m.name + " height: " + m.height);
		});
	}

}
