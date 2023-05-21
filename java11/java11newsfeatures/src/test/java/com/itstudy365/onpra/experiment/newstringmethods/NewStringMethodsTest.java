package com.itstudy365.onpra.experiment.newstringmethods;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

class NewStringMethodsTest {

	@Test
	void testLinesMethod() {
		String multilineString = "LineA\n\nLineB\nLineC";
		Stream<String> lines = new NewStringMethods().linesMethod(multilineString);
		assertThat(lines).isInstanceOf(Stream.class);
	}
	
	@Test 
	void testIsBlankMethod() {
		String multilineString = "LineA\n\nLineB\nLineC";
		List<String> lines = new NewStringMethods().isBlankMethod(multilineString);
		assertThat(lines).containsExactly("LineA", "LineB", "LineC");
	}
	
	@Test
	void testStlipMethod() {
		String multilineString = " Java11 has \n \n some new \n features. ";
		List<String> lines = new NewStringMethods().stlipMethod(multilineString);
		assertThat(lines).containsExactly("Java11 has", "some new", "features.");
	}
	
	@Test
	void testStlipLeadingMethod() {
		String multilineString = " Java11 has \n \n some new \n features. ";
		List<String> lines = new NewStringMethods().stlipLeadingMethod(multilineString);
		assertThat(lines).containsExactly("Java11 has ", "some new ", "features. ");
	}
	
	@Test
	void testStlipTrailingMethod() {
		String multilineString = " Java11 has \n \n some new \n features. ";
		List<String> lines = new NewStringMethods().stlipTrailingMethod(multilineString);
		assertThat(lines).containsExactly(" Java11 has", " some new", " features.");
	}
	
	@Test
	void testRepeatMethod() {
		String string = "Java";
		String repeatedString = new NewStringMethods().repeatMethod(string);
		assertThat(repeatedString).isEqualTo("JavaJavaJavaJavaJavaJavaJavaJavaJavaJavaJava");
	}

}
