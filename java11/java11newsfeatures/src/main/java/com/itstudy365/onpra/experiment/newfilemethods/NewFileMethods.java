package com.itstudy365.onpra.experiment.newfilemethods;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class NewFileMethods {
	protected Path writeStringMethod(String text) throws IOException {
		Path tempDir =  FileSystems.getDefault().getPath("/tmp");
    	return Files.writeString(Files.createTempFile(tempDir, "demo", ".txt"), text);
    }
	
	protected String readStringMethod(String text) throws IOException {
		Path path = writeStringMethod(text);
		return Files.readString(path);
	}
}
