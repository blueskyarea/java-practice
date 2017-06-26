package practice.mock.jmockit;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import mockit.Expectations;
import mockit.Injectable;
import mockit.Mocked;
import mockit.NonStrictExpectations;
import mockit.Tested;
import mockit.integration.junit4.JMockit;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JMockit.class)
public class HogeTest {
	
	// To specify as class value, every test can get the mock.
	@Mocked private Hoge hogeMock;
	
	@Test
	public void testLocalValueBecomeMockFromClassValue() {
		Hoge hoge = new Hoge();
		assertThat(hoge.methodHoge(), nullValue());
	}
	
	@Test
	public void testLocalValueBecomeMockFromClassValue2() {
		assertThat(hogeMock.methodHoge(), nullValue());
	}
	
	@Test
	public void testLocalValueBecomeMockFromArg(@Mocked Hoge hogeMock) {
		Hoge hoge = new Hoge();
		assertThat(hoge.methodHoge(), nullValue());
	}
	
	@Test
	public void testExpectations() {
		new Expectations() {{
			hogeMock.methodHoge();
			hogeMock.methodHoge("hoge");
		}};
		
		// the order should be same with Expectations.
		assertThat(hogeMock.methodHoge(), nullValue());
		assertThat(hogeMock.methodHoge("hoge"), nullValue());
	}
	
	@Test
	public void testExpectationsWithReturnValue() {
		new Expectations() {{
			hogeMock.methodHoge(); result = "called without arguments.";
			hogeMock.methodHoge("hoge"); result = "called with arguments";
		}};
	
		assertThat(hogeMock.methodHoge(), is("called without arguments."));
		assertThat(hogeMock.methodHoge("hoge"), is("called with arguments"));
	}
	
	@Test
	public void testNonStrictExpectations() {
		new NonStrictExpectations() {{
			hogeMock.methodHoge(anyString); result = "stub returns value";
		}};
		
		// To specify "anyString", always returns same value.
		assertThat(hogeMock.methodHoge("hoge"), is("stub returns value"));
		assertThat(hogeMock.methodHoge("mock"), is("stub returns value"));
		assertThat(hogeMock.methodHoge("always"), is("stub returns value"));
	}
}
