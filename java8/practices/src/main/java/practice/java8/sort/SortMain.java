package practice.java8.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class SortMain {
	
	private Map<SortCondition, Comparator<Item>> comparatorMap = new HashMap<>();
	
	public SortMain() {
		this.comparatorMap.put(new SortCondition("reviewAve", Direction.ASC), Comparator.comparing(Item::getReviewAve));
		this.comparatorMap.put(new SortCondition("reviewAve", Direction.DESC), Comparator.comparing(Item::getReviewAve).reversed());
		this.comparatorMap.put(new SortCondition("reviewNum", Direction.ASC), Comparator.comparing(Item::getReviewNum));
		this.comparatorMap.put(new SortCondition("reviewNum", Direction.DESC), Comparator.comparing(Item::getReviewNum).reversed());
	}

	public static void main(String[] args) {
		// Item("name", "price", "reviewAve", "reviewNum")
		Item itemA = new Item("itemA", 1000, 3.3f, 100);
		Item itemB = new Item("itemB", 2000, 4.5f, 20);
		Item itemC = new Item("itemC", 3000, 4.5f, 10);
		
		List<Item> items = Arrays.asList(itemA, itemB, itemC);
		
		// static sort condition		
		System.out.println("sort by price desc");
		items.sort(Comparator.comparing(Item::getPrice).reversed());
		items.forEach(item -> System.out.println(item.getName()));
		
		// dynamic sort condition
		new SortMain().sort(items);
	}
	
	private List<SortCondition> getSortCondition(String[] args) {
		List<SortCondition> sortConditions = new ArrayList<>();
		for (int i = 0; i < args.length; i++) {
			String[] condition = args[i].split(":", 0);
			sortConditions.add(new SortCondition(condition[0], Direction.valueOf(condition[1])));
		}
		return sortConditions;
	}
	
	private void sort(List<Item> items) {
		String[] args = {"reviewAve:DESC", "reviewNum:DESC"};
		List<SortCondition> sortConditions = getSortCondition(args);
		Comparator<Item> dynamicComparator = comparatorBuilder(sortConditions);
		
		System.out.println("sort by dynamic condition");
		items.sort(dynamicComparator);
		items.forEach(item -> System.out.println(item.getName()));
	}
	
	private Comparator<Item> comparatorBuilder(List<SortCondition> conditions) {
		Comparator<Item> dynamicComparator = this.comparatorMap.get(conditions.get(0));
		for (int i = 1; i < conditions.size(); i++) {
			dynamicComparator = dynamicComparator.thenComparing(this.comparatorMap.get(conditions.get(i)));
		}
		return dynamicComparator;
	}
	

	public final class SortCondition {
	    private final String field;
	    private final Direction direction;
	    
	    public SortCondition(String field, Direction direction) {
	    	this.field = field;
	    	this.direction = direction;
	    }
	    
	    @Override
	    public boolean equals(Object obj) {
	        if (obj instanceof SortCondition) {
	            SortCondition condition = (SortCondition) obj;
	            return this.field.equals(condition.field) && this.direction.equals(condition.direction);
	        } else {
	            return false;
	        }
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(field, direction);
	    }
	}
	
	protected enum Direction {
		ASC,
		DESC;
	}
}
