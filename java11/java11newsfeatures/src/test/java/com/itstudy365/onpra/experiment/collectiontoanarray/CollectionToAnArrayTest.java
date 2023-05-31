package com.itstudy365.onpra.experiment.collectiontoanarray;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class CollectionToAnArrayTest {

	@Test
	void testCollectionToAnArray() {
		String[] sampleArray = new CollectionToAnArray().toArrayMethod("Java", "Kotlin");
		assertThat(sampleArray).containsExactly("Java", "Kotlin");
	}

}
