package practice.mock.mockito.whiteBox;

import static org.junit.Assert.*;
import practice.mock.mockito.whiteBox.WhiteBoxExample;

import org.junit.Test;
import org.mockito.internal.util.reflection.Whitebox;

/**
 * Mock private field
 */
public class WhiteBoxExampleTest {

	@Test
	public void testWithoutWhiteBox() {
		WhiteBoxExample wb = new WhiteBoxExample();
		assertTrue(wb.getMessage().equals("This is example."));
	}

	@Test
	public void testWithWhiteBox() {
		WhiteBoxExample wb = new WhiteBoxExample();
		Whitebox.setInternalState(wb, "message", "overwritten the message.");
		
		assertTrue(wb.getMessage().equals("overwritten the message."));
	}
}
