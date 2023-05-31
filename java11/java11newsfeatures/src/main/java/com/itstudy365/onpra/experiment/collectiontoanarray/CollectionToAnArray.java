package com.itstudy365.onpra.experiment.collectiontoanarray;

import java.util.Arrays;
import java.util.List;

public class CollectionToAnArray {
	protected String[] toArrayMethod(String... strings) {
		List<String> sampleList = Arrays.asList(strings);
		return sampleList.toArray(String[]::new);
	}
}
