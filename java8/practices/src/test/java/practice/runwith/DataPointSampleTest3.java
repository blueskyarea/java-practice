package practice.runwith;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class DataPointSampleTest3 {
	@DataPoints	// for multi test data
	public static String[] DATA_PARAM_STR = { "JAPAN", "JAPANESE" };
	@DataPoints	// can specify different data type
	public static int[] DATA_PARAM_INT = { 3, 7 };
	
	private static int indexStr = 0;
	private static int indexInt = 0;
	
	@Theory
	public void testStr(String param) {
		System.out.println("test param=" + param);
		assertThat(param, is(DATA_PARAM_STR[indexStr++]));
	}
	
	@Theory
	public void testInt(int param) {
		System.out.println("test param=" + param);
		assertThat(param, is(DATA_PARAM_INT[indexInt++]));
	}
}
