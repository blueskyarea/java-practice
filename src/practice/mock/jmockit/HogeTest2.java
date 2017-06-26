package practice.mock.jmockit;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;
import mockit.Expectations;
import mockit.Injectable;
import mockit.Tested;
import mockit.integration.junit4.JMockit;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JMockit.class)
public class HogeTest2 {
	@Tested private Hoge hogeTested;
	@Injectable private Foo foo;
	@Injectable private String name = "name";
	
	@Test
	public void testHogeFooIsMock() {
		assertThat(hogeTested.foo.methodString("mock"), nullValue());
		assertThat(hogeTested.foo.methodInteger(3), nullValue());
	}
	
	@Test
	public void testHogeMethodHasIntValue() {
		final int intValue = 10;
		new Expectations() {{
			foo.methodString(Integer.toString(intValue)); result = "return from methodString";
			foo.methodInteger(intValue); result = "return from methodInteger";
		}};
		
		assertThat(hogeTested.methodHoge(Integer.toString(intValue)), is("return from methodString,return from methodInteger,"));
	}
}
