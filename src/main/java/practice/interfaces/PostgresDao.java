package main.java.practice.interfaces;

import java.util.HashMap;
import java.util.Map;

public class PostgresDao implements Dao {
	
	@Override
	public Map<Integer, String> getAll() {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "postgres1");
		map.put(2, "postgres2");
		map.put(3, "postgres3");
		return map;
	}
}
