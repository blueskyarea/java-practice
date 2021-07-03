package practice.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingBy {

	public static void main(String[] args) {
		new GroupingBy().start();
	}
	
	public GroupingBy() {
	}
	
	public void start() {
		Item itemA_1 = new Item("itemA", 900);
		Item itemA_2 = new Item("itemA", 100);
		Item itemA_3 = new Item("itemA", 300);
		Item itemB_1 = new Item("itemB", 500);
		
		List<Item> itemList = new ArrayList<>();
		itemList.add(itemA_1);
		itemList.add(itemA_2);
		itemList.add(itemA_3);
		itemList.add(itemB_1);
		
		Map<String, List<Item>> mapList= itemList.stream()
				.collect(Collectors.groupingBy(Item::getName));
		
		List<Item> newItemList = new ArrayList<>();
		mapList.keySet().stream().forEach(key -> {
			Item newItem = new Item(key, 0);
			mapList.get(key).stream().forEach(item -> newItem.addSales(item.sales));
			newItemList.add(newItem);
		});
		
		newItemList.forEach(item -> {
			String itemName = item.name;
			Integer sales = item.sales;
			System.out.println("name:" + itemName + " sales:" + sales);
		});
	}
	
	public class Item {
		private String name;
		private Integer sales;
		
		public Item(String name, Integer sales) {
			this.name = name;
			this.sales = sales;
		}
		
		public String getName() {
			return name;
		}
		
		public Integer getSales() {
			return sales;
		}
		
		public void addSales(Integer additional) {
			this.sales = this.sales + additional;
		}
	}
}
