package practice.runwith;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class DataPointSampleTest2 {
	@DataPoints	// for multi test data
	public static String[] DATA_PARAM = { "JAPAN", "JAPANESE" };
	
	private static int index = 0;
	
	@Theory
	public void test(String param) {
		System.out.println("test param=" + param);
		assertThat(param, is(DATA_PARAM[index++]));
	}
}
