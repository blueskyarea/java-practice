package com.itstudy365.onpra.experiment.localvariablesyntaxforlambda;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class LocalVariableSyntaxForLambdaTest {

	@Test
	void varKeywordInLambdaTest() {
		List<String> stringList = Arrays.asList("Java", "\n \n", "Kotlin", "");
		String upperString = new LocalVariableSyntaxForLambda().varKeywordInLambda(stringList);
		assertThat(upperString).isEqualTo("JAVA, \n \n, KOTLIN, ");
	}
	
	@Test
	void varKeywordWithNonNullAnnotationTest() {
		try {
			List<String> stringList = Arrays.asList("Java", "\n \n", "Kotlin", "", null);
			new LocalVariableSyntaxForLambda().varKeywordWithNonsNullAnnotation(stringList);
			fail();
		} catch (NullPointerException npe) {
			assertThat(npe.getMessage()).isEqualTo("Cannot invoke \"String.toUpperCase()\" because \"x\" is null");
		} catch (Exception e) {
			fail();
		}
	}

}
