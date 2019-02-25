package test.java.practice.runwith;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

// can specify runner class by @RunWith
@RunWith(Theories.class)
public class DataPointSampleTest {
	@DataPoint	// for single test data
    public static String DATA_PARAM = "JAPAN";
	
	@Theory	// annotation for test  
	public void test(String param) {
		assertThat(param, is(DATA_PARAM));
	}
	
	@Theory	// annotation for test  
	public void test2(String param) {
		assertThat(param, is(DATA_PARAM));
	}
}
