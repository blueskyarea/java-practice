package com.itstudy365.onpra.experiment.newstringmethods;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NewStringMethods 
{
    public static void main( String[] args )
    {	
    	// Nothing to do.
    }
    
    protected Stream<String> linesMethod(String multilineString) {
    	return multilineString.lines();
    }
    
    protected List<String> isBlankMethod(String multilineString) {
    	return multilineString.lines()
    			.filter(line -> !line.isBlank())
    			.collect(Collectors.toList());
    }
    
    protected List<String> stlipMethod(String multilineString) {
    	return multilineString.lines()
    			.filter(line -> !line.isBlank())
    			.map(String::strip)
    			.collect(Collectors.toList());
    }
    
    protected List<String> stlipLeadingMethod(String multilineString) {
    	return multilineString.lines()
    			.filter(line -> !line.isBlank())
    			.map(String::stripLeading)
    			.collect(Collectors.toList());
    }
    
    protected List<String> stlipTrailingMethod(String multilineString) {
    	return multilineString.lines()
    			.filter(line -> !line.isBlank())
    			.map(String::stripTrailing)
    			.collect(Collectors.toList());
    }
    
    protected String repeatMethod(String string) {
    	return string.repeat(11);
    }
}
