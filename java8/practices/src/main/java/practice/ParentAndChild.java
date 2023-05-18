package practice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParentAndChild {
	
	public static void main(String[] args) {
		new ParentAndChild().execute();
	}
	
	public void execute() {
		Map<String, Integer> allMap = new HashMap<>();
		
		Map<String, Integer> map = new HashMap<>();
		map.put("aaaaa/bbbbb/ccccc", 10);
		map.put("aaaaa/bbbbb/ddddd", 20);
		map.put("aaaaa/eeeee", 20);
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String[] splitKeys = entry.getKey().split("/");
            for(String key : splitKeys) {
            	allMap.merge(key, entry.getValue(),
    			 (v1, v2) -> {
    				 return v1 + v2;
    			 });
            }
        }
		
		for (Map.Entry<String, Integer> entry2 : allMap.entrySet()) {
			System.out.println("key=" + entry2.getKey() + " value=" + entry2.getValue());
		}
		
		
		Node nodeA = new Node();
	}

	public class Node {
		public int id;
		public String name;
		public int units;
		public List<Node> nodes;
	}
}
