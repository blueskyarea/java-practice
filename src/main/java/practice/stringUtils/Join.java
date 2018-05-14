package main.java.practice.stringUtils;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;

public class Join {
	public static void main(String[] args) {
		// array
		String[] array = {"a1", "b1", "c1"};
		String joined1 = StringUtils.join(array, ",");
		System.out.println(joined1);	// a1,b1,c1
		
		// list
		List<String> list = new ArrayList<String>();
		list.add("a2");
		list.add("b2");
		list.add("c2");
		String joined2 = StringUtils.join(list, ",");
		System.out.println(joined2);	// a2,b2,c2
	}
}
