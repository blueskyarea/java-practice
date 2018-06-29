package test.java.practice.mock.jmockit.example2;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import main.java.practice.mock.jmockit.example2.BirthMonth;
import mockit.Mocked;
import mockit.NonStrictExpectations;
import mockit.integration.junit4.JMockit;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JMockit.class)
public class BirthMonthTest {
	// Without mock
	@Test
	public void testGetBirthStoneWithoutMock() {
		BirthMonth birthMonth = new BirthMonth(2);
		assertThat(birthMonth.getBirthStone(2), is(nullValue()));
		assertThat(birthMonth.getBirthStone(7), is(nullValue()));
		assertThat(birthMonth.getBirthStone(11), is(nullValue()));
	}
	
	// With mock
	@Test
	public void testGetBirthStoneWithMock(@Mocked BirthMonth birthMonth) {
		new NonStrictExpectations() {
            {
            	birthMonth.getBirthStone(2);
            	result = "amethyst";
            	birthMonth.getBirthStone(7);
            	result = "ruby";
            	birthMonth.getBirthStone(11);
            	result = "topaz";
            	birthMonth.getBirthStone(anyInt);
            	result = "not found";
            }
		};
		
		// exception if not "NonStrictExpectations".
		assertThat(birthMonth.getBirthStone(5), is("not found"));
		
		assertThat(birthMonth.getBirthStone(2), is("amethyst"));
		assertThat(birthMonth.getBirthStone(7), is("ruby"));
		assertThat(birthMonth.getBirthStone(11), is("topaz"));
		assertThat(birthMonth.getBirthStone(20), is("not found"));
		
		// exception if not "NonStrictExpectations".
		assertThat(birthMonth.getBirthStone(30), is("not found"));
	}
}
