package com.itstudy365.onpra.experiment.notpredicate;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class NotPredicateMethodTest {

	@Test
	void testNotPredicateMethod() {
		List<String> stringListWithBlank = Arrays.asList("Java", "\n \n", "Kotlin", " ");
		List<String> stringListWithoutBlank = new NotPredicateMethod().notPredicateMethod(stringListWithBlank);
		assertThat(stringListWithoutBlank).containsExactly("Java", "Kotlin");
	}

}
