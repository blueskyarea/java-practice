package com.itstudy365.onpra.experiment.newfilemethods;

import static org.assertj.core.api.Assertions.assertThat;
import java.io.IOException;
import java.nio.file.Path;

import org.junit.jupiter.api.Test;

class NewFileMethodsTest {

	@Test
	void testWriteStringMethod() throws IOException {
		Path path = new NewFileMethods().writeStringMethod("Sample text");
		assertThat(path.toString()).startsWith("/tmp");
	}

	@Test
	void testReadStringMethod() throws IOException {
		String fileContent = new NewFileMethods().readStringMethod("This is a sample text");
		assertThat(fileContent).isEqualTo("This is a sample text");
	}
}
