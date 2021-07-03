package practice.mock.mockito.example3;

import static org.mockito.Mockito.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;
import practice.mock.mockito.example3.Member;
import practice.mock.mockito.example3.PointCard;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

public class MemberTest {
	@Spy
	PointCard pointCardMock = new PointCard();
	
	@InjectMocks
	Member memberMock = new Member();
	
	@Before
	public void setup() {
	    MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testGetMemberNameAndPointWithSpy() {
		doReturn(7777L).when(pointCardMock).getPoint();
		
		assertThat(memberMock.getMemberNameAndPoint(), is("hoge_7777"));
	}
}
