package main.java.practice.interfaces;

import java.util.HashMap;
import java.util.Map;

public class MySqlDao implements Dao {

	@Override
	public Map<Integer, String> getAll() {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "mysql1");
		map.put(2, "mysql2");
		map.put(3, "mysql3");
		return map;
	}
}
