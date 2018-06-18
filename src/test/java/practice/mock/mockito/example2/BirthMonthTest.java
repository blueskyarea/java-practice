package test.java.practice.mock.mockito.example2;

import static org.mockito.Mockito.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;
import main.java.practice.mock.mockito.example2.BirthMonth;

import org.junit.Test;

public class BirthMonthTest {
	@Test
	public void testGetBirthStoneWithoutMock() {
		BirthMonth birthMonth = new BirthMonth(2);
		assertThat(birthMonth.getBirthStone(2), is(nullValue()));
		assertThat(birthMonth.getBirthStone(7), is(nullValue()));
		assertThat(birthMonth.getBirthStone(11), is(nullValue()));
	}
	
	@Test
	public void testGetBirthStoneWithMock() {
		BirthMonth birthMonth = mock(BirthMonth.class);
		
		when(birthMonth.getBirthStone(anyInt())).thenReturn("not found");
		when(birthMonth.getBirthStone(2)).thenReturn("amethyst");
		when(birthMonth.getBirthStone(7)).thenReturn("ruby");
		when(birthMonth.getBirthStone(11)).thenReturn("topaz");
		
		assertThat(birthMonth.getBirthStone(5), is("not found"));
		assertThat(birthMonth.getBirthStone(2), is("amethyst"));
		assertThat(birthMonth.getBirthStone(7), is("ruby"));
		assertThat(birthMonth.getBirthStone(11), is("topaz"));
		assertThat(birthMonth.getBirthStone(20), is("not found"));
	}
}
