package test.java.practice.mock.mockito.example1;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.RETURNS_DEEP_STUBS;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import main.java.practice.mock.mockito.example1.Member;
import main.java.practice.mock.mockito.example1.PointCard;

import org.junit.Test;

public class MemberTest {	
	@Test
	public void testGetMemberInfoWithoutMock() {
		Member member = new Member(1, "hoge");
		
		assertThat(member.getPointCard().getPoint(), is(1000L));
	}
	
	@Test
	public void testGetMemberInfoWithMock() {
		Member member = mock(Member.class);
		PointCard pointCard = new PointCard(1, "hoge", 2000L);
		
		when(member.getPointCard()).thenReturn(pointCard);
		
		assertThat(member.getPointCard(), is(pointCard));
		assertThat(pointCard.getPoint(), is(2000L));
	}
	
	@Test
	public void testGetMemberInfoWithNestedObjectMock() {
		Member member = mock(Member.class, RETURNS_DEEP_STUBS);
		
		when(member.getPointCard().getPoint()).thenReturn(3000L);
		
		assertThat(member.getPointCard().getPoint(), is(3000L));
	}
}
